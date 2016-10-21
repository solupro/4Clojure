(= ((fn [x items]
      (#(flatten (reverse (split-at (mod x (count %)) %)))
                 items)) 2 [1 2 3 4 5])
   '(3 4 5 1 2))

(= ((fn [n xs]
      (let [i (mod n (count xs))]
        (concat (drop i xs) (take i xs))))
    -4 '(:a :b :c))
   '(:c :a :b))
