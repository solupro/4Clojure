(= ((fn [f items]
      (reduce #(let [k (f %2)]
                 (assoc %1 k (conj (get %1 k []) %2)))
              {}
              items)) #(> % 5) [1 3 6 8])
   {false [1 3], true [6 8]})

(= (#(apply merge-with concat (map (fn [x] {(%1 x) [x]}) %2))
            #(apply / %) [[1 2] [2 4] [4 6] [3 6]])
   {1/2 [[1 2] [2 4] [3 6]], 2/3 [[4 6]]})
