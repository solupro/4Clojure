(true? (#(and (contains? %2 %1) (nil? (%1 %2))) :a {:a nil :b 2}))
(false? (#(and (contains? %2 %1) (nil? (%1 %2))) :b {:a nil :b 2}))
(false? (#(not (%2 %1 true)) :c {:a nil :b 2}))
