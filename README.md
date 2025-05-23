# TPV MAster

TPVMaster, esta dirigido a bares/restaurantes para gestionar las ventas y cobrar a los clientes.

## Descripción

Una descripción más detallada y técnica del proyecto, incluyendo sus principales características, su propósito y cómo funciona.

La parte de programacion de programacion el lenguaje que se a usado es 100% Java y creado en la ID de eclipse, la base de datos es SQL y hemos utilizado xampp, PHPmyAdmin y hemos usado servidor local, a la vez que se iba desarrollando el proyecto hemos se ha subido en los repositorios de GitHub haciendo commit con las ramas de cada uno y sus partes.

🖥️ ## Estructura del Proyecto TPV
📁 Carpeta Principal
Ruta: TPV/src/Pantallas

Aquí se encuentran todas las páginas del proyecto, ordenadas de la siguiente manera:

📄 Páginas del Proyecto
🔐 InicioSesion

Cada camarero debe iniciar sesión para entrar al TPV.

Si no tiene cuenta, hay un botón para crear una nueva cuenta.

📝 Registro

Permite crear una cuenta con usuario y contraseña.

🏠 General

Pantalla principal del TPV donde se muestran todos los apartados.

🍽️ Restaurante

Muestra una imagen del local.

Puedes pulsar sobre las mesas para ver sus pedidos.

Para volver al inicio, se pulsa sobre la barra.

📋 MesaResumen

Muestra todos los pedidos de una mesa.

Incluye un botón para realizar el cobro.

💰 Cobro

Muestra la suma total de los productos de la mesa.

➕ RegistroProductos

Permite agregar nuevos platos o menús a la carta.

🪑 Mesas

Vista del local para tomar la comanda.

Al pulsar una mesa, se abre la siguiente pantalla.

📦 Comanda

Lista de productos disponibles para seleccionar y agregar a la mesa.

🗺️ Mesas_Cobro

Vista del local centrada en el proceso de cobro.

💳 Cobro2

Genera directamente la cuenta final para un cobro rápido.

🗄️ Base de Datos (XAMPP + MySQL)
🔧 Configuración Inicial:
Iniciar Apache y MySQL desde XAMPP.

Entrar en Admin MySQL → Se abre phpMyAdmin en el navegador.

🗃️ Base de Datos: registro
📌 Tablas:
🕵️ auditoria_productos:
Registra cada vez que se agrega un producto a la carta (con fecha, hora, nombre y ID).

📜 carta:
Contiene todos los productos disponibles en la carta.

🛒 seleccion_productos:
Se agregan aquí los productos seleccionados en la comanda.

👤 users:
Almacena los usuarios registrados.

🔁 Trigger:
Al hacer un INSERT en carta, se crea un registro automáticamente en auditoria_productos con:

Fecha y hora

Nombre del producto

ID incremental (clave primaria)

🔗 Relaciones:
Las tablas carta, seleccion_productos y auditoria_productos están relacionadas por la columna producto.

La tabla users está independiente, no se une a otras.

⚙️ Función:
total_gastado: Suma los productos de la misma mesa y devuelve el total como un número entero.

💻 Repositorio en GitHub
🌿 Ramas:
main: Contiene el resultado final del proyecto.

joseluis: Trabajo individual de José Luis.

pepe: Trabajo individual de Pepe.

✅ Pruebas JUnit
Hay 7 tests creados para verificar la lógica y errores del sistema:

🧪 registroProductos_camposVacios_noDebeRegistrar

🧪 iniciosesion_usuarioVacio_noInsertar

🧪 CamposVacios

🧪 ResumenCobroMesaVacia

🧪 testMesasConIdentificadorInvalido

🧪 testCamposCompletos

🧪 testCamposProductoVacio

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
