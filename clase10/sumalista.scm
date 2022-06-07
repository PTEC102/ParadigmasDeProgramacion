(define (sumalista l)
  (if (null? l)
      0
      (+ (car l)(sumalista (cdr l)))
      )
  )

(sumalista (list 1 2 3 4))
