(= ((fn [items]
      (set (filter #(> (count %) 1)
                   (map set 
                        (map (fn [s]
                               (filter #(= (set s) (set %)) items)) items))))) ["meat" "mat" "team" "mate" "eat"])
   #{#{"meat" "team" "mate"}})

(= ((fn [w]
     (->> w
          (group-by sort)
          vals
          (filter #(> (count %) 1))
          (map #(apply hash-set %))
          (apply hash-set)))
    ["veer" "lake" "item" "kale" "mite" "ever"])
   #{#{"veer" "ever"} #{"lake" "kale"} #{"mite" "item"}})
