(= (take 5 ((fn lazys [f x]
              (cons x (lazy-seq (lazys f (f x))))) #(* 2 %) 1))
   [1 2 4 8 16])

(= (take 100 (#(reductions (fn [i _] #(%1 i)) (repeat %2)) inc 0))
   (take 100 (range)))
