(= [21 6 1] (((fn [& fns]
                (fn [& args]
                  (reduce #(conj %1 (apply %2 args)) [] fns)))
              + max min) 2 3 5 1 6 4))

(= ["HELLO" 5] (((fn [& x]
                   (fn [& a]
                     (map #(apply % a) x)))
                 #(.toUpperCase %) count) "hello"))
