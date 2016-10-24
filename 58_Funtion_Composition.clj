(= [3 2 1] (((fn [& fns]
               (let [[lf & lfs] (reverse fns)]
                 (fn [& args]
                   (reduce #(%2 %1) (apply lf args) lfs)))) rest reverse)
            [1 2 3 4]))

(= true (((fn [& fns]
            (let [[lf & lfs] (reverse fns)]
              (fn [& args]
                (reduce #(%2 %1) (apply lf args) lfs))))
          zero? #(mod % 8) +) 3 5 7 9))
