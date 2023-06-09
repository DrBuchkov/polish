(ns polish.utils)

(defn take-until-distinct [coll]
  (letfn [(helper-fn [seen coll]
            (if (empty? coll)
              []
              (let [x (first coll)
                    xs (rest coll)]
                (if (contains? seen x)
                  []
                  (cons x (helper-fn (conj seen x) xs))))))]
    (helper-fn #{} coll)))
