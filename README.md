# APIREST-PostgreSQL-Spring-Boot

Configuración sugerida en el _application.properties_.

```
spring.jpa.database=POSTGRESQL
#spring.datasource.platform=postgres
spring.sql.init.platform=postgres
spring.datasource.url=jdbc:postgresql://localhost:5432/databasePersona
spring.datasource.username=postgres
spring.datasource.password=${pass}
spring.jpa.show-sql=true

spring.jpa.hibernate.ddl-auto: update
#spring.jpa.generate-ddl=true
#spring.jpa.hibernate.ddl-auto=create-drop
#spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
```

Endpoins
Para guardar un persona,

```diff
- POST
http://localhost:8080/api/persona/
```
Body
```
{
"nombre":"nombrePersona",
"apellido":"apellidoPersona",
"correo":"correo@correo.com"
}
```
Para listar todas las personas que fueron guardas
```diff
- GET
http://localhost:8080/api/persona/
```
Para eliminar una persona por su id
```diff
- DELETE
http://localhost:8080/api/persona/{id}
```

Para buscar una persona por su id
```diff
- GET
http://localhost:8080/api/persona/{id}
```



