(= (mapcat #(conj '() %2 %1) [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))

(= (#(flatten (map vector %1 %2)) [1 2] [3 4 5 6]) '(1 3 2 4))

(= ((fn [s1 s2]
      (flatten (map list s1 s2))) [1 2 3 4] [5]) [1 5])
