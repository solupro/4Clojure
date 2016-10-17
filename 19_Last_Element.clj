(= ((fn [s] (first (take-last 1 s))) [1 2 3 4 5] 5))
(= (#(first (reverse %)) '(5 4 3)) 3)
(= ((comp first reverse) ["b" "c" "d"]) "d")
