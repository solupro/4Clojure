(= (#(clojure.set/difference %1 (clojure.set/difference %1 %2)) #{0 1 2 3} #2 3 4 5})
   #{2 3})

(= ((comp set filter) #{0 1 2} #{3 4 5}) #{})
