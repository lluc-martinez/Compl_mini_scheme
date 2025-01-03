; Test basic operations
(define x 10)
(define y 5)

; Test arithmetic
(display (+ x y))
(newline)
(display (* x y))
(newline)

; Test conditionals
(if (> x y)
    (display "x is greater")
    (display "y is greater"))
(newline)

; Test lists
(define lst '(1 2 3 4 5))
(display (car lst))
(newline)
(display (cdr lst))
(newline)

; Test boolean operations
(display (and #t #t))
(newline)
(display (or #f #t))
(newline)
