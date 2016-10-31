(= [1 2 3 4 5 0 1]
   ((fn [n base]
      (if (< n base)
        [n]
        (loop [n n, result '()]
          (if (zero? n)
            result
            (recur (quot n base) (conj result (mod n base)))))))
    1234501 10))

(= [1 0 0 1]
   (fn base [x b]
     (if (< x b)
       [x]
       (conj (base (quot x b) b) (mod x b)))) 9 2)
