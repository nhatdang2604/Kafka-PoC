# A note while learning to use Kafka

[reference](https://medium.com/@sumanthshastry/install-kafka-zookeeper-using-docker-container-in-windows-7abbddbde0be)

# How to run

## Start Kafka cluster + Zookeeper cluster

Run with the following command:

```
docker compose up
```

## Build and run the producer
Run with the following command
```
docker build ./OrderService -t order-service
```

Open another shell, then run:
```
docker run \
    --rm \
    --name order-service \
    --publish 8081:8081 \
    --add-host=host.docker.internal:host-gateway \
    order-service
```
