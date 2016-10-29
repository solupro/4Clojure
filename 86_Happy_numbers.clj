(= ((letfn [(newNum [n]
          (apply + (map #(* % %)
                        (map #(Integer/parseInt (str %)) (str n)))))]
  (fn [arg]
    (loop [n arg, result #{}]
      (cond
        (= 1 n) true
        (result n) false
        :else (recur (newNum n) (conj result n)))))) 7) true)
