(= :map (#(cond
            (= % (conj % {})) :map
            (= (conj % 1 2) (cons 2 (cons 1 %))) :list
            (= (count (conj % 1)) (count (conj % 1 1))) :set
            :else :vector) {:a 1, :b 2}))

(= :list (condp = (nth (str %) 0)
           \{ :map
           \c :list
           \[ :vector
           \# :set) (range (rand-int 20)))

(= :vector (comp #(cond
                    (= % {}) :map
                    (= % #{}) :set
                    (= (conj % 1 2) [1 2]) :vector
                    :else :list)
                 empty) [1 2 3 4 5 6])
