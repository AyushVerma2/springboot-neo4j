# springboot-neo4j

# Spring Boot with SpringData Neo4J
Users rate different movies (like IMDB). Hence Users will have RATED relationship on Movies.

## Version used
- Spring Boot - 2.2.4.RELEASE
- Neo4J Bolt Driver - 3.2.8

## REST endpoint
- `/rest/test/user` - returns all users and their relationships (movies)


## Cypher Queries for Neo4J
- Creation of Movie and User nodes:

```
CREATE (Inception:Movie {title: 'Inception', director: 'Christopher Nolan'})
CREATE (DarkKnight:Movie {title: 'The Dark Knight', director: 'Christopher Nolan'})
CREATE (Peter:User {name: 'test3', age: 30})
CREATE (Sam:User {name: 'Abc', age: 20})
CREATE (Ryan:User {name: 'Test2', age: 44})

CREATE
(Inception)-[:RATED {rating: 9}]->(Peter),
(Inception)-[:RATED {rating: 8}]->(Sam),
(DarkKnight)-[:RATED {rating: 9}]->(Sam),
(DarkKnight)-[:RATED {rating: 8}]->(Peter)

;
```
- Adding new relationship

```
MATCH (DarkKnight:Movie {title: 'The Dark Knight'}), (Ryan:User)
CREATE
(DarkKnight)-[:RATED {rating: 8}]->(Ryan)
;
```
