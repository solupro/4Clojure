(= (#(= (apply + (map count %))
        (count (reduce (fn [x y] (into x y)) #{} %)))
        #{#{\U} #{\s} #{\e \R \E} #{\P \L} #{\.}})
   true)

(= (#(apply distinct? (apply concat %))
            #{#{:a :b :c :d :e}
              #{:a :b :c :d}
              #{:a :b :c}
              #{:a :b}
              #{:a}})
   false)

