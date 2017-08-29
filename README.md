# LibraryProject
Library App is simple project to search student and books by their credentials.
Running LibraryApp
To use this App, download it to your local machine and use NetBeans.        
Go to File-> Open Project-> /path to your project/
Import the sql file to your local database. To import use "command line" or any other software. In our case we used "phpmyadmin"
Then change the line in DB class that is used to connect to database. Write your own "username" , "password", “databasename”

24.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/”databasename”?useEncoding=true&characterEncoding=UTF-8", "username", "password");


# Building LibraryApp

First create maven project in NetBeans. Go to File->new->maven->web application.
Fill all the required fields.

Create 3 different jsp pages, which will accept user inputs. First page "index.jsp" will accept either student name or book name.
The second page "AdvancedSt.jsp" will accept multiple user inputs to search a stundent(Advanced student search).
The third page "AdvancedBook.jsp" will accept multiple user inputs to search books(Advanced book search).
Each of this page consist of forms with different inputs. To handle them in our servlet class 
we will need to assign name attribute to each of our submit button.

Then we must design our database. In our case we will use mysql. We will have 3 different tables

Student 	  	Book		   Orders
id			      id		     id
name		    	name		   student_id
surname		  	publisher 	book_id
birth_date

Then to connect to our database we will need to add MySQL dependency. 
Go to dependencies on your project -> right click -> add dependency-> search for mysql_artificat_id_0.1.jar

Then we will need to create 3 different java classes. Go to Source Packages->right click->new-> java class->Student
Our Student class will hold all the info about students Name, Surname, Birth_date. You will need to create constructor along with getters and setters.
Create Book class following the same instructions.
Finally, we will need to create DB class which will initialize database connection and will contain all the queries.

First query: get all the rows from db according to the given name of the student.
Second query: get all the rows from db according to the given name of the book
Third query: get all the rows from db according to the given name and surname of the student
Forth query: get all the rows from db according to the given name, surname and age of the student
Fifth query: get all the rows from db according to the given name, author, publisher of the book

After completing these steps, we will need to create a servlet class which will display the results.
To create the servlet class right click on project->new->servlet
Our servlet class will handle all the post methods. We will write if statements to check which post method have been called.
Followingly, it will display the results of our database queries by calling the suitable method of our DB class.

After checking that our application runs properly, we will have to create a web service for this app. To create web service Go to project ->
right click-> new-> web service or we can add a java class and put "@WebService" annotation right above class declaration.
In our case we will add a java class to com.business package. 
This class will have methods that accept the parameters and will return corresponding methods of db instance.
In our case we will have 5 methods
getStudent(String name);
getStudent(String name,String surname);
getStudent(String name,String surname,int age);
getBook(String name);
getBook(String name,String author,String publisher);

Testing phase
In this phase of our project development we will need to test our app. First we will make some inputs required, so that at least one of the inputs have the value.
Then we will test if we get any errors when other inputs left empty. Finally, we will handle the input corresponding to age which must be a number, otherwise 
we will print error message to the screen.



# Important decisions made during project lifecycle:
Switching from eclipse to NetBeans.
Using age instead of birthdate as an input in advanced student search page

# Additional notes
Please use browsers "chrome 8.0+", "opera 10.0+", "Firefox 4.0+" to run this app, otherwise you might get errors.



