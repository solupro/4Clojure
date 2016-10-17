(= ((fn [l] (second (reverse l))) (list 1 2 3 4 5)) 4)
(= (#(second (reverse %)) ["a" "b" "c"]) "b")
(= ((comp second reverse) [[1 2] [3 4]) [1 2])
