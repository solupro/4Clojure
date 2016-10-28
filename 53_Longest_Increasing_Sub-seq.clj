(= ((fn [items]
      (let [reslut 
            (last (sort-by count
                   (#(reductions (fn [coll n]
                                   (if (= n (inc (last coll)))
                                     (conj coll n)
                                     [n])) 
                                 [(first %)] (rest %)) items)))]
        (if (>= (count result) 2)
          result
          [])))
    [1 0 1 2 3 0 4 5])
   [0 1 2 3])
