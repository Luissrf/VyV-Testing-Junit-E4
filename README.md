# GALY'S CAKE - Sistema de Gestión de Pastelería

## Introducción
Bienvenido al sistema de gestión de pastelería "GALY'S CAKE". Este proyecto fue desarrollado para sistematizar el control, monitoreo y registro de ventas, inventario y ganancias en la pastelería GALY'S CAKE.

## Tabla de Contenidos
1. [Descripción del Proyecto](#descripción-del-proyecto)
2. [Características](#características)
3. [Instalación](#instalación)
4. [Uso](#uso)
5. [Estructura del Proyecto](#estructura-del-proyecto)
6. [Creadores](#creadores)
7. [Versión](#versión)
8. [Licencia](#licencia)

## Descripción del Proyecto
El propósito de este sistema es reemplazar los procesos manuales en la pastelería GALY'S CAKE y mejorar el control, monitoreo y registro de ventas, inventario y ganancias. El software fue desarrollado en Java con una base de datos MySQL.

## Características
- **Control de inventario**: Gestión de materia prima y productos.
- **Registro de ventas**: Seguimiento de ventas con detalles de clientes y productos.
- **Gestión de pedidos**: Registro de pedidos con información detallada de clientes y productos.
- **Informes de ventas**: Generación de informes detallados de ventas.

## Instalación
Para instalar y ejecutar este proyecto localmente, sigue estos pasos:

1. Clona el repositorio:
   ```bash
   git clone https://github.com/usuario/repo.git
2. Navega al directorio del proyecto:
   ```bash
   cd galys-cake
   
3. Configura la base de datos MySQL:

- **Crea una base de datos llamada galys_cake.**
- **Importa el archivo database.sql ubicado en el directorio db.**

4. Configura el archivo de conexión a la base de datos en src/main/resources/config.properties:

   ```bash
      db.url=jdbc:mysql://localhost:3306/galys_cake
      db.user=tu_usuario
      db.password=tu_contraseña
   
5. Compila y ejecuta el proyecto:
   ```bash
      mvn clean install
      mvn spring-boot:run
## Uso
Una vez que el sistema esté en funcionamiento, puedes acceder a las siguientes funcionalidades:

- **Clientes: Gestión de clientes y pedidos.**
- **Pasteles: Registro y administración de pasteles.**
- **Ventas: Procesamiento de pagos y registro de ventas.**
- **Informes: Generación y visualización de informes de ventas**
## Estructura del Proyecto
La estructura del proyecto es la siguiente:
- `Galysk/`
  - `build/`
  - `dist/`
  - `lib/`
  - `nbproject/`
  - `src/`
     - `BaseDatos`
     - `galysk/`
     - `Imagenes/`
     - `InterfazUsuario/`
  - `test/`
  - `build.xml`
  - `manifest.mf`
- `Base de datos`
  - `Base de datos_galyscake.sql`
- `README.md`

## Creadores
Este proyecto fue desarrollado por:

- **Luis Gerardo Rosales Flores**
- **Alejandro Hernández Osorio**
- **Angel Javier Pintado Vicente**
- **Kevin Iván de la Cruz de la Cruz**

## Versión
Versión actual del proyecto: 1.3

## Licencia
Este proyecto está licenciado bajo la Licencia TECMALAN.
