(= (#(loop [x %1 y %2 i 0]
       (if (= y i)
         (first x)
         (recur (rest x) y (inc i)))) '(4 5 6 7) 2)
   6)

(= (#(first (drop %2 %1)) [:a :b :c] 0) :a)

(= (#((vec %1) %2) [1 2 3  4] 1) 2)
