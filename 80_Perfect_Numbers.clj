(= ((fn [n]
      (= n (apply +
                  (filter #(zero? (mod n %)) (range 1 n)))))
    6)
   true)
