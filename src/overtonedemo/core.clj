(ns overtonedemo.core (:use [overtone.synth.sampled-piano]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(definst trem [freq 2500 depth 30 rate 5 length 7]
  (* 0.3
     (line:kr 0 1 length FREE)
     (saw (+ freq (* depth (sin-osc:kr rate))))))
(def f (freesound 205789))
(f)
(def f-loop(f :rate 0.5 :loop? 1))

(kill)
(stop)


(trem) q
()


