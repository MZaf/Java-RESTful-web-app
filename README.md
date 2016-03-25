## Java-RESTful-web-app
Restful Java using Spring Framework and Hibernate framework

# domain driven design (DDD) method
This code example follow domain driven design (DDD) method and
TDD, Test driven Developement
The Java Persistence API (JPA) is a Java specification for accessing, 
persisting, and managing data between Java objects / classes and a relational database. 
JPA was defined as part of the EJB 3.0 specification as a replacement for the EJB 2 CMP Entity Beans specification.

This REST controller handles URL end-points that start with /process.
startProcess is called when the URL is /process/start. This is a POST
request. The data in the POST request is mapped to a Process object which
is a domain object from leris-domain. The mapping is done automatically by
spring-rest.

Inside startProcess function, we don’t implement any business logic. It makes
some application logic related setups and then delegates the actual functionality
to ProcessService object which resides in the service layer.


The following references are given for technical professionals to get more
information about DDD:
"Domain Driven Design", Eric Evans
"Implementing Domain-Driven Design", Vaughn Vernon
"Analysis Pattens", Martin Fowler

The introduction to Reactive Programming you've been missing - Andre Staltz
 https://gist.github.com/staltz/868e7e9bc2a7b8c1f754


 
