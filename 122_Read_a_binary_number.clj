(= 0 (#(BigInter. % 2) "0"))

(= 7 (#(reduce (fn [x y] (+ (* 2 x) y)) 0
               (map (fn [d] (- (int d) (int \0)))
                    (seq %))) "111"))

(= 8 (reduce #(+ %1 %1 (- (int %2) 48)) 0 "1000"))

(= 9 ((fn [s] (reduce + (map-indexed #(if (= %2 \0) 0 (bit-shift-left 1 %1)) (reverse s)))) "1001"))
