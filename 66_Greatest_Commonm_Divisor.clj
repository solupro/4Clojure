(= (#(loop [x %1 y %2]
       (if (zero? y)
         x
         (recur y (mod x y)))) 2 4)
   2)

(= ((fn gcd [a b]
     (cond
       (= a b) a
       (> a b) (recur (- a b) b)
       :else (recur a (- b a)))) 10 5)
   5)

