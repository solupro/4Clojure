(= (#(zipmap %2 (repeat %1)) 0 [:a :b :c]) {:a 0 :b 0 :c 0})
(= (#(zipmap %2 (repeat %1)) "x" [1 2 3]) {1 "x" 2 "x" 3 "x"})
(= (#(zipmap %2 (repeat %1)) [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]})
