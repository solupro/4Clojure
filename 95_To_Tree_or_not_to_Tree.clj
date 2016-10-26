(= ((fn tree? [root]
     (or (nil? root)
         (and (sequential? root)
              (= 3 (count root))
              (every? tree? (rest root))))) '(:a (:b nil nil)))
   false)

(= ((fn [root]
      (every? #(or (nil? %)
                   (and (sequential? %)
                        (= 3 (count %))))
              (tree-seq #(and (sequential? %)
                              (= 3 (count %)))
                              rest root))) [1 nil [2 [3 nil nil] [4 nil nil]]])
   true)
