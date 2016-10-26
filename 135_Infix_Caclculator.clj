(= 72 ((fn [init & args]
         (reduce (fn [result [op n]]
                   (op result n))
                 init 
                 (partition 2 args)))
       20 / 2 + 2 + 4 + 8 - 6 - 10 * 9))
