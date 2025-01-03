; Define some constants
(define pi 3.14159)
(define greeting "Hello from Scheme!")

; Define a simple function
(define (square x)
  (* x x))

; Define a function that uses recursion
(define (sum-list lst)
  (if (null? lst)
      0
      (+ (car lst) (sum-list (cdr lst)))))

; Define a function that uses cond
(define (describe-number n)
  (cond
    ((< n 0) "Negative")
    ((= n 0) "Zero")
    (#t "Positive")))

; Main function to test
(define (main)
  (display greeting)
  (newline)

  ; Test 'square'
  (display "square of 5 = ")
  (display (square 5))
  (newline)

  ; Test let
  (let ((a 2)
        (b 3))
    (display "(let ((a 2)(b 3)) (+ a b)) = ")
    (display (+ a b))
    (newline))

  ; Test sum-list
  (display "sum-list of '(1 2 3 4 5) = ")
  (display (sum-list '(1 2 3 4 5)))
  (newline)

  ; Test describe-number
  (display "describe-number of -1 = ")
  (display (describe-number -1))
  (newline)

  (display "describe-number of 0 = ")
  (display (describe-number 0))
  (newline)

  (display "describe-number of 5 = ")
  (display (describe-number 5))
  (newline)

  ; Test built-in list functions
  (define lst '(10 20 30))
  (display "car of '(10 20 30) = ")
  (display (car lst))
  (newline)

  (display "cdr of '(10 20 30) = ")
  (display (cdr lst))
  (newline)

  (display "cons 5 to '(10 20 30) = ")
  (display (cons 5 lst))
  (newline)

  (display "Is '() null? -> ")
  (display (null? '()))
  (newline)

  ; Test read
  (display "Type a number: ")
  (let ((num (read)))
    (display "You typed: ")
    (display num)
    (newline))
)