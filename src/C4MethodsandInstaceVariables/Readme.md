### Una clase es un modelo de un Objeto
Al escribir una clase se indica a la JVM como debe crear un objeto de ese tipo
una clase tiene variables de instancia y metodos que describen el comportamento(Metodos) de cada uno de los objetos y el estado(Variables de instancia)

#### Metodos
* Se pueden pasar valores a tus metodos se llaman parametros (El llamado pasa un argumento y el metodo recibe parametros)
* Lo importante es que si un metodo acepta un parametros debes pasarle algo al llamarlo y debe ser del tipo apropiado
* Dog d = new Dog();
d.bark(3)
void bark(int numofBark){
while(numofBark > 0){
sout("Ruff");
numofBark -=1;
}
}
##### Los metodos tambein pueden devolver valores
* void go(){} // No retorna nada 
* int givePassword(){
    return 42;
}
* Puedes enviar mas de una cosa a un metodo
Los metodos pueden tener multiples parametros , separados por comas al pasarlos; Es muy importante que sean del tipo y del orden correctos
* void go(){
TestStuff t = new TestStuff();
t.takeTwo(12,34);
}

void takeTwo(int x, int y){
    int z = x + y;
    System.out.println("Total is " + z);
}

##### Los metodos puedes pasarle variables que coincida con el tipo de parametro

void go(){
int foo = 7;
int bar = 10;
t.takesTwo(foo, bar);
}

##### IMPORTANTE JAVA ES PASO POR VALOR ES DECIR PASO POR COPIA
* Las clases definen lo que un objeto sabe y hace.
* Las cosas que un objeto sabe son sus variables de instancia(Estado)
* Las cosas que un objeto hace son sus metodos
* Los metodos puede usar sus variables de instancia para que el objeto se comporte de una forma diferente
* Un metodo puede tener parametros.
* La cantidad y el tipo de valores que se pase deben coincidir con el orden y tipo de parametros declarados en el metodo.
* Los valores se pueden promover implicitamente a un tipo mas grande o explicitamente a un dato mas pequeño.
* Un metodo debe declarar un tipo de retorno; un retorno null significa que el metodo no devuelve nada
* Si un metodo declara un tipo de retorno distinto a nulo ; debe devolver un valor compatible con el retorno indicado.

#### Cosas interesantes que puedes hacer con los parametros y tipos de retorno
##### Getter and Setters o Accesor y Mutators
* Los getter and setter permiten obtener y establecer cosas; valores de variables de instancia.
El unico objetivo de un getter es devolver como valor de retorno el valor que se supine que debe obtener
El objetivo de un setter es tomar el valor de un argumento para establecer el valor de una variable de instancia
### ENCAPSULACION
* Exponiendo nuestros datos; si no se encapsulan los datos podemos correr el riesgo de que todo el mundo los vea.
No podemos dejar que se acceda a nuestro objeto directamente sino atraves de los setter
theCat.height = 0; <-------- No podemos dejar que eso pase
public void setHeight(int ht){
if(ht > 9){<-----------Establecemos por medio de un setter un tamaño minimo del gato.
 height = ht;
}
}
### Modificadores de Acceso
#### Ocultar los datos
* Como se ocultan los datos: Con los modificadores de acceso Public y Private.
* REGLA DE EL ENCAPSULAMENTO: Marca todas las variables de instancia como privadas y proporciona metodos publicos para obtener y definir (getter and setter)
* Marcar las variables de instancia como private
* Marcar los metodos getter and setter como pùblicos
### Como se comprotan los objetos de una matriz
Igual que otro objeto , la diferencia es como se accede a ellos. 
GoodDog[] pets;
pets = new GoodDog[7];
pets[0].setSize(30);
int x = pets[0].getSize();
pets[1].setSize(8);

* Las variables de instancia siempre tienen un valor predeterminado; si no se le asigna un valor ni se llama a ningun setter
* integers 0
* floating point 0.0
* booleans false
* references null

