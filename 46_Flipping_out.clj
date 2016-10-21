(= 3 ((#(fn [x y] (% y x)) nth) 2 [1 2 3 4 5]))

(= true (((fn [f]
            (fn [& ps] (apply f (reverse ps)))) >) 7 8))

(= 4 (((fn [f]
         (fn [l r] (f r l))) quot) 2 8))
