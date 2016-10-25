(= (take 5 ((fn myReduce
              ([f items]
               (myReduce f (first items) (rest items)))
              ([f result items]
               (lazy-seq
                         (if (empty? items)
                           (list result)
                           (myReduce f (f result (first items)) (rest items)))))) + (range)))
   [0 1 3 6 10])
