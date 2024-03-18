## Índice
[Introducción](#introducción)  

[Leer-Ficheros-Caracteres](#leer-ficheros-caracteres)  

[Escribir-Ficheros-Caracteres](#escribir-ficheros-caracteres)  


## Introducción  
Existen dos tipos de flujos:  

- Los __flujos de caracteres__ (16 bits) se usan para manipular __datos legibles por humanos__ (ficheros de texto). Vienen determinados por dos clases abstractas: __Reader__ y __Writer__  
- Los __flujos de bytes__ (8 bits) se usan para manipular __datos binarios__, __legibles solo por la máquina__. Vienen determinados por dos clases abstractas __InputStream__ y __OutputStream__.  

Cuando se va a hacer uso de ficheros, hay que tener en cuenta, la forma de acceso: __secuencial__ o __aleatoria__.  
- __secuencial__ Para acceder a un dato debemos recorrer todo el fichero desde el principio hasta llegar a su posición.  
- __aleatoria__ Podemos posicionarnos directamente en una posición del fichero, y ahí leer o escribir.  

Un __Buffer__ es una especie de memoria interna que se coloca entre medias de nuestro programa java y el archivo externo.  
El objetivo de la memmoria intermedia es: En lugar de acceder directamente desde nuestro código java al archivo, lo hagamos a esta memoria intermedia, de manera que:  
- La información contenida en el archivo de texto se vuelca COMPLETAMENTE al Buffer, se almacena en ese Buffer y una vez que la información del archivo está integramente en el Buffer, es nuestro programa java, quien accede a ese Buffer para ir descargando poco a poco esa información. Des este modo se gana en rapidez y eficiencia.  
El Buffer lo podemos usar tanto para escribir como para leer información de un fichero externo (BufferReader - BufferWriter).  
## Leer Ficheros Caracteres
![Lectura fichero texto](img/Lectura%20ficheros%20texto.PNG)
## Escribir Ficheros Caracteres
![Escribir fichero texto](img/Escribir%20ficheros%20texto.PNG)