Proyecto máquina virtual en java orientada a aprender los conceptos básicos de la orientación a objetos y a java, uso de arrays y enumerados; manipulacion de cadenas conla clase String; entrada y salida por consola.
En este proyecto vamos a crear una versión inicial muy sencilla de nuestra máquina virtual.En concreto la apliacación será capaz de ejecutar una serie de comandos itroducidos por el usuario para crear, modificarar y ejecutar programas, donde un programa es una lista de instancias que se representan en la siguiente sección.
Al arrancar la aplicación, se iniciarán todas las estructuras de la MV  y se representará un prompt en donde el usuario irá teclenado los distintos comandos que se quieren ejecutar. El conjunto de comandos diponibles seárn:
. HELP: Que nos muestra informacón sobre los distintos comandos diponobles.

 
![image](https://github.com/mayrabpi/proyecto_Maquina_Virtual/assets/145108717/7d8e4a44-dae8-4b4a-91c3-91ecf8726d7b)


.QUIT: Cierra la apliacación.
![image](https://github.com/mayrabpi/proyecto_Maquina_Virtual/assets/145108717/3f30cdaa-f8d4-488f-8e46-87c9acd952fb)


.NEWINST BC: introduce la instrucción bytecode BC al programa actual. Si BC no está correctamente escrito, entonces manda un mensaje de error y no lleva a cabo la inseseciión.
![image](https://github.com/mayrabpi/proyecto_Maquina_Virtual/assets/145108717/4ef7c665-0589-471b-a1cc-18ddea4dd424)



![image](https://github.com/mayrabpi/proyecto_Maquina_Virtual/assets/145108717/920d00de-9543-425b-af76-2f1b6b7747c7)


. RUN: Ejecuta el programa actual. En caso de que se produzca un erros de ejecución, avisa al usuario mediante un mensaje.


![image](https://github.com/mayrabpi/proyecto_Maquina_Virtual/assets/145108717/73415c71-6012-4181-a28f-e34ba22bc8b0)


.RESET: Inicializa el programa actual eliminando todas las instruccuines almacenadas.



![image](https://github.com/mayrabpi/proyecto_Maquina_Virtual/assets/145108717/1c885f09-ed63-4c79-95d3-9a7501d0c01f): 


.REPLACE n : Solicita al usuario una nueva insrucción BC, que en caso de ser corredta reemplazará a la instrucción bytecode númer N del progrema. en este caso hemos reemplazdo la suma por a divición el resultado de lo que se queda alamacenado en la pila es la ultima instrucción, que es la división


![image](https://github.com/mayrabpi/proyecto_Maquina_Virtual/assets/145108717/91f3044d-2f6c-4759-852a-9c3cc7050265)


Tras la ejecución de cada comando, la apliacación mostrará el programa actual almacenado. Para el caso del comando RUN,  depués de la ejecución de cada una de las instrucciones del programa se mostrará ademaás los estados en los que ha quedado la máquina. Es posible que algún cmando falle, en ese caso la apliacación mostrará un mensaje indicando que no ha sido posible la ejecución y pesirá un nuevo comando. La aplicación terminará cuando se ejecute el comando QUIT.







