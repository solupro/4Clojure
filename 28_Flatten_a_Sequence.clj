(= (#(reverse (reduce (fn myFlatten [coll item]
                        (if (coll? item)
                          (reduce myFlatten coll item)
                          (conj coll item))) '() %))
   '((1 2) 3 [4 [5 6]]))
   '(1 2 3 4 5 6))

(= ((fn myFlatten [x]
      (if (coll? x)
        (mapcat myFlatten x)
        [x]))
    ["a" ["b"] "c"])
   '("a" "b" "c"))

(= (#(filter (complement sequential?)
             (rest (tree-seq sequential? seq %)))
             '((((:a)))))
   '(:a))
