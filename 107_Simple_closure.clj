(= 256 (((fn [power]
           (fn [base]
             (loop [acc 1 n power]
               (if (zero? n)
                 acc
                 (recur (* acc base) (dec n)))))) 2) 16),
   (((fn [power]
       (fn [base]
         (loop [acc 1 n power]
           (if (zero? n)
             acc
             (recur ( * acc base) (dec n)))))) 8) 2))

(= [1 8 27 64] (map (partial (fn [n x] (apply * (repeat n x))) 3) [1 2 3 4]))
