(= (#(set (for [x %1 y %2]
            [x y])) #{1 2 3} #{4 5})
   #{[1 4 [1 5] [2 4] [2 5] [3 4] [3 5]})