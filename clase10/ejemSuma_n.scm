#lang scheme

(define (sum-n n r)    
    (if (<= n 0)
        r
        (sum-n (- n 1) (+ n r))
    )
)
