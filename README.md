# KafkaProducerConsumer

Command to run Kafka Producer and Consumer With Spring Boot

C:\Kafka\bin\windows>zookeeper-server-start.bat ../../config/zookeeper.properties

C:\Kafka\bin\windows>kafka-server-start.bat ../../config/server.properties

C:\Kafka\bin\windows>kafka-topics.bat --zookeeper localhost:2181 --topic mytopic2 --create --partitions 3 --replication-factor 1

C:\Kafka\bin\windows>kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic mytopic

--String Producer
C:\Kafka\bin\windows>kafka-console-producer.bat -broker-list localhost:9092 -topic mytopic

--Json producer
C:\Kafka\bin\windows>kafka-console-producer.bat -broker-list localhost:9092 -topic mytopic2

{"name":"JsonMsg2","dept":"Technology2","salary":12002}


http://localhost:8086/kafka/Json/JsonMsg

http://localhost:8086/kafka/JsonMsg
