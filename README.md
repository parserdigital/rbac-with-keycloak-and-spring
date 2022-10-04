# RBAC with Keycloak and Spring

This project contains two small Spring Boot applications that show how to integrate
Keycloak into our systems and how to secure access to endpoints or application resources based on different roles.

## IAM-Service

This application has been created to show how easy is to use the Keycloak SDK to communicate with 
the main features of the Keycloak admin console such us:
* user registration/activation
* user account updates (password change)
* user account deletion
* login

For more information about this service, please visit this [section](iam-service/README.md) 

## Keycloak example

This application has been created to show how to integrate with keycloak for authentication (keycloak can provide a login 
page or an endpoint to get a JWT token) and authorization (using keycloak users).  
The application provides 4 web pages that can be only accessed with specific authorities.

For more information about this service, please visit this [section](rbac-keycloak-example/README.md) 
