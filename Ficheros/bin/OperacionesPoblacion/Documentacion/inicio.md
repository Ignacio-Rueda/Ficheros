## Índice
[Coleccones](#colecciones)  


## Colecciones 
Tanto el método __equals__ como __hashCode__, son fundamentales a la hora de trabajar con colecciones. 
- Las colecciones (Sets) no permiten los duplicados.  
- No permite la ordenación.
- No tiene acceso aleatorio. (Encontrar un elemento dado su índice).  
En cuanto a los duplicados: El método __add__, gestiona el solo, si el objeto es un objeto duplicado o no lo es. 
Para que a la hora de agregar un objeto pueda saber si se trata del mismo o diferente objeto, son imprescindibles los métodos __equals__ y __hashCode__.  
El método __hasCode__ hace referencia a la localización  del objeto que tenemos almacenado en la memoria Heap.  
El método __equals__, sabemos que se utiliza para saber si dos objetos son iguales o no lo son. El método __equals__ por defecto no tendrá el criterio para determinar si un objeto que hemos creado nosotros es igual a otro no. Es decir, por defecto, el método __equals__ podrá determinar si dos objetos de la clase String o Date son o no iguales, puesto que estas clases ya están __predefinidas__, que ya vienen en la biblioteca de java.  
En definitiva: Para que pueda determinar si dos objetos son iguales, __hemos de sobreescribir__ el método equals, en el cuál indicaremos el criterio para determinar la distinción. También habrá que sobreescribir el método __hashCode__.  

-> Collections.sort(): Ordena una __lista__ específica de acuerdo al orden natural de los elementos.  
Un __Set__ no puede utilizar el método Collections.sort(). Para ordenar un __Set__, utilizaremos __TreeSet__  
Para utilizar un __TreeSet__ necesitamos implementar la interfaz __Comparable<T>__ y su método correspondiente.  
Para utilizar Collections.sort() la clase a la que pertenece el objeto, debe implementar la interfaz __Comparable<T>__ o __Comparator__.   
Ten en cuenta que: Si dos elementos no disponen de un criterio de compración, __no podrán ordenarse.__


