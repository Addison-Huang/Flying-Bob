import java.util.Scanner;
import java.util.ArrayList;
import java.util.PriorityQueue;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.Writer;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileReader;
import java.io.BufferedReader;;

public class IOTools {
	public static final File studentSave = new File("StudentData.csv");
	public static final File courseSave = new File("CourseData.csv");

	public static String readLine() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	public static String readInt() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	public static void writeStudent(String s, boolean a) throws FileNotFoundException, IOException {
		Writer writer = new FileWriter(studentSave, a); // the second parameter signifies that this is appending to the
														// file
														// instead of copying its contents and returning a slight
														// variation of it
		writer.write(s);
		writer.close();
	}

	public static void writeCourse(String s, boolean a) throws FileNotFoundException, IOException {
		Writer writer = new FileWriter(courseSave, a); // the second parameter signifies that this is appending to the
														// file
														// instead of copying its contents and returning a slight
														// variation of it
		writer.write(s);
		writer.close();
	}

	public static boolean checkSave() throws FileNotFoundException, IOException {
		if (!courseSave.exists()) {
			courseSave.createNewFile();
			writeCourse("Teacher,Subject,Period,Waitlist|Roster\n", false);
		}

		if (!studentSave.exists()) {
			studentSave.createNewFile();
			writeStudent("Username,Password,Grade,GPA\n", false);
			return false;
		}
		return true;
	}

	public static void initStudents() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader(studentSave));
		String st;
		while ((st = br.readLine()) != null) {
			if (!st.equals("Username,Password,Grade,GPA")) {
				String[] arr = st.split(",");
				Student a = new Student(arr[0], arr[1], Integer.parseInt(arr[2]), Double.parseDouble(arr[3]));
				LStudent.addStudent(a);
			}
		}
		LStudent.sortStudents();
	}

	public static void initCourses() throws FileNotFoundException, IOException {
		String rost = "";
		String rest = "";
		BufferedReader br = new BufferedReader(new FileReader(courseSave));
		String st;
		while ((st = br.readLine()) != null) {
			if (st.equals("Teacher,Subject,Period,Waitlist|Roster")) {
				for (int i = 1; i < st.length(); i++) {
					if (st.charAt(i) == '|') {
						if (st.length() - i != 1) {
							rost = st.substring(i);
						} else {
							rost = "";
						}
						rest = st.substring(0, i);
					}
				}
				String[] Rest = rest.split(",");
				String t = Rest[0];
				String s = Rest[1];
				int p = Integer.parseInt(Rest[2]);
				PriorityQueue<Student> a = new PriorityQueue();
				if (Rest.length > 3) {
					for (int i = 3; i < Rest.length; i++) {
						int id = Integer.parseInt(Rest[i]);
						Student student = LStudent.getStudent(id);
						a.add(student);
					}
				}
				ArrayList<Student> b = new ArrayList();
				if (rost.length() > 0) {
					String[] arr = rost.split(",");
					for (String stu : arr) {
						int id = Integer.parseInt(stu);
						Student student = LStudent.getStudent(id);
						b.add(student);
					}
				}
				Course c = new Course(t, s, p, a, b);
				LCourse.addCourse(c);

			}
		}

		LCourse.sortCourses();

	}

}
