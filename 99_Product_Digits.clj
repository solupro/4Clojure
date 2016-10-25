(= ((fn [x y] (map #(Interger/parseInt (str %)) (str (* x y)))) 1 1)
   [1])

(= ((comp (partial map #(- (int %) 48)) str *) 99 9)
   [8 9 1])
