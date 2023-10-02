Project
=============
Please use this template for your project.

How to use 
=============
Get Start With Outside The `Visual studio Code`
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
Inside The `Visual Studio Code`

1.  Run `EurekaMainpageServerApplication` in folder eureka-mainpage-server
2.  Run `FilmingmovieMicroservicApplication` in folder filmingmovie-microservice
3.  Run `TransactionConsumerApplication` in folder  pubsub-filmingmovie


Complete the JPA
=============
In `filmingmovie-microservice`, the `Advertise` ,`Award` ,`Company` ,`Director` and `Movie` classes are included. This project serves database to the system using JPA. You need to add annotations to these classes. You may follow the following guideline:
- add @Entity to the every entity class.
- add @Id and @GeneratedValue to the attribute that will be used as primary key.
- add relationship annotation to an attribute that link to the other class such as @ManyToOne with proper fetch and cascade so that when a post is fetched, user is also fetched if existed. When a post is saved, its author is also saved. Many posts can be created by a user.

# Complete the rest Service
In `filmingmovie-microservice`, the service is to provide a basic REST interface as follows:
### AdvertiseController
- `POST /advertises`. Creates a `Concert`. The body of the HTTP request message contains a representation of the new concert (other than the unique ID) to create. The service generates the concert's ID via the database, and returns a HTTP response of 201 (created).
### AwardController
- `GET /awards/{name}`. Retrieves name of a `Award`, identified by its unique ID. The HTTP response message should have a status code of either 200 (OK) or 404 (File not found), depending on whether the specified concert is found.

- `POST /awards `. Creates a `Award`. The body of the HTTP request message contains a representation of the new award (other than the unique ID) to create. The service generates the concert's ID via the database, and returns a HTTP response of 201 (created).
### DirectorController
- `PATCH /directors/{id}`. Updates some field an existing `Director`. A representation of the modified director is stored in the body of the HTTP request message. Being an existing director that was earlier created by the Web service, it should include a unique ID value. The HTTP status code should be 204 on success, or 404 where the director isn't known to the Web service.

- `GET /directors`. Retrieves all `Director`s. The HTTP response message should have a status code of 200 (OK) on success.

- `POST /directors`. Creates a `Director`. The body of the HTTP request message contains a representation of the new director (other than the unique ID) to create. The service generates the director's ID via the database, and returns a HTTP response of 201 (created).
  
- `PUT /directors`. Updates an existing `Director`. A representation of the modified concert is stored in the body of the HTTP request message. Being an existing director that was earlier created by the Web service, it should include a unique ID value. The HTTP status code should be 204 on success, or 404 where the director isn't known to the Web service.

- `DELETE /directors/{id}`. Deletes a `Director`, where the director to delete is specified by a unique ID. This operation returns either 204 (no content) or 404, depending on whether the director exists.

- `DELETE /directors`. Deletes all `director`s, and returns a 204 (no content) status code.

### MovieController
- `PATCH /movies/{id}`. Updates some field an existing `Movie`. A representation of the modified movie is stored in the body of the HTTP request message. Being an existing movie that was earlier created by the Web service, it should include a unique ID value. The HTTP status code should be 204 on success, or 404 where the movie isn't known to the Web service.

- `GET /movies`. Retrieves all `Movie`s. The HTTP response message should have a status code of 200 (OK) on success.

- `POST /movies`. Creates a `Movie`. The body of the HTTP request message contains a representation of the new movie (other than the unique ID) to create. The service generates the movie's ID via the database, and returns a HTTP response of 201 (created).
  
- `PUT /movies`. Updates an existing `Movie`. A representation of the modified concert is stored in the body of the HTTP request message. Being an existing movie that was earlier created by the Web service, it should include a unique ID value. The HTTP status code should be 204 on success, or 404 where the movie isn't known to the Web service.

- `DELETE/movies/{id}`. Deletes a `Movie`, where the movie to delete is specified by a unique ID. This operation returns either 204 (no content) or 404, depending on whether the movie exists.

- `DELETE /movies`. Deletes all `Concert`s, and returns a 204 (no content) status code.

# Complete the Repository
In `filmingmovie-microservice`, This interface is a Spring Data repository that uses JPA to access the database. It should extend CrudRepository as following guideline:
### AdvertiseRepository
- Only extend `CrudRepository <Advertise,Long>`
### AwardRepository
- Extend `CrudRepository <Award,Long>`
- Define a single method `findByName(String name)` that returns a Award given its name.
### DirectorRepository
- Extend `CrudRepository <Director,Long>`
- Define a single method `findAll()` that returns a all of directors.
### MovieRepository
- Extend `CrudRepository <movie,Long>`
- Define a two method `findByTitle(String title)` and `findAll()` that that returns a Movie given its title and sort them all.

# PubSub Model
![Alt text](image.png)
# List your group's member's below.
1. 652110280 Nuddanai Klaiklin
2. 652110318 Jeeraphat Chantra
3. 652110299 Methinee Phormsorn




