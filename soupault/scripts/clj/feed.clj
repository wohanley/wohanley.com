(ns feed
  (:require
   [clojure.tools.cli :as cli]
   [babashka.pods :as pods]
   [cheshire.core :as json]))

(pods/load-pod "bootleg")
(require '[pod.retrogradeorbit.bootleg.utils :as bl])

(def options
  (:options
   (cli/parse-opts
    *command-line-args*
    [["-i" "--index FILE" "File containing post metadata"]
     ["-o" "--out FILE" "Destination file for Atom feed"]])))

(def index (-> (or (:index options) *in*) slurp json/parse-string))

(def feed
  (-> [:feed {:xmlns "http://www.w3.org/2005/Atom"}
       [:title "wohanley"]
       [:link {:rel "alternate" :href "https://wohanley.com/posts"}]
       [:link {:rel "self" :href "https://wohanley.com/feed.xml" :type "application/atom+xml"}]
       [:id "http://wohanley.com"]
       [:author
        [:name "William O'Hanley"]
        [:uri "https://wohanley.com"]]]
      (concat
       (mapv
        (fn [entry]
          [:entry
           [:title (get entry "title")]
           [:link {:rel "alternate" :href (str "https://wohanley.com" (get entry "url")) :type "text/html"}]
           [:id (get entry "id")]
           [:updated (get entry "published")]
           [:content {:type "html"} (get entry "excerpt")]])
        index))
      (bl/convert-to :xml)))

(if (:out options)
  (spit (:out options) feed)
  (println feed))
