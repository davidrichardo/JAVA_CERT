### Las variables pueden ser de dos tipos de Referencia y Primitivas y tener alcance Global y Local
### Los arreglos sean primitivos u hagan referncias a objetos ; SON OBJETOS
### Si un objeto se queda sin su referencia es elegible para la Garbage Collector
Book b = new Book();
Book c = new Book();
### Los dos objetos tienen su referencia b y c 
Referencias = 2
Objetos = 2 

Book d = c;

### Los objetos siguen siendo 2 pero hay una referencia adicional;
Objetos = 2
Referencias = 3
 
c = b

### En este caso se cambia la referencia y el objeto 1 tiene dos referencias

-------------------------------------------------------------------------------

Book b = new Book();
Book c = new Book();

Referencias 2
Objetos 2

b = c;

Objetos 1
Referencias 2

### Dos referencias apuntan a un solo objeto  por ende el objeto que queda sin referencia es elegible para la GC

c = null;

### En este caso queda una sola referencia y un objeto el objeto c es una refencia nula ; Pero sigue siendo una variable de referencia y se puede asignar a otro objeto tipo Book.

## Los arreglos tambien son objetos 
Dog[] dogs;

dogs = new Dog[7]; Aca se crea la referencia a unos perros ; PERO NO A NINGUN OBJETO TIPO PERRO TOCA CREAR LOS OBJETOS DE ESAS REFERENCIAS

dogs[0] = new Dog();
dogs[1] = new Dog();




