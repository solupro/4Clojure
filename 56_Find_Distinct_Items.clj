(= ((fn [items]
      (reduce #(if (= -1 (.indexOf %1 %2))
                 (conj %1 %2)
                 %1) [] items)) 
    [1 2 1 3 1 2 4])
   [1 2 3 4])

(= (#(sort-by (fn [i] (.indexOf % i)) (map first (group-by identity %)))
              [:a :a :b :b :c :c])
   [:a :b :c])

