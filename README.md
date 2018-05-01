[![Docker Build Status](https://img.shields.io/docker/build/pallavkothari/hello.svg)](https://hub.docker.com/r/pallavkothari/hello/builds/) [![Docker Automated build](https://img.shields.io/docker/automated/pallavkothari/hello.svg)](https://hub.docker.com/r/pallavkothari/hello/builds/) 
[![Travis](https://img.shields.io/travis/pallavkothari/hello.svg)](https://travis-ci.org/pallavkothari/hello)


    


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

releasing (triggers a versioned build on [dockerhub](https://hub.docker.com/r/pallavkothari/hello/tags/))  
the [travisci](https://travis-ci.org/pallavkothari/hello/builds) job pushes to [this docker repo](https://hub.docker.com/r/pallavkothari/hello-travis/tags/)
and will handle [PRs](https://travis-ci.org/pallavkothari/hello/pull_requests) as well. 
```bash
git tag -am "fancy release" 0.0.1 
git push --tags
```
