Basic CRUD Operations on Employee Data using Spring Boot, JPA, Hibernate, and MySQL

This is a simple REST API application that performs basic
  
CRUD (Create, Read, Update, Delete) operations on employee data. It is built using Spring Boot, Spring Data JPA, Hibernate, and MySQL for database management.

for accessing the api for local add it to the end of your ip 
  
list of all the employee in the database
`` 
/api/v1/emp/
``

get the user with specific id takes id from url
``
api/v1/emp/{id}
``

update user get json as body and id from url
``
api/v1/emp/update/{id}
``

add new employee takes json body and convert 
``
api/v1/emp/new
``

delete user from database 
``
api/v1/emp/delete/{id}
``


