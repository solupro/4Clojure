(= (#(apply str 
       (interpose ","
          (filter (fn [x] (= 0.0 (mod (Math/sqrt x) 1)))
                  (map (fn [x] (Integer/parseInt x)) 
                       (clojure.string/split % #",")))))
      "4,5,6,7,8,9")
   "4,9")

(= ((fn [s]
     (let [nums (map #(Integer/parseInt %) (.split s ","))
           p2 #(* % %)
           sqs (filter (fn [n] (= n (p2 (int (Math/sqrt n))))) nums)]
       (apply str (interpose \, sqs))))
    "15,16,25,36,37")
   "16,25,36")
