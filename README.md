# TPV Master

**TPV Master** es una aplicación diseñada para bares y restaurantes, pensada para gestionar ventas, comandas y cobros de manera sencilla y eficiente.

---

## 📌 Descripción del Proyecto

TPV Master permite a los camareros iniciar sesión, gestionar mesas, registrar productos, tomar comandas y realizar cobros. Está desarrollado íntegramente en **Java** usando **Eclipse** como entorno de desarrollo. La base de datos está gestionada mediante **MySQL** a través de **XAMPP y phpMyAdmin**, usando un servidor local.

Durante el desarrollo, se utilizó **GitHub** como sistema de control de versiones, con ramas individuales para cada desarrollador.

---

## 🗂️ Estructura del Proyecto

**Ruta principal:** `TPV/src/Pantallas`

### Pantallas del Proyecto

* 🔐 **InicioSesion**

  * Inicio de sesión para camareros.
  * Opción para crear una nueva cuenta.

* 📝 **Registro**

  * Formulario para crear nuevos usuarios.

* 🏠 **General**

  * Vista principal del TPV con acceso a todas las funcionalidades.

* 🍽️ **Restaurante**

  * Muestra la vista del local.
  * Interacción con las mesas para ver pedidos.

* 📋 **MesaResumen**

  * Detalle de los pedidos por mesa.
  * Botón para iniciar el proceso de cobro.

* 💰 **Cobro**

  * Muestra el total de la cuenta.

* ➕ **RegistroProductos**

  * Permite registrar nuevos productos o menús.

* 🪑 **Mesas**

  * Vista del local para tomar comandas.

* 📦 **Comanda**

  * Selección y asignación de productos a una mesa.

* 🗺️ **Mesas\_Cobro**

  * Vista centrada en la gestión de cobros.

* 💳 **Cobro2**

  * Generación rápida del ticket final.

---

## 🗄️ Base de Datos (XAMPP + MySQL)

### Configuración Inicial

1. Iniciar Apache y MySQL desde XAMPP.
2. Acceder a **phpMyAdmin**.
3. Crear la base de datos llamada `registro`.
4. Importar el archivo `.sql` disponible en el repositorio.

### Tablas del Proyecto

* `auditoria_productos`
  Registra cada inserción en la tabla `carta` (fecha, hora, producto, ID).

* `carta`
  Contiene los productos disponibles.

* `seleccion_productos`
  Guarda los productos seleccionados en las comandas.

* `users`
  Almacena los usuarios registrados.

### Triggers

* Se activa al insertar un producto en `carta`, creando automáticamente un registro en `auditoria_productos`.

### Relaciones

* `carta`, `seleccion_productos` y `auditoria_productos` están unidas por la columna `producto`.
* `users` es una tabla independiente.

### Función

* **`total_gastado`**: Calcula el total consumido por una mesa.

---

## 🧪 Pruebas (JUnit)

El proyecto incluye 7 tests automatizados para validar la lógica del sistema:

* `registroProductos_camposVacios_noDebeRegistrar`
* `iniciosesion_usuarioVacio_noInsertar`
* `CamposVacios`
* `ResumenCobroMesaVacia`
* `testMesasConIdentificadorInvalido`
* `testCamposCompletos`
* `testCamposProductoVacio`

---

## 🖼️ Visuales

### Capturas de Pantalla

| Pantalla General                                                                               | Base de Datos                                                                                  | Cobro                                                                                          |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| ![Pantalla 1](https://github.com/user-attachments/assets/02d3b33c-4123-4c1e-a5d7-16c4571db0ae) | ![Pantalla 2](https://github.com/user-attachments/assets/2129deda-ac15-4a6a-b565-b9070cb60a2a) | ![Pantalla 3](https://github.com/user-attachments/assets/c9a1fd0e-03cf-4e70-a55a-5b6ff67c9f21) |

---

## 🚀 Empezando

### Instalación del Proyecto

1. Clona o descarga el proyecto desde la rama `main` del repositorio:
   [https://github.com/selukiler/Proyecto](https://github.com/selukiler/Proyecto)
2. Extrae el archivo ZIP.
3. Importa el proyecto en Eclipse.
4. Asegúrate de copiar la carpeta `Pantallas` en `TPV/src`.

### Configuración de la Base de Datos

1. Inicia XAMPP y activa Apache + MySQL.
2. Crea una base de datos llamada `registro`.
3. Importa el archivo `.sql` desde el repositorio.

---

## 📋 Requisitos

* **Sistema Operativo**: Windows 10/11
* **Lenguaje**: Java
* **IDE**: Eclipse (o IntelliJ)
* **Testing**: JUnit
* **Base de Datos**: XAMPP + MySQL + phpMyAdmin

---

## 📦 Despliegue

Para ejecutar el proyecto:

1. Abre Eclipse.
2. Ejecuta la clase `InicioSesion`.
3. Desde ahí se puede navegar por todo el sistema TPV.

---

## 🛠️ Tecnologías Utilizadas

* **Java** – Lenguaje principal del backend.
* **Eclipse / IntelliJ** – Entornos de desarrollo.
* **XAMPP / MySQL / phpMyAdmin** – Sistema de base de datos y servidor local.
* **JUnit** – Pruebas unitarias.

---

## 🔗 Repositorio

[https://github.com/selukiler/Proyecto](https://github.com/selukiler/Proyecto)

### Ramas

* `main`: Resultado final del proyecto.
* `joseluis`: Desarrollo individual de José Luis.
* `pepe`: Desarrollo individual de Pepe.

---

## 🧑‍💻 Autores

* **José Antonio Salado Muñoz**
* **José Luis Fernández Cabeza**

---

## 🛠 Soporte

¿Tienes algún problema o sugerencia?
Abre un issue aquí: [https://github.com/selukiler/Proyecto/issues](https://github.com/selukiler/Proyecto/issues)

---

¿Deseas que lo convierta en un archivo `README.md` descargable o subirlo a GitHub directamente?
