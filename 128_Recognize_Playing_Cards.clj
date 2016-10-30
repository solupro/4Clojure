(= {:suit :diamond :rank 10}
   (#(let [suitMap {\H :heart, \C :club, \D :diamond, \S :spades}
           rankMap (zipmap "23456789TJQKA" (range 13))]
       {:suit (suitMap (first %)), :rank (rankMap (last %))}) "DQ"))
