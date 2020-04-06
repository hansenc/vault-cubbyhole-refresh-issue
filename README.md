###Issue description

A `RefreshScope` refresh triggers Vault re-authentication, which fails with 
`cubbyhole` authentication mode, causing the refresh to fail.

###Steps to reproduce

1. Start up and initialize Vault: `docker-compose up -d`
1. Copy the wrapped token from the output. Note: currently this is output as `vault_1  | <token value>+ echo` where the `+` is not part of the token. 
1. Run the Spring Boot app: `mvn clean spring-boot:run -Dspring.cloud.vault.token=<wrapped token from the docker-compose output>`
1. Trigger refresh: `curl -X POST localhost:8080/actuator/refresh`
