(= 14 ((fn [s]
        (let [rm (zipmap "MDCLXVI" [1000 500 100 50 10 5 1]),
              m (reverse (map #(apply + %) (partition-by identity (map #(rm %) s))))]
          (reduce #((if (< %1 %2) + -) %1 %2) m))) "XIV"))

(= 827 ((fn [x]
          (let
            [R {\I 1, \V 5, \X 10, \L 50, \C 100, \D 500, \M 1000}]
            (reduce +
                    (map
                         (partial reduce #(- (R %2) %1) 0)
                      (re-seq #"IV|IX|XL|XC|XM|CD|CM|[IVXLCDM]" x)))))
        "DCCCXXVII"))
