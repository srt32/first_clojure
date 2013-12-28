(ns codeschool.core-test
  (:require [clojure.test :refer :all]
            [codeschool.core :refer :all]))

(deftest addittion-test
  (is (= 5 (add 3 2)) "3 added to 2 should be 5")
)
