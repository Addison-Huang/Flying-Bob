# Program Name: Flying Programming
##### Final Project Repository for Team Flying Bob
##### Roster: Shayan Chowdhury, Jerry Ye, Addison Huang

### Description of Project
This is Team Flying Bob's APCS02 Final Project which is intended to make use of various algorithms and data structures that we have learned throughout the course of our term together. Our project is intended to be a simulator of a programming application at Stuyvesant High School in the terminal. Those running our application will be able to create accounts as students, and request classes(automatically gets put into a waitlist if nothing is done by administrator) that are already in the system. These students will also be able to check their stats on their account. There will also be administrator account types. One cannot create an administrator account, however, please find below an already seeded administrator account's login information in our description of how to run the project. Administrators have access to most of the system. They can change the stats of any students. They can generate schedules using the waitlists for seperate classes. They can also create any classes or student users they would like to. 
### How Our Project works
Our project makes use of many of the algoirthms and data structures that we have learned throughout the APCS Data Structures and Algorithms class that we've been taking. We use heap sort to sort students after data is seeded in inside LStudents. We also use quick sort to sort courses after sample data is seeded in from the administrator account. After schedules have been created, a PriorityQueue is also turned into a waitlist as a queue of students who would still like to take a specific course. We take advantages of stacks when reversing a schedule in printReverseSchedule as well. Lastly, we were unfortunately, not able to generate schedules with a recursive back tracking algorithm, however, we did manage to add a fun option to student: the ability to try to hack the administrator account. The student uses recursive backtracking to guess a 5 character password, and shows it to the user. Additionally, we also use csv files to keep track of data in this in-terminal simulation. At the beginning of every simulation we seed all of the data inside the csv files(StudentData.csv and CourseData.csv) into two ArrayLists inside LStudent and LCourse respectively. At the end of the user's interaction, we rewrite LStudent and LCourse into both csv data files respectively. 
### Launch Instructions
1. Clone the repo 

`$ git clone https://github.com/raywu6/LosPepinos.git`

2. Compile Woo.java

`$ javac Woo.java`

3. Run Woo

`$ java Woo`

4. Follow the in-terminal user prompts given to you. 
Here lies administrator access, tread waters carefully! 
User: admin
Pass: admin
