(= (#(loop [x % c 0]
       (if (empty? x)
         c
         (recur (rest x) (inc c)))) '(1 2 3 3 1))
   5)

(= (reduce (fn [c _] (inc c)) 0 [[1 2] [3 4] [5 6]]) 3)
