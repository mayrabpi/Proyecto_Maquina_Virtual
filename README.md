Proyecto máquina virtual en java orientada a aprender los conceptos básicos de la orientación a objetos y  a java, uso de arrays y enumerados; manipulacion de cadenas con la clase String; entrada y salida por consola.
En este proyecto vamos a crear una versión inicial muy sencilla de nuestra máquina virtual. En concreto la apliacación será capaz de ejecutar una serie de comandos itroducidos por el usuario para crear, modificarar y ejecutar programas, donde un programa es una lista de instancias que se representan en la siguiente sección.
Al arrancar la aplicación, se iniciarán todas las estructuras de la MV  y se representará un prompt en donde el usuario irá teclenado los distintos comandos que se quieren ejecutar. El conjunto de comandos diponibles serán:


.HELP: Que nos muestra informacón sobre los distintos comandos diponibles.

 
![image](https://github.com/mayrabpi/proyecto_Maquina_Virtual/assets/145108717/7d8e4a44-dae8-4b4a-91c3-91ecf8726d7b)


.QUIT: Cierra la aplicación.


![image](https://github.com/mayrabpi/proyecto_Maquina_Virtual/assets/145108717/3f30cdaa-f8d4-488f-8e46-87c9acd952fb)


.NEWINST BC: introduce la instrucción bytecode BC al programa actual. Si BC no está correctamente escrito, entonces manda un mensaje de error y no lleva a cabo la inserción.


![image](https://github.com/mayrabpi/proyecto_Maquina_Virtual/assets/145108717/4ef7c665-0589-471b-a1cc-18ddea4dd424)



![image](https://github.com/mayrabpi/proyecto_Maquina_Virtual/assets/145108717/920d00de-9543-425b-af76-2f1b6b7747c7)


. RUN: Ejecuta el programa actual. En caso de que se produzca un error de ejecución, avisa al usuario mediante un mensaje.


![image](https://github.com/mayrabpi/proyecto_Maquina_Virtual/assets/145108717/73415c71-6012-4181-a28f-e34ba22bc8b0)


.RESET: Inicializa el programa actual eliminando todas las instruccuines almacenadas.



![image](https://github.com/mayrabpi/proyecto_Maquina_Virtual/assets/145108717/1c885f09-ed63-4c79-95d3-9a7501d0c01f): 


.REPLACE n : Solicita al usuario una nueva insrucción BC, que en caso de ser correcta reemplazará a la instrucción bytecode número N del programa. en este caso hemos reemplazdo la suma por a división el resultado de lo que se queda alamacenado en la pila es la ultima instrucción, que es la división


![image](https://github.com/mayrabpi/proyecto_Maquina_Virtual/assets/145108717/91f3044d-2f6c-4759-852a-9c3cc7050265)


Tras la ejecución de cada comando, la apliacación mostrará el programa actual almacenado. Para el caso del comando RUN,  depués de la ejecución de cada una de las instrucciones del programa se mostrará además los estados en los que ha quedado la máquina. Es posible que algún comando falle, en ese caso la aplicación mostrará un mensaje indicando que no ha sido posible la ejecución y pedirá un nuevo comando. La aplicación terminará cuando se ejecute el comando QUIT.

Descripción de MV en la práctica:

MV está compuesta de dos partes muy simples:

Una memoria capaz de almacenar datos.

Una pila de operandos en la que se realizan las operaciones. Gran parte de las distitas instrucciones bytecode de la máquina virtual trabajan sobre la pila de operandos, cogiendo de ella valores y/o dejando en ella resultados.

La MV tiene un cojunto reducido de instrucciones, la mayoría de ellas no tiene parametros (pues trabajan directamente con la pila de operandos). Sólo unas pocas de ellas tienen un parámetro de tipo entero. El conjunto de instrucciones Bytecode admitidas es:


. PUSH n: Apila en la pila de operandos el entero n.

![image](https://github.com/mayrabpi/proyecto_Maquina_Virtual/assets/145108717/8ae4be94-94d5-4f27-a96f-d62c96b36313)

.LOAD pos: Lee de la memoria el valor almacenado en pos y lo apila en la pila de operandos.


![image](https://github.com/mayrabpi/proyecto_Maquina_Virtual/assets/145108717/96ee80a2-d5c4-44e9-9fbf-cd3d7f79eaac)


.STORE pos: Escribe en la posición pos de la memoria el contenido de la cima de la pila de operandos, y lo elimina de ella.


![image](https://github.com/mayrabpi/proyecto_Maquina_Virtual/assets/145108717/f4c43602-e498-4bde-aca9-d641cda58b08)


.ADD, SUB, MUL, DIV: Operaciones artiméticas de suma, resta, multiplicación y división, todas ellas utilizan como operandos la cima y subcima de la pila, tanto la cima y la subcima son sustituidas por el resultado de la oprecion.


![image](https://github.com/mayrabpi/proyecto_Maquina_Virtual/assets/145108717/7f70d02a-0169-4b33-ae36-8a388ae4b806)

Un ejemplo del codigo de la operacion suma : 

![image](https://github.com/mayrabpi/proyecto_Maquina_Virtual/assets/145108717/f4a90652-f872-4b7c-b27b-a99a5a5059e0)

.OUT: Escribe el entero almacenado en la cima de la pila.

![image](https://github.com/mayrabpi/proyecto_Maquina_Virtual/assets/145108717/0ad89fff-df5c-48f6-8023-42bb5738a72d)

.HALT: Para la máquina.

![image](https://github.com/mayrabpi/proyecto_Maquina_Virtual/assets/145108717/564bc537-5fba-4baa-870f-cb9293944827)















