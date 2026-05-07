# CRUD Products API – Spring Boot + JPA

## Descripción
Actividad CRUD desarrollado con Spring Boot, Spring Data JPA y MySQL

La aplicación permite realizar operaciones básicas sobre productos:

- Crear productos
- Obtener productos
- Actualizar productos
- Eliminar productos

Las pruebas de los endpoints fueron realizadas con Postman

## Tecnologías utilizadas

- Java 17
- Spring Boot 2.7.18
- Spring Data JPA
- MySQL
- Gradle
- Postman

## Arquitectura

El proyecto está organizado en capas:

- Controller
- Service
- Repository
- Model

## Endpoints
### GET – Obtener productos
http GET /api/v1/products


### POST – Crear producto
http POST /api/v1/products

Ejemplo Body:

json {   "name": "Producto",   "description": "Prueba CRUD",   "price": 100,   "stock": 5 }

### PUT – Actualizar producto
http PUT /api/v1/products/{id}

### DELETE – Eliminar producto
http DELETE /api/v1/products/{id}

## Base de datos
CREATE DATABASE IF NOT EXISTS product_db;

USE product_db;

show databases;

describe product;

select * FROM product;

## Cómo ejecutar el proyecto

1. Clonar el repositorio
2. Configurar MySQL
3. Crear la base de datos:

sql CREATE DATABASE product_db;

4. Configurar application.properties
5. Ejecutar el proyecto con Gradle

Por: Mariana Gutierrez Almaguer