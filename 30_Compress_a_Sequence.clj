(= (apply str (#(map first (partition-by identity %)) "Leeeeeerrroyyy"))
   "Leroy")

(= (#(loop [result [], input %]
       (cond
         (nil? input) result
         (= (last result) (first input)) (recur result (rest input))
         :else (recur (conj result (first input)) (rest input))))
   [1 1 2 3 3 2 2 3])
  '(1 2 3 2 3))

(= ((fn [x] (remove nil? (map #(if (= %1 %2) nil %1)) x (cons nil x)))
    [[1 2] [1 2] [3 4] [1 2]])
   '([1 2] [3 4] [1 2]))
