(= (#(mapcat (fn [x] (repeat 2 x)) %) [1 2 3]) '(1 1 2 2 3 3))

(= (#(interleave % %) [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))

(= (#(sort (into % %)) [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
