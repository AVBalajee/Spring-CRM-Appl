# CRM System Project

![CRM System](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQEqa72owApPiIMpA83XNkGgPRBZm38FQbOqw&usqp=CAU)
## Introduction

This is a CRM (Customer Relationship Management) system built using Spring Boot. It helps businesses manage their customer interactions, sales pipelines, and customer support. The system provides features like customer data management, lead tracking, sales forecasting, and support ticket management.

## Dependencies

- Spring Boot: 2.5.3
- Spring Data JPA: 2.5.3
- MySQL Connector: 8.0.26 (Database driver for MySQL)
- Spring Boot DevTools: 2.5.3 (Optional, for development convenience)

## Getting Started

1. Clone the repository: `git clone https://github.com/AVBalajee/Spring-CRM-Appl.git`
2. Set up the MySQL database and configure the `application.properties` file with the appropriate database credentials.
3. Run the application: `./mvnw spring-boot:run` (for Unix-based systems) or `mvnw.cmd spring-boot:run` (for Windows).
4. The application will start at `http://localhost:8080`.

## Endpoints

### Customer Endpoints

- **GET** `/api/customers`: Retrieve all customers.
- **GET** `/api/customers/{id}`: Retrieve a customer by ID.
- **POST** `/api/customers`: Create a new customer.
- **PUT** `/api/customers/{id}`: Update an existing customer.
- **DELETE** `/api/customers/{id}`: Delete a customer.

### Lead Endpoints

- **GET** `/api/leads`: Retrieve all leads.
- **GET** `/api/leads/{id}`: Retrieve a lead by ID.
- **POST** `/api/leads`: Create a new lead.
- **PUT** `/api/leads/{id}`: Update an existing lead.
- **DELETE** `/api/leads/{id}`: Delete a lead.

### Deal Endpoints

- **GET** `/api/deals`: Retrieve all deals.
- **GET** `/api/deals/{id}`: Retrieve a deal by ID.
- **POST** `/api/deals`: Create a new deal.
- **PUT** `/api/deals/{id}`: Update an existing deal.
- **DELETE** `/api/deals/{id}`: Delete a deal.

### Ticket Endpoints

- **GET** `/api/tickets`: Retrieve all support tickets.
- **GET** `/api/tickets/{id}`: Retrieve a support ticket by ID.
- **POST** `/api/tickets`: Create a new support ticket.
- **PUT** `/api/tickets/{id}`: Update an existing support ticket.
- **DELETE** `/api/tickets/{id}`: Delete a support ticket.
