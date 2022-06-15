/*
En el archivo main.pl desarrollamos nuestro programa principal.
Este contendrá las reglas, las cuales aplican a cualquier mundo en el cual se definan las relacion de padre(nombre_padre, nombre_hijo)
*/

:- include('base_conocimiento.pl'). % agregamos la base de conocimiento al programa.


main:-
        todos_los_hijos(juan), % Escribe en consola todos los hijos de la persona juan
        el_padre_de(rodrigo),  % Escribe en consola el padre de rodrigo
        el_abuelo_de(rodrigo), % Escribe en consola el abuelo de rodrigo
        ancestro(anacleto),nl,nl,  %E scribe en consola todos los ancestros de la persona anacleto.
        
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