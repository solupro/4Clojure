(= (#(reverse (loop [start %1 end %2 result '()]
                (if (> end start)
                  (recur (inc start) end (conj result start))
                  result))) 1 4)
   '(1 2 3))

(= (#(take (- %2 %1) (iterate inc %1)) -2 2) '(-2 -1 0 1))

(= (#(fn [from to]
       (take-while #(< % to)
                   (iterate inc from))) 5 8)
   '(5 6 7))
