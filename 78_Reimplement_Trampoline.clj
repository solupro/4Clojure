(= (letfn [(triple [x] #(sub-two (* 3 x)))
           (sub-two [x] #(stop? (- x 2)))
           (stop? [x] (if (> x 50) x #(triple x)))]
     ((fn [f & args]
        (loop [r (apply f args)]
          (if (fn? r)
            (recur (r))
            r))) triple 2))
   82)
