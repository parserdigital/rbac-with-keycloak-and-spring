# RBAC with Keycloak Example Service

## Requisites

* **Keycloak**: You'll need an instance of Keycloak running in your localhost (default port 8080). This project was developed using the v19.x, so we highly recommend you to download this version from [their site](https://github.com/keycloak/keycloak/releases/download/19.0.2/keycloak-19.0.2.zip).
* **Postman (optional)**: There is a postman collection in [this directory](../etc/postman) already configured with all the operations supported by the service. You can use it to test any operation.
* **Web browser**: The application is developed using thymeleaf, so it can be accessed on a web browser on:
  * [contact us](http://localhost:9081/developer/contac-us): Open page for all users.
  * [home](http://localhost:9081/developer/home): Requires USER authority.
  * [developer environment](http://localhost:9081/developer/developer-environment): Requires DEVELOPER authority.
  * [admin console](http://localhost:9081/developer/admin-console): Requires ADMIN authority.

## How to start the application

### 1. Build the artifact
```
mvn clean package  
```

### 2. Build Docker Image
```
docker build -t chapter_backend/rbac-keycloak-example .   
```

### 3. Run Docker Image
```
docker run -p 9081:9081 chapter_backend/rbac-keycloak-example   
```