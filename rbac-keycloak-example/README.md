# RBAC with Keycloak Example Service

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