(= 8 (#(count (filter (fn [n]
                        (< n (reduce (fn [v1 v2]
                                       (let [v1 v1, v2 (- (int v2) 48)]
                                         (+ v1 (* v2 v2)))) 0 (str n)))) %))))
