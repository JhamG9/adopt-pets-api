# Project with Spring Boot + MySql + JWT

---
# REST API - ADOPT PETS

Basic api for an app for adopt pets, manage users and pets

The entire application is contained within the `PetsCrudApplication.java` file.


### Details

    Java Version: 17
    Spring Framework: 3.2.1
    Server Type: MariaDB
    Server version: 0.4.32-MariaDB - mariadb.org binary distribution
    io.jsonwebtoken: 0.11.5



### Request
`GET, POST / USERS`

    curl --location 'http://localhost:8080/api/v1/user'

`GET, POST, DELETE, UPDATE / PET`

    curl --location 'http://localhost:8080/api/v1/pet'
