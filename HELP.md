step 1 : First we need to start zookeeper server by below query in admin cmd.based on zookeeper properies the server will start and port is 2181
>>cd D:\Softwares\kafka

	 >>start .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

step 2: next we need to start kafka server  by below query in admin cmd.

     >>start .\bin\windows\kafka-server-start.bat .\config\server.properties

step 3: create the topics & list out the topics

	>>start .\bin\windows\kafka-topics.bat --create --topic my-topic --bootstrap-server localhost:9092 --replication-factor 1 --partitions 4
	
	>>start .\bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --list

step 4: if we are consumber then, we need to start consumer by below query.here 9092 is the kafka server port number whic we have already running it

	>>start .\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic my-topic --from-beginning

step 5: if we are producer then, we need to start producer by below query.here 9092 is the kafka server port number which we have already running it

	>>start .\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic my-topic


Request-response (HTTP)

------------------------
Low latency
Typically synchronous
Point to point
Pre-defined API

Event streaming (Kafka)
------------------------

Continuous processing
Often asynchronous
Event-driven
General-purpose events	