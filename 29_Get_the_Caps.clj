(= (#(apply str (re-seq #"[A-Z]" %)) "HeLlO, WoRlD!") "HLOWRD")

(empty? (#(apply str (filter (set (map char (range 65 91))) %))
                 "nothing"))

(= (#(clojure.string/replace % #"[^A-Z]+" "") "$#A(*&987Zf") "AZ")
