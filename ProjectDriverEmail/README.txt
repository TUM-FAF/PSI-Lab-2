PSI LabWork #2
Test descriptions (User story):

As a client I want to connect to the server using sockets so that I could send to this server some data.

As a server I want to connect to the database so that I could find the email of a driver.

As a server I want to send an email to people who have parked illegal so that every pedestrian could be happy.

Description of the classes that implements those three functionalities:
connetToDB - class responsible to connect to database and select some information
EmailSend - sends the emails using an exterior mail.proprieties file to store the email configurations
Client- connects to the server and sends some information.
Server- receives the information form client class and processes it.

