; Test extended features

; define constants
(define greeting "Welcome to Extended Scheme Tests!")
(define answer 42)

; define a function that uses recursion to compute factorial
(define (factorial n)
  (if (<= n 1)
      1
      (* n (factorial (- n 1)))))

; define a function that tests multiple conditions
(define (sign x)
  (cond
    ((< x 0) "Negative")
    ((= x 0) "Zero")
    (#t "Positive")))

; define a function that uses let and recursion
(define (count-down start)
  (let ((n start))
    (if (< n 0)
        '()
        (cons n (count-down (- n 1))))))

; define a "main" that exercises the above
(define (main)
  (display greeting)
  (newline)

  (display "The answer is: ")
  (display answer)
  (newline)

  (display "Factorial of 5 = ")
  (display (factorial 5))
  (newline)

  (display "sign of -10 = ")
  (display (sign -10))
  (newline)

  (display "sign of 0 = ")
  (display (sign 0))
  (newline)

  (display "sign of 7 = ")
  (display (sign 7))
  (newline)

  (display "count-down from 5 = ")
  (display (count-down 5))
  (newline)

  (display "Type two numbers for 'read' test: ")
  (let ((val1 (read))
        (val2 (read)))
    (display "You typed: ")
    (display val1)
    (display " and ")
    (display val2)
    (newline)
    (display "Their product is: ")
    (display (* val1 val2))
    (newline))

  (display "Type a number for factorial: ")
  (let ((val (read)))
    (display "Factorial of ")
    (display val)
    (display " = ")
    (display (factorial val))
    (newline))
)