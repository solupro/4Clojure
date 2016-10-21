(= (#(list (take %1 %2) (drop %1 %2)) 3 [1 2 3 4 5 6])
   [[1 2 3] [4 5 6]])

(= ((juxt take drop) 1 [:a :b :c :d]) [[:a] [:b :c :d]])
