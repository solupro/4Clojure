(= (reduce #(assoc %1 %2 (inc (%1 %2 0))) {} [1 1 2 3 2 1 1])
   {1 4, 2 2, 3 1})

(= ((comp #(zipmap (keys %) (map count (vals %))) (partial group-by identity)) [:b :a :b :a :b])
   {:a 2, :b 3})
