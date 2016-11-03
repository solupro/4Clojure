(= ((fn [[_ rl rr]]
      (letfn [(mirror [[v l r]] 
                [v (if r (mirror r)) (if l (mirror l))])]
        (= rl (mirror rr))))
    '(:a (:b nil nil) (:b nil nil)))
   true)
