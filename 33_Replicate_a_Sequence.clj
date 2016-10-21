(= (#(mapcat (fn [x] (repeat %2 x)) %1) [1 2 3] 2) '(1 1 2 2 3 3))

(= (#(if (= %2 1) %1
       (apply interleave (take %2 (repeat %1)))) 
         [[1 2] [3 4]] 2)
   '([1 2] [1 2] [3 4] [3 4]))
