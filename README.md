using a tutorial to just learn the basics of creating full stack CRUD application
How backend was created: 
* Initial creation using Spring Initializer to create the Springboot application.
* Using XAMMP (X-operating system, Apache, Mysql, Php, Perl) to run mySQL server, using MySQL we are able to create a database for storing the student information
* Creating the model for student class that will have the functions for getting and setting student data
* Creating the other various classes needed to save and get the students using Springboot annotation throughout
* Configuration of Springboot to connect to MySQL server, this was done in the application.properties folder.
* Once we connected to the mySQL database via the mySQL server the program created a student table in the MySQL "fullStack" database to store the data
* Using postman to send post and get requests to test that the program and servers are running properly


youtube video: https://www.youtube.com/watch?v=O_XL9oQ1_To

Stopping place 1/13/22: 6:59

Stopping place 1/16: 12:41

remember to search "osx manager" to find xampp control panel

1/17 21:02
Backend application completed, problems I encountered were: 
* Figuring out how to XAMPP control panel on OSX, it has a different name than XAMPP control panel its called "manager-osx"
* Proper configuration of the XAMPP servers,
had never used them before and in the beginning was struggling to connect mySQL database because of improper configuration of mySQL file. Accidentally granted incorrect privileges in config file. Kept getting a error that my password was wrong even though there was no password.
* Understanding all the annotation that is associated with Springboot
* Minor typos that caused it to crash

Didn't struggle with using postman for get and send requests, I've used it before in previous programs

1/17 Moving on to making the front-end using react