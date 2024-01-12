
Proyecto 2 - Jerigonzas
Pedro Ulises Cervantes González confundeme@ciencias.unam.mx
Julio Vázquez Alvarez julio.vazquez@ciencias.unam.mx
Ian Israel García Vázquez iangarcia@ciencias.unam.mx
Erick Bernal Márquez erick07@ciencias.unam.mx
Yessica Janeth Pablo Martínez yessica_j_ pablo@ciencias.unam.mx

Equipo:
-Cano Tenorio Alan Kevin(321259967)
-Escobedo Irineo Malinalli (424121101)


Sobre el proyecto:
El proyecto trata sobre las jerigonzas, enfocandose sobre tres tipos de jerigonzas:
-Idioma de la (alguna consonante)
-Idioma del ladron
-Vesre

Estructura:
El proyecto esta dividido en tres archivos de la extension .java. A continuación, se dara una breve descripcion de cada uno.

-Metodos.java : Este archivo es la interfaz que contiene los encabezados de los métodos que se implementaron en el archivo Jerionza.java.

-Jerigonza.java : Este archivo está estructurado de la siguiente manera:
    --Metodos auxiliares: se colocaron al inicio todos los metodos auxiliares que fueron utilizados para poder implementar la interfaz correctamente. Se opto  por colocarlos al inicio para que se comprendiera de mejor manera como se implementaron los metodos de interfaz, ademas, entre estos se encuentra el metodo depurar, el cual, sirve para eliminar cualquier carácter ajeno al alfabeto, este ultimo era un requisito para poder usar los metodos de interfaz.
    --Metodos de interfaz: En esta parte se encuentran todos los metodos de interfaz implementados con los metodos auxiliares y diferentes líneas de código Cada uno viene con la descripcion brindada en la interfaz.

-Main.java: Este archivo es la clase principal del programa, por el cual, se crean los objetos y se muestra en la terminal la ejecucion de los diferentes métodos de la interfaz. Este archivo incluye la clase scanner para que el usuario pueda interactuar con el programa de forma directa.Esta conformado por un public static void main(String[] args), en el cual se crea un objeto de tipo Jerigonza y otro de tipo Scanner, esto con la finalidad de usar con eficacia el menu, este esta alojado en esta parte y dentro de un do-while para que se ejecute hasta que el usuario desee. Este menu es de gran utilidad porque ayuda al usuario a ejecutar el programa de la forma que el guste.

Inconvenientes que se presentaron:
Los inconvenientes se presentaron a la hora de implementar el método vesre, debido a que, al principio no comprendiamos que significaba.
Despues de unos días pudimos comprender la jerigonza vesre y obtuvimos un avance considerable, sin embargo, todo el avance era erroneo debido a que carecia de buenas practicas de programacion y aún no arrojaba el resultado obtenido.
Pasamos días de prueba y error hasta que por fin el método quedo bien implementado. Sin duda alguna, fue el metodo mas complicado de todo el proyecto.

Ejecucion:
Primero se descarga el archivo. Zip que se subio al classroom y guardalo en la carpeta que desees
Posteriormente se descomprime el .zip (solo tienes que dar doble clic sobre el archivo)
Abre la terminal y métete a la carpeta en la cual guardaste el archivo, para hacer esto escribe:

computadora:~$ cd + “nombre de la carpeta que descargaste”

Posteriormente escribe el comando ls
Si te aparecen los archivos Jerigonza.java, Metodos.java y Main.java, estas en la carpeta correcta

En la terminal escribe javac *.java
Esto compila todos los archivos que tengas en esa carpeta
Finalmente escribe java Main y en en la terminal se mostrara un menu que indica los metodos disponibles

En ese menu presionas cualquiera de los 6 numeros que te arroja el programa y sigues las instrucciones que te arrojan.
