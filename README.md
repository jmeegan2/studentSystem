using a tutorial to just learn the basics of creating full stack c rud application
How backend was created: 
* Initial creation using Spring Initializer to create the Springboot application
* Using XAMMP to run mySQL server and APACHE web server so we could run the program
* Creating the model for student class that will have the functions for getting and setting student data
* Creating the other various classes needed to save and get the students using Springboot annotation throughout
* Configuration of Springboot to connect to mySQL server, this was done in the application.properties folder.
* Once we connected to the server the program created a student table in the fullStack file to store the data
* Using postman to send post and get requests to test that the program and servers are running properly



youtube video: https://www.youtube.com/watch?v=O_XL9oQ1_To

Stopping place 1/13/22: 6:59

Stopping place 1/16: 12:41

Got it to connect my sql database,currently using most recent java jdk version because it couldn't compile without. Was struggling to connect mySQL database because of improper configuration of mySQL file. Accidentally granted incorrect privileges in config file.
remember to search "osx manager" to find xampp contol panel

1/17 21:02
Backend application completed, problems I encountered were: 
* proper configuration of the XAMPP servers,
had never used them before and in the beginning I accidentally granted the wrong permissions and had
to restart with a new mySQL database to make it work. Kept getting a error that my password was wrong
even though there is no password. 
* Understanding all the annotation that is associated with Spring BOOT
* Minor typos that caused it to crash

Did struggle with using postman for get and send requests, I've used it before in previous applications
