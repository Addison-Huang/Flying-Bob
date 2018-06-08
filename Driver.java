import java.io.IOException;
import java.io.FileNotFoundException;

public class Driver {

    public static void main (String[] args) throws FileNotFoundException, IOException {
        Woo test = new Woo();

        String studentData = "Username,Password,Grade,GPA\n";
        studentData += "Bob,bobspass,11,4.0\n";
        studentData += "Joe,joe99,11,3.8\n";
        studentData += "Kate,llamas4lyfe,10,3.8\n";
        studentData += "Carol,beststudent,10,4.1\n";
        studentData += "Jack,bobspass,11,4.0\n";
        studentData += "Allison,noodles,9,2.9\n";
        studentData += "Harry,geomajor49,12,3.5\n";
        studentData += "Jerry,tronono,11,4.0\n";
	studentData += "Jenny,sleep,11,3.5\n";
	studentData += "Kelp,spongebob,11,3.9\n";
	studentData += "Kane,patrick,11,2.3\n";
	studentData += "Sam,Adams,11,2.1\n";
	studentData += "Main,lose,11,2.9\n";
	studentData += "Arch,hunch,12,3.0\n";
	studentData += "Lane,car,9,3.0\n";
	studentData += "Rick,Morty,9,1.0\n";
	studentData += "Pickle,Rick,9,1.1\n";
	studentData += "Happy,Birthday,9,1.5\n";
	studentData += "KimJongUn,Nuke,9,3.1\n";
	studentData += "MaoZedong,Commies,9,2.6\n";
	studentData += "AbrahamLincoln,slaves1,10,2.3\n";

        IOTools.writeStudent(studentData, false);

        String courseData = "Teacher,Subject,Period,Waitlist|Roster\n";
        courseData += "Mr.Ye,Math,1,10,11,12|2,3,4,1\n";
        courseData += "Mr.Hooper,English,2,10,11,12|2,3,4,1\n";
        courseData += "Ms.J,ComputerScience,3,10,11,12|2,3,4,1\n";
        courseData += "Mr.President,EmailHacking,1,13,14,15|5,6,7,8\n";
	courseData += "Dr.Opus,Genetics,2,13,14,15|5,6,7,8\n";
	courseData += "Dr.Strange,Chemistry,3,13,14,15|5,6,7,8\n";
	courseData += "Mrs.Cool,USH,1,16,17,18|9,10,11,12\n";
	

        IOTools.writeCourse(courseData, false);
    }
} 
