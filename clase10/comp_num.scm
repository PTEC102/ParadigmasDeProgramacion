(let ([x 3][y 2]) (if (> x y) x y))



(define (f x y) (if (> x y) x y))



(define (pick-random x y) (if (> (random) 0.5) x y))