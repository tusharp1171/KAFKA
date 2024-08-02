# KAPKA

1. Navigate to Kafka Directory
   cd path\to\kafka
2. Start Zookeeper Server
   .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
3. Start Kafka Server
   .\bin\windows\kafka-server-start.bat .\config\server.properties
4. Create a Topic
   .\bin\windows\kafka-topics.bat --create --topic your_topic_name --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1
5. List Topics
   .\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092
6. Produce Messages to a Topic
   .\bin\windows\kafka-console-producer.bat --topic your_topic_name --bootstrap-server localhost:9092
7. Consume Messages from a Topic
   .\bin\windows\kafka-console-consumer.bat --topic your_topic_name --from-beginning --bootstrap-server localhost:9092
8. Delete a Topic
   .\bin\windows\kafka-topics.bat --delete --topic your_topic_name --bootstrap-server localhost:9092
9. Stop Kafka Server
    .\bin\windows\kafka-server-stop.bat
10. Stop Zookeeper Server
    .\bin\windows\zookeeper-server-stop.bat
11. Set JAVA_HOME (if needed)
    setx -m JAVA_HOME "C:\Java\jdk21
    
  
