# JobOffers

## Description

The application uses a remote server to get current job offers for the position of Junior Java Developer. 

Each job offer includes a link to the offer, position name, company name, and salary. The client can register. 

To view the offers, the client must use a token. 
If the client makes more than one query within 60 minutes, the data should be retrieved from the cache to limit the number of queries to the database. 

The client can manually add a job offer.

## API

### Methods

- **GET** `/offers`
- **POST** `/offers`
- **GET** `/offers/{id}`

## Technologies Used

- **Java 17**
- **Spring Boot** (Web, Test, Data Mongo DB, Validation, Security + JWT)
- **Spring Scheduler**
- **Mongo DB** + Mongo Express
- **Docker** & **Docker-Compose** & **Docker Desktop**
- **Wiremock**
- **Log4j2**
- **Lombok**
- **RestTemplate**
- **Testcontainers**
- **MockMvc**
- **Awaitility**
- **Unit Tests** (JUnit5, AssertJ, Mockito)
- **Integration Tests**
- **Redis** & **Jedis** & **Redis Commander**
- **Maven**
- **Git/GitHub**
- **Swagger**

## API Documentation

See the Swagger documentation at this address: [Swagger UI](http://localhost:8080/swagger-ui/index.html#)
