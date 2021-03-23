import java.util.Scanner;

public class Q2 {
  /*
   * Read the following details of ‘n’ students using Scanner class methods and
   * display the same. • Registration number ( String) • Name (String that may
   * contain first name, middle name and last name) • CGPA (Floating point number)
   * • Programme Name(String) • School Name (String with multiple words) • Proctor
   * Name (String that may contain first, middle and last names)
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no. of students:");
    int n = sc.nextInt();
    Student[] s = new Student[n];

    for (int i = 0; i < n; ++i) {

      // Input Student details
      System.out.println("Enter regNo.:");
      String regNo = sc.next();
      System.out.println("Enter name.:");
      String name = sc.next();
      System.out.println("Enter cgpa.:");
      Float cgpa = sc.nextFloat();
      System.out.println("Enter programmeName.:");
      String programmeName = sc.next();
      System.out.println("Enter schoolName.:");
      String schoolName = sc.next();
      System.out.println("Enter proctor.:");
      String proctor = sc.next();

      // Construct Student
      s[i] = new Student(regNo, name, cgpa, programmeName, schoolName, proctor);
    }
    sc.close();

    // Using the toString method override
    // to print Student details
    for (Student x : s)
      System.out.println(x);
  }
}

class Student {
  String regNo;
  String name;
  float cgpa;
  String programmeName;
  String schoolName;
  String proctor;

  public Student(String regNo, String name, float cgpa, String programmeName, String schoolName, String proctor) {
    this.regNo = regNo;
    this.name = name;
    this.cgpa = cgpa;
    this.programmeName = programmeName;
    this.schoolName = schoolName;
    this.proctor = proctor;
  }

  @Override
  public String toString() {
    return "Student [cgpa=" + cgpa + ", name=" + name + ", proctor=" + proctor + ", programName=" + programmeName
        + ", regNo=" + regNo + ", schoolName=" + schoolName + "]";
  }
}
