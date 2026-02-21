Required Sofwares
-----------------
Java: 17
Install PosrgreSQL (Make sure username and password as postgres) (Refer https://www.datacamp.com/tutorial/installing-postgresql-windows-macosx)
After installing postgreSQL 
Execute script located at hotel-ment/blob/main/db_scripts/scripts.sql)
--------------------------
STEPS TO RUN JAR
--------------------------
#Run below command, jar file located at (hotel-ment/hotel-ment-0.0.1-SNAPSHOT.jar)
java -jar hotel-ment-0.0.1-SNAPSHOT.jar
#Config file: src/main/resources/application.yml ( This will have conguration details)
#Default Port is 8084
#Once is up and running hit below url in browser you can see out put as "Hotel details are here.."
http://localhost:8084/hotel

#To STOP the application 
Ctrl+C
