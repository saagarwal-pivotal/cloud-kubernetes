# Spring cloud kubernetes
-----

### Depenedencies
```
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-kubernetes-all</artifactId>
</dependency>
```

#### Step 2

```
Add this annotation to main class 

@EnableDiscoveryClient

@Autowired
private DiscoveryClient discoveryClient;

```

### Docker Build

```
docker login --username=satya108agarwal --email=youremail@company.com

docker build -t hello-kubernetes .

docker images

docker tag {{imageid}} {{dockerhubusername}}/{{image_name}}:{tag}

docker push {{dockerhubusername}}/{{image_name}}:

docker run -p 8080:8080 -t springio/gs-spring-boot-docker

```

### Spring boot Docker(https://spring.io/guides/gs/spring-boot-docker/)

```

mvn com.google.cloud.tools:jib-maven-plugin:build -Dimage=satya108agarwal/hello


```

### kubernetes Config Map

```
kubectl create configmap hello --from-literal=special.how=very --from-literal=special.type=charm
```

### Kubernetes port forward 

```
kubectl port-forward svc/hello 8080:8080
```

#### kubernetes Create Secret

```

kubectl create secret generic db-secret --from-literal=username=user --from-literal=password=p455w0rd
```