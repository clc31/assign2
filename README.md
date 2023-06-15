# assign2
StudentDB

STUDENT DATABASE APPLICATION

This is an application which links up to a SQL database. The homepage shows a list of all students in the database with below attributes:
Student ID (a serial integer)
•	Name
•	Height
•	Weight 
•	Hair Color 
•	GPA
The list will be shown as student icons with different sizes (height = student height/2 pt; width = weight pt). Also the text color = Hair Color. Name and GPA will be displayed inside the icon
This application can maintain the student records via create, update and delete operations.

Create
1.	Click “Add a student” button to launch the form to be filled in
2.	Fill in student information and click “Create” 
3.	Go back to Home page without saving by pressing “Back Home without update”
Update/Delete
1.	Click on student icon to be updated or deleted
2.	Click the “Show Details” button to navigate to the student detail page
3.	For Update, change the values and press “Update” button
4.	For Delete, press delete button
5.	Press “Back home without update” to go back Home page without saving

Validation
•	Name : cannot be blank
•	Height : only integer allowed
•	Weight : only integer allowed
•	Hair Color : only pre-selected options can be selected
•	GPA : numeric between 0 to 4.33
System will prompt message and ask users to correct if the input doesn’t follow the rule
