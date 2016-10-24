(= (#(remove (fn [s] (< (count s) %1))
             (reverse (loop [n %1 items %2 result '()]
                        (if (empty? items)
                          result
                          (recur n (nthrest items n) (conj result (take n items))))))) 2 (range 8)) '((0 1) (2 3) (4 5) (6 7)))

(= ((fn ptn [n s]
     (let [next-chunk (take n s)]
       (if (= (count next-chunk) n)
         (cons next-chunk (ptn n (drop n s)))))) 3 (range 8))
   '((0 1 2) (3 4 5)))
