# aircraft-rest-api
REST API example with consuming JS client.

This example is a Spring Boot application for easy deployment.  Maven project has been configured to create a fatjar.  To build and
repackage the JAR file with all the dependencies run the following from the root of the project: -
> mvn clean compile package spring-boot:repackage

To start the application, from a command prompt: -
> cd target
> java -jar airline-list-0.0.1-SNAPSHOT.jar

To view the data from the consuming client, open up a browser and enter the following address: -
http://localhost:8080

The backend application uses Hibernate, H2 database and Spring Boot (Data and JPA).  The consuming client is a simple HTML page with
some javascript to perform the API call and present the data into tabular form.  I've attempted to show error messages if the backend call
fails or if no data is returned.

When the application is running, you can view the H2 database console from http://localhost:8080/h2_console

JDBC URL: jdbc:h2:~/vistair
user: vistair
password: vistair

Some areas for improvement: -
* Adding the ability to sort by a particular field.
* Adding pagination to the results for large dataset.
* Being able to filter the results for a given airline, aircraft type or aircraft manufacturer.
* Utilising newer Java 8 features, such as lambda in the service layer when constructing the list of maps.
* Presenting the data in different ways other than tabular data.
* More fully developed feature set allowing all CRUD features to be implemented.
