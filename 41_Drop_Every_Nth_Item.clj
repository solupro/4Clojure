(= ((fn [item x] (remove #(= 0 (mod (inc (.indexOf item %)) x)) item)) 
    [1 2 3 4 5 6 7 8] 3)
   [1 2 4 5 7 8])

(= (#(flatten (partition-all (dec %2) %2 %1)) [:a :b :c :d :e :f] 2)
   [:a :c :e])

