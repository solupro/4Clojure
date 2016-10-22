(= (set (#(vals (group-by type %)) [1 :a 2 :b 3 :c]))
   #{[1 2 3] [:a :b :c]})

(= (set ((comp vals (partial group-by type)) [:a "foo" "bar" :b]))
   #{[:a :b] ["foo" "bar"]})
