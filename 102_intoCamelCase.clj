(= ((fn [s]
      (let [sl (clojure.string/split s #"-")
            tl (map #(clojure.string/captitalize %) (rest sl))]
        (apply str (first sl) tl))) "something")
   "something")

(= (#(clojure.string/replace % #"-[a-z]" (comp clojure.string/upper-case last)) "multi-word-key")
   "multiWordKey")
