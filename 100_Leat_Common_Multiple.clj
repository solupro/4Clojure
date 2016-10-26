(== ((fn [init & args]
      (reduce (fn [x y]
                ((fn GCD [a b]
                   (if (zero? (mod a b))
                     (/ (* x y) b)
                     (GCD b (mod a b)))) x y)) init args)) 2 3) 6)

(== ((fn [& xs]
       (/ (apply * xs)
          (reduce #(if (zero? %2) % (recur %2 (mod % %2))) xs))) 5 3 7)
    105)
