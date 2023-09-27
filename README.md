Project
=============
Please use this template for your project.

How to use 
=============
1. open zookeeper
````
zkServer
````
2. open kafka
```
  .\bin\windows\kafka-server-start.bat .\config\server.properties
```
3. create filmingmovie
```
  ./kafka-topics.bat --create --topic filmingmovie --bootstrap-server localhost:9092
```
```
  ./kafka-topics.bat --list --bootstrap-server localhost:9092
```
4. use filmingmovie
```
  ./kafka-console-consumer.bat --topic filmingmovie --from-beginning --bootstrap-server localhost:9092
```
List your group's member's below.
=============
1. 652110280 Nuddanai Klaiklin
2. 652110318 Jeeraphat Chantra
3. 652110299 Methinee Phormsorn




