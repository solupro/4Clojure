(= 3
   (let [[f n] [+ (range 3)]] (apply f n))
   (let [[[f n] b] [[+ 1] 2]] (f n b))
   (let [[f n] [inc 2]] (f n)))
