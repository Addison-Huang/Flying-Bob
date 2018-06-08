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

        IOTools.writeStudent(studentData, false);

    }
} 