# Programacion lógica en prolog

Vamos a utilizar [onlineGDB](https://www.onlinegdb.com/) como interprete de prolog. Entramos a la URL y seleccionamos prolog como lenguaje, en la esquina superior derecha.

# Sintaxis básica 

Tambien podemos definir variables utilizando identificadores en mayuscula. Recordemos que en prolog, la coma `,` es un operador and y el punto y coma `;` representa un operador or. Con esto, podemos  definir una sentencia if, de la siguiente manera

```prolog
X = 10,
X == 10 ->
	write('X si vale 10') % si el if es verdadero
;
	write('X no vale 10') % si la sentencia es falsa
```


# Hechos 
En prolog, podemos definir hechos, cosas que son verdad en nuestro mundo, y reglas, las cuales se definen por inferencias.

En el siguiente código, se definen como hechos que `juan` es padre de `jose`, `maria` y `pedro`.
```prolog
padre(juan, alberto).
padre(juan, jose).
padre(juan, pedrito).
padre(alberto, rodrigo).
padre(rodrigo, celino).
padre(celino, anacleto).
```



# Reglas

Luego, es posible definir a traves de una regla, un procedimiento que imprima en consola si el padre de alguien, de una variable HIJO

```prolog
el_padre_de(HIJO) :- 
    padre(X,HIJO),
    write('El padre de '), write(HIJO), write(' ES '),write(X).

```
Evaluamos esta regla como `el_padre_de(rodrigo)`, la salida será `El padre de rodrigo ES alberto`

Tambien, a traves de una regla de inferencia, es posible determinar el abuelo de un NIETO:
```prolog
el_abuelo_de(NIETO) :- 
    padre(X,NIETO),
    padre(Y,X),
    write('El abuelo de '),write(NIETO),write(' ES '), write(Y).

```
Evaluamos esta regla como `el_abuelo_de(rodrigo)`, la salida será `El abuelo de rodrigo ES juan`

Luego, para obtener toda una linea ancestral de una persona, es decir padre, del padre, del padre, del padre... etc. Podemos definir una regla recursiva.

```prolog
ancestro(HIJO) :- 
    padre(X, HIJO) ->
        write('Un acestro de '),write(HIJO),write(' es '),write(X),nl,
        ancestro(X).
```
Al evaluar la regla `ancestro(anacleto)`, la salida será:
```
Un acestro de anacleto es celino                                                                                                                
Un acestro de celino es rodrigo                                                                                                                 
Un acestro de rodrigo es alberto                                                                                                                
Un acestro de alberto es juan 
```

# Programa final

```prolog
padre(juan, alberto).
padre(juan, jose).
padre(juan, pedrito).
padre(alberto, rodrigo).
padre(rodrigo, celino).
padre(celino, anacleto).


main:-
        %todos_los_hijos(juan),
        %el_padre_de(rodrigo),
        %el_abuelo_de(rodrigo),
        ancestro(anacleto),nl,nl,
        
        halt.

todos_los_hijos(PADRE) :- 
    forall( padre(PADRE, X), (write(X),nl) ) .


el_padre_de(HIJO) :- 
    padre(X,HIJO),
    write('El padre de '), write(HIJO), write(' ES '),write(X).

el_abuelo_de(NIETO) :- 
    padre(X,NIETO),
    padre(Y,X),
    write('El abuelo de '),write(NIETO),write(' ES '), write(Y).

ancestro(HIJO) :- 
    padre(X, HIJO) ->
        write('Un acestro de '),write(HIJO),write(' es '),write(X),nl,
        ancestro(X).
 

:- main.

```
