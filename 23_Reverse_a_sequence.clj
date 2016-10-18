(= (#(loop [coll % result []]
       (if (empty? coll)
         result
         (recur (drop-last coll) (conj result (last coll))))) [1 2 3 4 5])
   [5 4 3 2 1])

(= (reduce conj () (sorted-set 5 7 2 7)) '(7 5 2))

(= (#map (vec %) (range (dec (count %)) -1 -1)) 
   [[1 2] [3 4] [5 6]]
   [[5 6] [3 4] [1 2]])
