(= ((fn [f firstMap & args]
      (reduce
              (fn [init argMap]
                (reduce
                        (fn [m [k v]]
                          (if-let [old (m k)]
                            (assoc m k (f old v))
                            (assoc m k v)))
                  init argMap))
        firstMap args)) * {:a 2, :b 3, :c 4} {:a 2} {:b 2} {:c 5})
   {:a 4, :b 6, :c 20})
