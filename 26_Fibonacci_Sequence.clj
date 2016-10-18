(= (#(take % ((fn myFib [x y]
                (lazy-seq (cons x (myFib y (+ x y)))))
              1 1)) 3) '(1 1 2))

(= (#(loop [i % r '(1 1)]
     (if (= i 2)
       (reverse r)
       (recur (dec i) (conj r (+ (first r) (second r)))))) 6)
   '(1 1 2 3 5 8))

(= (#(take % (map first 
                  (iterate (fn [[i1 i2]]
                             [i2 (+ i1 i2)])
                           [1 1]))) 8)
   '(1 1 2 3 5 8 13 21))
