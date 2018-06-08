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

        IOTools.writeStudent(studentData, false);

        String courseData = "Teacher,Subject,Period,Waitlist|Roster\n";
        courseData += "Mr. Ye,Math,1,1,3,3,4|2,3,4,1\n";
        courseData += "Mr. Hooper,English,1,1,3,3,4|2,3,4,1\n";
        courseData += "Ms. J,ComputerScience,1,1,3,3,4|2,3,4,1\n";
        courseData += "Dr. Opus,1,2,3,3,4|2,3,4,1\n";
        courseData += "Dr. Opus,Chemistry,3,3,3,4|2,3,4,1\n";

        IOTools.writeCourse(courseData, false);
    }
} 
