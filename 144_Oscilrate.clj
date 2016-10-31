(= (take 3 ((fn [init & fns]
              (reductions #(%2 %1) init (cycle fns)))
            3.14 int double)) [3.14 3 3.0])
