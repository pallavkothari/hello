# hello

```bash
mvn clean install 
SPRING_PROFILES_ACTIVE=dev mvn spring-boot:run
curl localhost:5000
curl http://localhost:5000/greeting/moto
open http://localhost:5000/swagger-ui.html
```

docker
```bash
docker build -t hello:0.0.1 .

## prod
docker run --name hello --rm -p 5000:5000 hello:0.0.1 

## dev
docker run --name hello --rm -p 5000:5000 -e SPRING_PROFILES_ACTIVE=dev hello:0.0.1
```
