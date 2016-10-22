(= (#(apply merge (map (fn [k v] {k v}) %1 %2)) [:a :b :c] [1 2 3])
   {:a 1, :b 2, :c 3})

(= (#(apply hash-map (interleave %1 %2)) [1 2 3 4] ["one" "two" "three"])
   {1 "one", 2 "two", 3 "three"})
