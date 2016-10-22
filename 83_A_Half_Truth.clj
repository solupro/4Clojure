(= false ((fn [& args]
            (let [x (set args)]
              (cond
                (= 1 (count x)) false
                (some true? x) true
                :else false))) false false))

(= true (not= true false))

(= false ((fn [& vs}
               (true? (and (some not vs)
                           (some identity vs)))) true))
