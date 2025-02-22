# Mailchimp Microservices API

Este es un proyecto basado en **Spring Boot** que implementa una arquitectura de **microservicios** para interactuar con el API de **Mailchimp**. El sistema está compuesto por los siguientes servicios:

- **API de consumo de Mailchimp**: Gestiona las solicitudes a la API de Mailchimp.
- **API Gateway**: Encaminador de peticiones hacia los microservicios.
- **Eureka Server**: Servicio de descubrimiento de microservicios.
- **Config Server**: Gestión centralizada de configuraciones.

## 🛠 Tecnologías utilizadas
- **Java 17+**
- **Spring Boot**
- **Spring Cloud (Eureka, Config, Gateway)**
- **OpenAPI (Swagger) para documentación**
- **Docker (opcional, para despliegue)**

## 🚀 Instalación y configuración

### 1. Clonar el repositorio
```sh
git clone https://github.com/TU_USUARIO/TU_REPO.git
cd TU_REPO
# mailchimp-ms
```

### 2.  Configurar variables de entorno
Crea un archivo .env o configura las variables en application.yml:
```sh
mailchimp.api-key: TU_API_KEY
mailchimp.base-url: https://usX.api.mailchimp.com/3.0
```

### 3. Ejecutar los servicios
Para iniciar los microservicios en orden:
```sh
# Iniciar Eureka Server
cd eureka-server
mvn spring-boot:run

# Iniciar Config Server
cd ../config-server
mvn spring-boot:run

# Iniciar API Gateway
cd ../api-gateway
mvn spring-boot:run

# Iniciar API Mailchimp
cd ../mailchimp-service
mvn spring-boot:run
```

## 📌 Endpoints principales
**Una vez en ejecución, puedes acceder a:**

- **Swagger UI:** http://localhost:8080/swagger-ui.html
- **Eureka Dashboard:** http://localhost:8761
- **API Mailchimp (Ejemplo):**
```sh
  curl -X GET "http://localhost:8080/api/mailchimp/lists" -H "Authorization: Bearer TU_API_KEY"
```

## 🤝 Contribuir
**Si quieres colaborar:**

Fork y clona el repositorio.
Crea una rama (git checkout -b feature/nueva-funcionalidad).
Realiza cambios y haz un commit (git commit -m "Descripción del cambio").
Sube la rama (git push origin feature/nueva-funcionalidad).
Abre un Pull Request 🚀.

## 📄 Licencia
**Este proyecto está bajo la licencia MIT.**