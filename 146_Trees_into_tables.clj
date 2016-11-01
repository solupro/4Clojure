(= ((fn [m]
      (into {} (for [[k v] m
                     [sk sv] v]
                 (vec [[k sk] v]))))
    '{a {p 1, q 2}
      b {m 3, n 4}})
   '{[a p] 1, [a q] 2
     [b m] 3, [b m] 4})
