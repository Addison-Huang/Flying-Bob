import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.Writer;
import java.io.FileWriter;

public class IOTools {
  public static final File save = new File("StudentData.csv");

  public static String readString() {
    Scanner sc = new Scanner(System.in);
    return sc.next();
  }

  public static String readLine() {
    Scanner sc = new Scanner(System.in);
    return sc.nextLine();
  }

  public static String readInt() {
    Scanner sc = new Scanner(System.in);
    return sc.nextLine();
  }

  // public static boolean checkSpace() {
  // try {
  // return RawConsoleInput.read(false) == 32;
  // } catch (IOException e) {
  // System.out.println("IOException");
  // return false;
  // }
  // }

  public static void write(String s, boolean a) throws FileNotFoundException, IOException {
    Writer writer = new FileWriter(save, a); // the second parameter signifies that this is appending to the file
                                             // instead of copying its contents and returning a slight variation of it
    writer.write(s);
    writer.close();
  }

  public static boolean checkSave() throws FileNotFoundException, IOException {
    if (!save.exists()) {
      save.createNewFile();
      write("Username,Password,Grade,GPA\n", false);
      return false;
    }
    return true;
  }

  // //Asks for alias/name of the player before each game
  // public static void namePrompt(Player player) {
  // System.out.println("What's yer name, m8io?");
  // player.setName(readLine().replaceAll("[^A-Za-z]+", "")); //Removes any
  // non-alphabetical (A-Z) characters using regular expressions
  // }

  // public static int difficultyPrompt() {
  // System.out.println("Choose a difficulty:\n1-Easy\n2-Medium\n3-Hard");
  // String difficulty = readString();
  // int sleepTime = 30;
  // if (difficulty.equals("1"))
  // sleepTime = 60;
  // if (difficulty.equals("2"))
  // sleepTime = 40;
  // if (difficulty.equals("3"))
  // sleepTime = 20;
  // return sleepTime;
  // }

}
