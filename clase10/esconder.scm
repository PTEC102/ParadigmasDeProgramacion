


(define (printear n a lis)
  (display a)
  (display " ")
  (esconder n lis)
)

(define (esconder n lis) 
  (if (null? lis) 
      0
      (if (= n (car lis))
        (esconder n (cdr lis))
        (printear n (car lis) (cdr lis))
      )
  )  
)
(define data (list 1 2 3 1 5))

(esconder 1 data)
(newline)