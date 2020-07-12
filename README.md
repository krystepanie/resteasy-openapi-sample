###### Sample OpenApi (swagger) integration with code-gen

There are 2 JAXRS applications: **service** and **client**. 
- **service** provides one simple endpoint: /ping which is documented using swagger.
- **client** application uses auto generated code (by swagger codegen) and request **service** ping endpoint

To run the applications run:

`mvn clean package && sudo docker-compose build && sudo docker-compose up -d`

Service endpoint:

`http://localhost:8080/openapi-service/resources/ping`

Service openapi documentation:

`http://localhost:8080/openapi-service/resources/openapi`

Client endpoint:

`http://locahost:8081/openapi-client/resources/ping`
