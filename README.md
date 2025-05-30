# 🧪 Reto Técnico – Backend Developer  
**Team Salesforce – POHAR**
# Autor: Carlos Pino Uribe

Este repositorio contiene la solución completa al reto técnico solicitado, dividido en dos partes:

- **A. Desarrollo de Microservicios (Java Spring Boot)**
- **B. Desarrollo de Base de Datos (Oracle)**

---

## 🧩 A. Evaluación Desarrollo Microservicios
Este proyecto es un microservicio CRUD para gestionar estudiantes, implementado con Java 11, Spring Boot, JPA, H2 y Swagger para documentación interactiva.

---

## 🚀 Tecnologías utilizadas

- Java 11
- Spring Boot 2.x
- Maven
- JPA (Hibernate)
- H2 (Base de datos en memoria)
- Swagger 2.9.2 (documentación de API)

#### 📦 Funcionalidad:
Permite las operaciones básicas:
- Crear estudiante
- Obtener lista de estudiantes
- Actualizar estudiante
- Eliminar estudiante

Validaciones:
- Campos obligatorios (nombre, apellido, email, etc.)
- El email debe ser único
- Validaciones HTTP y errores personalizados

---

## 🔧 ¿Cómo ejecutar el proyecto?

### ✅ Opción 1: Ejecutar desde código fuente (IDE como Eclipse)

1. Clona o descarga este repositorio.
2. Abre el proyecto en Eclipse como **proyecto Maven**.
3. Haz clic derecho sobre el proyecto → **Run As** → **Spring Boot App**.
4. Espera a que arranque el servidor (por defecto en el puerto 8080).
5. Abre tu navegador y accede a:

http://localhost:8080/swagger-ui.html

---

### ✅ Opción 2: Ejecutar desde el archivo `.jar` (sin IDE)

> Ideal para usuarios que solo quieren ejecutar la aplicación sin modificar el código.

1. Dentro del repositorio hay un archivo `.jar` generado en la carpeta `target/`.
2. Copia ese archivo a una carpeta deseada, por ejemplo: `C:\Aplicaciones\EstudianteCrud`
3. Abre una ventana de **cmd** en esa carpeta.
4. Ejecuta el siguiente comando:

java -jar crud-estudiante-0.0.1.jar

5. Luego abre en el navegador:

http://localhost:8080/swagger-ui.html

---

## 🧪 Probar la API con Swagger

Swagger UI está disponible en:

http://localhost:8080/swagger-ui.html

Desde ahí puedes probar fácilmente los endpoints: crear, listar, actualizar y eliminar estudiantes.

---

## ⚠️ Consideraciones

- La base de datos H2 es **en memoria**, así que los datos se pierden al reiniciar la aplicación.
- El campo email es único. Si intentas registrar o actualizar un estudiante con un correo que ya existe en otro registro, obtendrás un error 409 Conflict.
- Las validaciones están integradas y devuelven errores claros (400 Bad Request) si faltan campos requeridos.
- Si el puerto 8080 está en uso, puedes cambiarlo en el archivo `src/main/resources/application.properties`:

```properties
server.port=8081

---

## 🗄️ B. Evaluación Desarrollo de Base de Datos Oracle

### 📂 Carpeta: `scripts-bd-oracle/`

Esta carpeta contiene los scripts SQL solicitados para la evaluación de base de datos.

#### 📁 Archivo incluído:

- `script_asignacion_gestion` → Script de base de datos de toda la solución.

#### 💡 Instrucciones:

1. Abrir SQL Developer o cualquier cliente Oracle compatible.
2. Ejecutar los scripts.

> ⚠️ Estos scripts no están integrados directamente con el microservicio, son parte independiente de la evaluación de base de datos.

---

## 📁 Estructura del repositorio

📁 reto-backend-pohar/ → Microservicio Spring Boot
📁 scripts-bd-oracle/ → Scripts SQL de base de datos Oracle
README.md → Documentación principal

---

## 👤 Autor

Este proyecto fue desarrollado como parte de la evaluación técnica para el equipo **Salesforce – POHAR**.
