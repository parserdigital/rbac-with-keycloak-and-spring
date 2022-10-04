# IAM Service

## Requisites

* **Keycloak**: You'll need an instance of Keycloak running in your localhost (default port 8080). This project was developed using the v19.x, so we highly recommend you to download this version from [their site](https://github.com/keycloak/keycloak/releases/download/19.0.2/keycloak-19.0.2.zip).
* **Postgres DB**: This service uses a Postges DB to create and store tokens associated to new accounts in order for them to be activated
* **FakeSMTP**: In order to simulate the email for the account activation, we use a jar containing a fakeSMTP server. You can find it on this repo under [this directory](../etc/fakeSMTP-2.0.jar)
* **Postman (optional)**: There is a postman collection in [this directory](../etc/postman) already configured with all the operations supported by the service. You can use it to test any operation.

## How to start the application

### 1. Build the artifact
```
mvn clean package  
```

### 2. Build Docker Image
```
docker build -t chapter_backend/iam-service .   
```

### 3. Run Docker Image
```
docker run -p 8081:8081 chapter_backend/iam-service   
```

## Access the Swagger-UI

Once the service is running, you can access the swagger ui to see all the existing endpoints under this url:

```
http://localhost:8081/swagger-ui/index.html
```