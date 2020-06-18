# Getting Started

This is a Spring boot service to consume a kafka json message. The consumed message is stored in Cassandra db.

This service also has end points to query the cassandra db.

## Building
Dependencies:
- Java 11
- Maven
- Kafka
- Zookeeper
- Cassandra
- Docker

Build:
```$xslt
mvn clean install
```
Run:
```$xslt
cd target
java -jar learn-cassandra-springboot-0.0.1-SNAPSHOT.jar
```
### Service Endpoints
- GET: http://localhost:8082/api/v1/nosql/person/all
- GET: http://localhost:8082/api/v1/nosql/person/{name}

### Installing Cassandra using Docker
```$xslt
docker run -p 9042:9042 cassandra:latest
```
Querying the DB:
```$xslt
cqlsh:learn_cassandra> select * from person;

 id   | email               | name
------+---------------------+------
 1000 | tim@somecompany.com |  Tim

(1 rows)
```