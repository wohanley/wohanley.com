(ns index
  (:require
   [babashka.pods :as pods]
   [cheshire.core :as json]))

(pods/load-pod 'retrogradeorbit/bootleg "0.1.9")
(require '[pod.retrogradeorbit.bootleg.utils :as bl])


(def index (-> *in* slurp json/parse-string))

(println
 (-> [:html
      [:head]
      (vec
       (concat
        [:body
         [:div
          [:span.breadcrumb [:a {:href "/"} "home"]]
          [:span.breadcrumb "posts"]]]
        (mapv
         (fn [entry]
           [:div
            [:h2 [:a {:href (str "https://wohanley.com" (get entry "url"))} (get entry "title")]]
            (get entry "excerpt")
            #_(TODO date)])
         index)))]
     (bl/convert-to :html)))
