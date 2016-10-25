(= ((fn [n]
      (take n (filter #(.isProbablePrime (BigInterger/valueOf %) 5)
                      (range)))) 2)
   [2 3])

(= ((fn [n]
      (->> (range) (drop 2) (filter (fn [x] (every? #(< 0 (mod x %)) (range 2 x)))) (take n))) 5)
   [2 3 5 7 11])
