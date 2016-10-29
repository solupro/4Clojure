(= ((fn [n]
     (if (= 1 n)
       1
       (count
        (filter
          #(= 1 (loop [a n, b %]
                  (if (zero? b)
                    a
                    (recur b (mod a b))))) (range 1 n))))) 1)
   1)
