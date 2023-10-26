# Bidbound_microservice
# Microservices-based Web Application with Spring Boot

## Overview

This is a microservices-based web application built using Spring Boot, Maven, Java, Eureka, Keycloak, and a Gateway. The application is designed to provide a scalable and secure architecture for various components. This README.md file provides a general overview of the project and its structure.

## Project Structure

The project is structured as follows:

- **Service1**: A microservice that serves a specific purpose.
- **Service2**: Another microservice with its functionality.
- **Eureka Server**: Service discovery and registration server for microservices.
- **Keycloak**: An open-source identity and access management solution.
- **Gateway**: Acts as a gateway for routing and load balancing requests to microservices.

## Technologies Used

- **Spring Boot**: For creating microservices.
- **Maven**: For project build and dependency management.
- **Java**: Programming language used.
- **Eureka**: For service discovery and registration.
- **Keycloak**: For identity and access management.
- **Gateway**: For routing and load balancing.

## Getting Started

### Prerequisites

- Java 11 or higher installed.
- Apache Maven installed.
- Docker and Docker Compose (if using for running Keycloak, Eureka, etc.).

### Installation

1. Clone this repository:

   ```bash
   https://github.com/your-username/your-project.git](https://github.com/raed717/Bidbound_microservice.git

To run separated MS expl: 
docker run -p 8761:8761 eureka
docker run -p 8700:8058 usermicroservice

To run all the MS
docker-compose up
