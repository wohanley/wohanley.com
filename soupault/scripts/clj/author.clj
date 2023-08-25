(ns author
  (:require
   [babashka.pods :as pods]
   [clojure.zip :as zip]))

(pods/load-pod 'retrogradeorbit/bootleg "0.1.9")
(require '[pod.retrogradeorbit.bootleg.utils :as bl])
(require '[pod.retrogradeorbit.hickory.zip :as hkz])


(defn customize-hickory [zipper match? customize]
  (loop [loc zipper]
    (if (zip/end? loc)
      (zip/root loc)
      (if-let [_ (match? (zip/node loc))]
        (let [new-loc (zip/edit loc customize)]
          (when (not= (zip/node new-loc) (zip/node loc))
            (recur (zip/next new-loc))))
        (recur (zip/next loc))))))

(defn customize-page [page]
  (map
   (fn [hickory]
     (customize-hickory
      (hkz/hickory-zip hickory)
      #(= :author (:tag %))
      #(let [name (-> % :content first)]
         {:type :element
          :tag :span
          :attrs {:itemprop "author"
                  :itemscope nil
                  :itemtype "https://schema.org/Person"}
          :content [{:type :element
                     :tag :span
                     :attrs {:itemprop "name"}
                     :content [name]}]})))
   page))


(-> (slurp *in*)
    (bl/convert-to :hickory-seq)
    customize-page
    (bl/convert-to :html)
    println)
