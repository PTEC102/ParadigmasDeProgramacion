
main:-
        append([a],[1,2,3],Z1),write(Z1),nl,
        append([a,b],[b,c],Z2),write(Z2),nl,
        append_if_not_in_list(a,[b,c,d],Y1), write(Y1),nl,
        append_if_not_in_list(c,[b,c,d],Y2), write(Y2),nl,
        append_if_not_in_list(1,[2,3,0],Y3), write(Y3),nl,
        (member(b,Z),write('si');write('no')),nl,
        (not_member(b,Z),write('b no esta en Z');write('b si esta en Z')),nl,
        halt.


not_member(_, []) :- !.
not_member(X, [Head|Tail]) :-
     X \= Head,
    not_member(X, Tail).

append_if_not_in_list(X,Y,Z) :-
    (not_member(X,Y),append([X],Y,Z);append([],Y,Z)).
    
:- main.