(= 10 (((fn [f]
          (fn [& args]
            (reduce #(%1 %2) f args)))
        (fn [a]
          (fn [b]
            (fn [c]
              (fn [d]
                (+ a b c d))))))
       1 2 3 4))
