(= ((fn [s]
      (set (reduce #(concat %1 (map (fn [x] (set (conj x %2))) %1)) #{#{}} s))) #{1 :a})
   #{#{1 :a} #{:a} #{} #{1}})
