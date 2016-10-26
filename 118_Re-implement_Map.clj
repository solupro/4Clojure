(= [1000000 1000001]
   (->> ((fn myMap [f items]
           (if (not-empty items)
             (lazy-seq (cons (f (first items)) (myMap f (rest items))))))
         inc (range))
        (drop (dec 1000000))
        (take 2)))
