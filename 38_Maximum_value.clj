(= ((comp last sorted-set) 1 8 3 4) 8)
(= ((fn [& xs]
      (reduce #(if (> %1 %2) %1 % 2) xs)) 30 20)
   30)
(= ((comp - (partial apply min) (partial map -) list) 45 67 11) 67)
