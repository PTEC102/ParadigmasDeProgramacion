# Programación de listas en prolog

Vamos a utilizar [onlineGDB](https://www.onlinegdb.com/) como interprete de prolog. Entramos a la URL y seleccionamos prolog como lenguaje, en la esquina superior derecha. Veremos la utilización de listas.

# Guardar en Lista

Para agregar elementos a una lista, se puede utilizar el procedimiento `append` definida el prolog, la cual requiere de 3 parámetros `(L1, L2, L3)`. 
El procedimiento `append` toma el contenido de la lista L1 y L2, y lo almacena en L3.

El procedimiento suele estar definido de la siguiente manera.
```prolog
append([],L,L).
append([H|T],L2,[H|L3]) :- append(T,L2,L3).
```

Podemos ver cómo agregar elementos en `Z`
```prolog
append([a], [1,2,3], Z).
% write(Z) -> [a,1,2,3]

append([b,c], Z, Y).
% write(Y) -> [b,c,a,1,2,3]
```
Esto guarda los elementos `a,1,2,3` en `Z`, luego `b,c` y `Z` en `Y`.

# Member

Dada una lista podemos preguntar si un elemento existe o no en la lista. Para esto podemos utilizar el procedimiento `member`

```prolog
X = [a,b,c],
(member(a,X),write('Si');write('No')),
% Si
(member(d,X),write('Si');write('No')).
% No
```

# Not Member

Muy similar al punto anterior podemos definir un procedimiento para saber si un elemento no pertenece en un lista.

```prolog
not_member(_, []) :- !.
not_member(X, [Head|Tail]) :-
     X \= Head,
    not_member(X, Tail).
```
Este procedimiento se puede utilizar como

```prolog
X = [a,b,c],
(not_member(a,X),write('Si');write('No')),
% No
(not_member(d,X),write('Si');write('No')).
% Si
```

# Ejemplo 1

Utilizando el ejemplo que se encuentra en la carpeta 09, se realizará el ejemplo de un ancestro pero guardando los elemento en una lista.

```prolog
ancestroLista(HIJO, Z) :- 
    padre(X, HIJO) ->
        write('Un acestro de '),write(HIJO),write(' es '),
        write(X),nl,
        append([X],Z,Y),write(Y),nl,
        ancestroLista(X,Y);write('fin').
```

Al evaluar la regla `ancestroLista(anacleto, [])`, la salida será:
```
Un acestro de anacleto es celino
[celino]                         
Un acestro de celino es rodrigo
[rodrigo,celino]
Un acestro de rodrigo es alberto
[alberto,rodrigo,celino]
Un acestro de alberto es juan
[alberto,rodrigo,celino]
```
# Ejemplo 2

El siguiente ejemplo nos permite agregar elementos que no se encuentren en una lista.

```prolog
append_if_not_in_list(X,Y,Z) :-
    (not_member(X,Y),append([X],Y,Z);append([],Y,Z)).
```

# Programa Lab 9

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
        %ancestro(anacleto),nl,nl,
        ancestroLista(anacleto, []),nl
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
        ancestro(X);write('fin').
 
ancestroLista(HIJO,Z) :- 
    padre(X, HIJO) ->
        write('Un acestro de '),write(HIJO),write(' es '),
        write(X),nl,
        append([X],Z,Y),write(Y),nl,
        ancestroLista(X,Y);write('fin').

:- main.

```
