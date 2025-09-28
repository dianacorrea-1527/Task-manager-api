# 📒Todo List App - Full Stack

Aplicación completa para gestión de tareas desarrollada con Spring Boot (backend) y Angular (frontend).

## ⚒️Stack Tecnológico

### 🔶Backend
- **Java** + **Spring Boot**
- **Spring Data JPA** + **Hibernate**
- **PostgreSQL**
- **Maven**

### 🔷Frontend
- **Angular** + **TypeScript**
- **HTML5** + **CSS3**
- **RxJS** + **Angular HttpClient**

## 🚀 Instalación y Ejecución

### ✍️ Prerrequisitos
- Java 11 o superior
- Node.js 16+ y npm
- PostgreSQL instalado y ejecutándose

###  1. ⚙️ Configuración del Backend
cd backend
./mvnw spring-boot:run

text
El servidor estará en: `http://localhost:8080`

### 2. 🎨 Configuración del Frontend
cd frontend
npm install
ng serve

text
La aplicación estará en: `http://localhost:4200`

## 📁 Estructura del Proyecto
proyecto-todo-list/
├── backend/ # API REST con Spring Boot
└── frontend/ # Cliente web con Angular

text

## 🔌Endpoints de la API

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | `/api/tasks` | Obtener todas las tareas |
| POST | `/api/tasks` | Crear nueva tarea |
| PUT | `/api/tasks/{id}` | Actualizar tarea |
| DELETE | `/api/tasks/{id}` | Eliminar tarea |

## 📊 Estado del Proyecto

**En desarrollo** - Funcionalidades básicas implementadas

### 🆗 Completado
- [x] API REST con Spring Boot
- [x] Frontend básico con Angular
- [x] Conexión backend-frontend

### 📅 Próximas características
- [ ] Autenticación de usuarios
- [ ] Diseño responsive mejorado
- [ ] Despliegue en la nube

---

**Desarrollado por Diana Correa**  
[GitHub Profile](https://github.com/dianacorrea-1527)

