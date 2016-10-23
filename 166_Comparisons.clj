(= :gt (#(cond
           (%1 %2 %3) :lt
           (%1 %3 %2) :gt
           :else :eq) < 5 1))

(= :eq (#(cond
           (%1 %2 %3) :lt
           (%1 %3 %2) :gt
           :else :eq) 
         (fn [x y] (< (count x) (count y))) "pear" "plum"))
