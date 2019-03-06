(defproject overtonedemo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [overtone/overtone "0.10.3"]]
  ;;:repl-options {:init-ns overtonedemo.core}
  ;;:main overtonedemo.core/overtone
  )

;;STAR TREK THEME SONG
;; (defn saw2 [music-note]
;; 	(saw-wave (midi->hz (note music-note))))

;; (defn play-chord [a-chord]
;;   (doseq [note a-chord] (saw2 note)))

 ;; (defn chord-progression-time []
 ;;  (let [time (now)]
 ;;    (at time (play-chord (chord :D4 :major)))
 ;;    (at (+ 1000 time) (play-chord (chord :D4 :major)))
 ;;    (at (+ 1750 time) (play-chord (chord :E4 :major)))
 ;;    (at (+ 2250 time) (play-chord (chord :F4 :major)))
 ;;    (at (+ 2750 time) (play-chord (chord :E4 :major)))
 ;;    (at (+ 3250 time) (play-chord (chord :C4 :major)))
 ;;    (at (+ 3750 time) (play-chord (chord :D4 :major)))
 ;;    (at (+ 4750 time) (play-chord (chord :E4 :major)))
 ;;    (at (+ 5250 time) (play-chord (chord :F4 :major)))
 ;;    (at (+ 5750 time) (play-chord (chord :E4 :major)))
 ;;    (at (+ 6250 time) (play-chord (chord :G4 :major)))
 ;;    (at (+ 6750 time) (play-chord (chord :D4 :major))))


;;CRAP MUSIC V1.0
;; (def fat-beat (sample (freesound-path 29548)))
;; (def soothing (sample (freesound-path 315754)))
;; (def musicbox (sample "C:/Users/Parikshith/Desktop/testing.wav"))
;; (def gong (sample (freesound-path 387715)))
;; (def wrench (sample (freesound-path 376596)))
;; (def pinosmooth (sample (freesound-path 325611)))
;; (def remove (sample (freesound-path 117856)))
;; (def orc (sample (freesound-path 432666)))

;; (def or (orc :amp 2 :rate 1 :loop? 1))
;; (kill or)

;; (def so (soothing :amp 0.4 :rate 2 :loop? 1))
;; (kill so)

;; (def fb (fat-beat :amp 1 :rate 0.75 :loop? 1 :level 0))
;; (kill fb)

;; (def mb1 (musicbox :amp 0.5  :rate 1 :loop? 1))
;; (def mb2 (musicbox :amp 0.1 :rate 2 :loop? 2))
;; (def mb3 (musicbox :rate 3 :loop? 3))
;; (kill mb1)
;; (kill mb2)
;; (stop)

;; (def f (gong :amp 1 :rate 2.55 :loop? 1 :sustain 100))
;; (kill f)

;; (def w (wrench :rate 0.4  :loop? 1))
;; (kill w)


;; (recording-start "C:/Users/Parikshith/Desktop/v2.wav")
;; (recording-stop)
