# wsdlTestService
Test web service for getting information about person

1. Contract last web service implementation in netbeans
2. pakage of service - com.mycompany.testperson
3. package of local client for testing service - com.mycompany.client
4. Database on DerbyDb used with jdbc/DerbyRes
5. Just download netbeans IDE with Glassfish
6. Create database in derbyDB (User=TestUser) named Person 
CREATE TABLE TESTUSER.PERSON
	(ID INT NOT NULL GENERATED ALWAYS AS IDENTITY
	CONSTRAINT PEOPLE_PK PRIMARY KEY, NAME VARCHAR(255), POSITION varchar(255), age varchar (3), salary varchar (255));
  7.  My test data
-----
insert into  person    values (1, 'VASYA PUPKINUT','Java developer', '21', '100');
insert into  person    values (2, 'VASYA PUPKIN','Java developer', '22', '100');
insert into  person    values (3, 'VASYA PUPKIN jr','Java developer', '15', '50');
insert into  person    values (4, 'MASHA IVANOVA','Team Lead', '30', '200');
insert into  person    values (5, 'FEDYA SMIRNOV','HR', '35', '210');
----
8. need to create jdbc/Derbyres and wire with jdbc/DerbyRes-pool in glassfish with http://localhost:4848 console
