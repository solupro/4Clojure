(= (#(apply * (range 1 (inc %))) 1) 1)
(= (#(reduce * (take-while pos? (iterate dec %))) 3) 6)
