#lang scheme

(define (factorial n)
    (cond ((= n 0) 1)
          (else (* n (factorial (- n 1))))))

(factorial 5)



(define (factorialejm2 n)
  (fact-iter 1 n))

(define (fact-iter product n)
  (if (< n 2)
      product
      (fact-iter (* product n)
                 (- n 1))))

(factorialejm2 5)