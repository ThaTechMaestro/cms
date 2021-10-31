# CMS
* A RESTful api for a Course Management System
* The resources includes Topic, Course, Lesson
* Different Courses can be accessed for a particular topic
* Each Courses consists of different Lesson

# Development: Version 1
The first working version for the Course Management API

## Overview
* Code changes for this version can be seen with the commit tag "version1:commit_message"
* Development of the Topic Resource

## Implementing the following CRUD features for the Topic resource
- Accessing all the available topics
-  Accessing a particular topic
- Add a paritcular topic
- Updating a particular topic
- Deleting a particular topic

## Data Layer:
* No database was used in this version, the topic was created as an object utilising a service class implementation
* Each topic is added as an object and stored in a list, which is created on request but created only once via a service class(Singleton)

## Concepts Learned
* A fundamental understanding of RESTful APIs
* Implemented CRUD operations

## Used
* Spring MVC
* Spring Boot