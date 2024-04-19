Simple Rest-Assured API Automation Testing Framework

Example API: https://jsonplaceholder.typicode.com/

Rest-Assured Test case structure:
========================================
    given(): it should contains - body, content type, set cookies, add auth, add param, set headers, etc...
    when(): All requests actions are specified here - get, post, put, delete
    then(): All validation responses - status code, extract response, extract headers, cookies & body

PreConditions/Prerequisites
============================================
* Java JDK 17+, INTELLIJ IDE, Rest Assured Library
* TestNg (testNg plugins on intellij IDE)/Junit, Maven
* Create a new java based maven project (SimpleAPIAutomationFramework)
* Rest Assured documentation url https://rest-assured.io/

Dependencies to be downloaded from maven repository
=======================================================
Download and Install all dependencies from https://mvnrepository.com/
* rest-assured
* json-path
* org.json
* json-schema-validator
* xml-schema-validator
* gson
* testng
* cucumber with testng
* scribejava-apis (To generate fake test data)

Notes
========================================
Hamcrest API library is a transitive dependency that is use to validate and compare data in the response body.
Rest-Assured support BDD Style of writing test cases
You have to know some basics of java programming language
Understand JSON and XML data structures

Statically import
import static io.restassured.response.Response.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

