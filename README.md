# Título del Proyecto

TPVMaster, esta dirigido a bares/restaurantes para gestionar las ventas y cobrar a los clientes.

## Descripción

Una descripción más detallada y técnica del proyecto, incluyendo sus principales características, su propósito y cómo funciona.

La parte de programacion de programacion el lenguaje que se a usado es 100% Java y creado en la ID de eclipse, la base de datos es SQL y hemos utilizado xampp, PHPmyAdmin y hemos usado servidor local, a la vez que se iba desarrollando el proyecto hemos se ha subido en los repositorios de GitHub haciendo commit con las ramas de cada uno y sus partes.

La parte de programacion se almacena dentro de la carpetas TPV/src/Pantallas se puede ver todas las paginas que contiene el proyecto desde el principio son;
-InicioSesion, donde cada camarero se tiene que registrar para poder entrar dentro de la TPV, si no tiene creada cuenta se encuentra un boton para crear una
-Registro, crea una cuenta con la contraseña
-General, es el inicio de la TPV donde aparece todo los apartados de la TPV
-Restaurante, aparece una imagen de el local puedes pulsar las mesas para ver lo que hay en cada mesa para volver al inicio pulsas la barra y vuelves al principio
-MesaResumen, aparece todos los pedidos y hay un boton de cobro
-Cobro, es la pagina que aparece la suma de todos los productos
-RegistroProductos, esta pagina es para agregar nuevos platos o menu en la carta
-Mesas, esta pantalla aparece el local pero es para coger la comanda, al pulsar la mesa se abre la siguiente pagina.
-Comanda, aparece una lista con todo los producto, se pueden selecciona y agrega a la mesa para el cobro
-Mesas_Cobro, aparece el mapa del local
-Cobro2, genera la cuenta directamente para evitar pasos y realizar el cobro directo

Para base de datos hemos usado XAMPP, tenemos que iniciar apache y MySQL, una vez iniciado entramos en Admin MySQL y nos dirige a PHPmyAdmin que se abre en el navegador. La base de datos se debe llamar registro, donde podemos ver la funcion total_gastado que suma todos los producto de la misma mesa y te devuelve un entero, y las tablas;
-Auditoria_productos, es un registro de cuando agregamos un producto a la tabla
-carta, aparece todos los productos de la carta
-seleccion_productos, se agregan los producto cuando se coge comanda
-users, se guarda los usuarios registrados
El trigger cada vez que detecta un insert en la tabla carta crea un registro automatico en la tabla auditoria_roductos registrando fecha y hora nombre de producto y un id auto incremental de clave primaria.
La union de tablas son por la PK son tres tablas realacionadas que teinen en comun la columna producto, las tablas son;
seleccion_producto, carta y auditoria_productos.
La tabla users queda sin unir.

En Github vemos en los repositorios que hay tres ramas main donde se encuentra el resultado final del proyecto y las otras dos ramas : joseluis y pepe, cada rama tiene el contenido que ha trabajado cada uno.
JUnit hay creados 7 test JUnit que cada uno maneja un posible fallo o limite de logica en el programa, las pruebas son:
-registroProductos_camposVacios_noDebeRegistrar
-iniciosesion_usuarioVacio_noInsertar
-CamposVacios
-ResumenCobroMesaVacia
-testMesasConIdentificadorInvalido
-testCamposCompletos
-testCamposProductoVacio

## Visuales

Capturas de pantalla, videos o GIFs que demuestran lo que hace el proyecto y cómo usarlo.

![image](https://github.com/user-attachments/assets/02d3b33c-4123-4c1e-a5d7-16c4571db0ae)
Todas las pantallas del proyecto

![image](https://github.com/user-attachments/assets/2129deda-ac15-4a6a-b565-b9070cb60a2a)
Base de datos

![image](https://github.com/user-attachments/assets/c9a1fd0e-03cf-4e70-a55a-5b6ff67c9f21)
Proyecto en GitHub

## Empezando 🚀

Estas instrucciones te guiarán para obtener una copia de este proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas.
Para la instalacion del proyecto entramos en el proyecto de github en la rama main https://github.com/selukiler/Proyecto descargamos todo los archivos y descomprimimos el zip. La parte de programacion arrastamos el archivo de Pantallas en TPV/src
La base de datos hay que tener xampp y crear una base de datos que se llame registro este paso es importante, y importamos el archivo .sql del GitHub

### Prerrequisitos 📋

Lista de software y herramientas, incluyendo versiones, que necesitas para instalar y ejecutar este proyecto:

- Sistema Operativo (Windows 10/11)
- Lenguaje de programación (Java)
- Framework (Eclipse, JUnit)
- Base de datos (XAMPP)

## Despliegue 📦

Instrucciones sobre cómo desplegar esto en un sistema en vivo o ambiente de producción.
Para ver el proyecto iniciamos en el id la pantalla iniciosesion y ejecutamos, de ahi comienza toda la TPV

## Construido Con 🛠️

Explica qué tecnologías usaste para construir este proyecto. Aquí algunos ejemplos:

- Java- El lenguaje utilizado
- Eclipse y Intellij - El framework web utilizado
- XAMPP - Sistema de base de datos

## Soporte

Si tienes algún problema o sugerencia, por favor abre un problema (https://github.com/selukiler/Proyecto).

## Autores ✒️

- **Jose Antonio Salado Muñoz** y **Jose Luis Fernadez Cabeza**
