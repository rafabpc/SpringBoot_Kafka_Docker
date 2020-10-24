
# How to Run

## 1 - Build the APP

```mvn clean compile install```


## 3 - Build the APP docker image

```docker build -f Dockerfile -t application-example:1.0 .```


## 4 - Run the docker-compose.yml

```docker-compose up```


## 5 - Executing the application

```@see Postman Collection (SpringBootKafkaDockerCollection.postman_collection.json)```


# Docker
The configuration for Docker can be seen in:

```Dockerfile```

```docker-compose.yml```


# Kafka + ZooKeeper
There is a trick to run the application + kafka + zookeeper in a docker container.

The Kafka host name for the application's access must be the Kafka Docker name defined.

The configuration for Kafka and ZooKeeper can be seen in: 

```src > main > resources > application.properties```

```docker-compose.yml```
