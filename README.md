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
docker build -t hello .

## prod
docker run --name hello --rm -p 5000:5000 hello 

## dev
docker run --name hello --rm -p 5000:5000 -e SPRING_PROFILES_ACTIVE=dev hello
```
