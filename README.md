# Program Name: Flying Programming
##### Final Project Repository for Team Flying Bob
##### Roster: Shayan Chowdhury, Jerry Ye, Addison Huang

### Description of Project
This is Team Flying Bob's APCS02 Final Project which is intended to make use of various algorithms and data structures that we have learned throughout the course of our term together. Our project is intended to be a simulator of a programming application at Stuyvesant High School in the terminal. Those running our application will be able to create accounts as students, and request classes(automatically gets put into a waitlist if nothing is done by administrator) that are already in the system. These students will also be able to check their stats on their account. There will also be administrator account types. One cannot create an administrator account, however, please find below an already seeded administrator account's login information in our description of how to run the project. Administrators have access to most of the system. They can change the stats of any students. They can generate schedules using the waitlists for seperate classes. They can also create any classes or student users they would like to. 
### How Our Project works
Our project is largely reliant on data. We are going to use CSVs to store data that is seeded into the java system as soon as the program begins running. The CSV files will also be updated as the program is exited. Additionally, we also make use of all of the algorithms and data structures in the creation of our final project. Our waitlist for each seperate class is a PriorityQueue that prioritizes students based on their GPA's and grade level. Recursive backtracking is also used to implement the generation of the schedules. 
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
