(= {:a [1 2 3], :b [], :c [4]}
   ((fn [items]
      (let [l (partition-by type
                            (reduce 
                                    #(if (and (keyword? (last %1))
                                              (keyword? %2))
                                       (conj %1 nil %2)
                                       (conj %1 %2))
                              [] items))]
        (loop [l l, resutl {}]
          (if (empty? o)
            result
            (recur (drop 2 l)
                   (conj result
                         (let [[[x] y & _] l]
                           (if (nil? (first y))
                             (hash-map x [])
                             (hash-map x (vec y))))))))))
    [:a 1 2 3 :b :c 4]))

(= {:a [1], :b [2]}
   ((fn [x]
      (apply hash-map (map #(if (keyword? (first %))
                              (first %)
                              (keep identity %))
                           (partition-by #(when (keyword? %) %)
                                         (interpose nil x)))))
    [:a 1 :b 2]))

