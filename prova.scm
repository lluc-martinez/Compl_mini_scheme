; programa que llegeix dos nombres i en calcula el seu màxim comú divisor

(define (mcd a b)
  (if (= b 0)
      a
      (mcd b (mod a b))))

(define (main)
  (display "Introdueix dos nombres: ")
  (let ((a (read))
        (b (read)))
    (display "El màxim comú divisor és: ")
    (display (mcd a b))
    (newline)))