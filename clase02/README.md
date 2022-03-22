# Ejemplo de una clase en C++

- En este ejemplo, la clase figura solo tiene datos y métodos públicos.
- El constructor se encarga de crear los objetos, sean estos creados en cualquier tipo de segmento de memória (heap o stack)
- Si el objeto es creado en la memoria stack, su destrucción es automática al salir del ámbito.
- Si el objeto es creado en la memoria heap, su destrucción debe ser explicita utilizando el operador unario ```delete```. Verifique que pasa si no agrega el operado delete al objeto a.
- Observe que sucede al compilar este codigo cuando ```void metodo_privado()``` es invocado en la función main.

Para compilar utilice el comando ```g++ main.cpp figura.cpp -o main.o```