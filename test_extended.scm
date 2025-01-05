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

; define a function that uses higher-order functions
(define (apply-twice f x)
  (f (f x)))

; define a function to double a number
(define (double x)
  (* 2 x))

; define the map function
(define (map func lst)
  (cond
    ((null? lst) '())
    (#t (cons (func (car lst)) (map func (cdr lst))))))

; define the filter function
(define (filter pred lst)
  (cond
    ((null? lst) '())
    ((pred (car lst)) (cons (car lst) (filter pred (cdr lst))))
    (#t (filter pred (cdr lst)))))

; define a function to test map
(define (map-test)
  (map double '(1 2 3 4)))

; define a function to test filter
(define (filter-test)
  (filter (lambda (x) (> x 2)) '(1 2 3 4)))

; define a function to test let with multiple bindings
(define (let-test)
  (let ((a 10)
        (b 20)
        (c 30))
    (+ a b c)))

; define a lambda function to square a number
(define square (lambda (x) (* x x)))

; define a function to test map with lambda
(define (map-lambda-test)
  (map (lambda (x) (* x x)) '(1 2 3 4)))

; define a function to test filter with lambda
(define (filter-lambda-test)
  (filter (lambda (x) (= (mod x 2) 0)) '(1 2 3 4)))

; define a function to test list operations with empty lists
(define (empty-list-test)
  (let ((empty '()))
    (display "car of empty list: ")
    (display (car empty))
    (newline)
    (display "cdr of empty list: ")
    (display (cdr empty))
    (newline)
    (display "cons 1 to empty list: ")
    (display (cons 1 empty))
    (newline)
    (display "null? empty list: ")
    (display (null? empty))
    (newline)))

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

  (display "apply-twice double 3 = ")
  (display (apply-twice double 3))
  (newline)

  (display "map-test = ")
  (display (map-test))
  (newline)

  (display "filter-test = ")
  (display (filter-test))
  (newline)

  (display "let-test = ")
  (display (let-test))
  (newline)

  (display "map-lambda-test = ")
  (display (map-lambda-test))
  (newline)

  (display "filter-lambda-test = ")
  (display (filter-lambda-test))
  (newline)

  (empty-list-test)
)