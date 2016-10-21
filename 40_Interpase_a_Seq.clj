(= (#(loop [c %1 item %2 result []]
       (cond 
         (empty? item) result
         (= 1 (count item)) (recur c (rest item) (conj result (first item)))
         :else (recur c (rest item) (conj result (first item) c))))
           0 [1 2 3])
   [1 0 2 0 3])

(= (apply str (#(drop-last (interleave %2 (repeat %1))) ", " ["one" "two" "three"])) "one, two, three")

(= ((fn [s x] (cons (first x) (mapcat #(list s %) (next x)))) :z [:a :b :c :d])
   [:a :z :b :z :c :z :d])
