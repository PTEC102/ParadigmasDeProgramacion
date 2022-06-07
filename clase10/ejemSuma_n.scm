#lang scheme

(define (sum_n n r)    
    (if (<= n 0)
        r
        (sum_n (- n 1) (+ n r))
    )
)
