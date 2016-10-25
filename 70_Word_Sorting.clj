(= ((comp (partial sort-by #(.toUpperCase %)) #(re-seq #"\w+" %))
    "Have a nice day.")
   ["a" "day" "Have" "nice"])

(= ((comp (partial sort-by #(.toUpperCase %)) #(re-seq #"\w+" %))
    "Fools fall for foolish follies.")
   ["fall" "follies" "foolish" "Fools" "for"])
