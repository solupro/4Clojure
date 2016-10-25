(= (#(clojure.set/union (clojure.set/difference %1 %2) (clojure.set/difference %2 %1)) #{1 2 3 4 5 6} #{1 3 5 7})
   #{2 4 6 7})

(= (#(into (clojure.set/difference %1 %2) (clojure.set/difference %2 %1)) #{:a :b :c} #{})
   #{:a :b :c})
