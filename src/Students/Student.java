package Students;
import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String gender;
    private int age;
    private String dateOfBirth;
    private String course;
    private double sc1, sc2, sc3;
    private double total;
    private double average;
    private char grade;
    
    
    
    // Default Constructor
    public Student() { }

    // Constructor has parameters
    public Student(int id, String name, String gender, int age, String dateOfBirth, String course, double sc1, double sc2, double sc3) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.course = course;
        this.sc1 = sc1;
        this.sc2 = sc2;
        this.sc3 = sc3;
        total = findTotal();
        average = findAverage();
        grade = findGrade();
    }
    
    // Setter Block
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
    
    // Getter block
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCourse() {
        return course;
    }
    
    
    /// @Calculation
    double findTotal() {
        return sc1 + sc2 + sc3;
    }
    
    double findAverage() {
        return total / 3;
    }
    
    
    char findGrade() { return average >= 90 ? 'A' : average >= 80 ? 'B' :average >= 70 ? 'C' : average >= 60 ? 'D' :average >= 50 ? 'E' : 'F'; }
    
    public void Input(int order) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("==========[ Student "+order+" ]=============");
        System.out.print("Enter Student ID            : "); this.id = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Studnet name          : "); this.name = sc.nextLine();
        System.out.print("Enter Student gender        : "); this.gender = sc.nextLine();
        System.out.print("Enter Student age           : "); this.age = sc.nextInt(); sc.nextLine();
        System.out.print("Enter student data of brith : "); this.dateOfBirth = sc.nextLine();
        System.out.print("Enter Studnet course        : "); this.course = sc.nextLine();
        System.out.print("Enter student score1        : "); this.sc1 = sc.nextDouble();
        System.out.print("Enter student score2        : "); this.sc2 = sc.nextDouble();
        System.out.print("Enter student score3        : "); this.sc3 = sc.nextDouble();
        

         age = 20;
         dateOfBirth = "20/2/2003";
         course = "java";
         sc1 = 100;
         sc2 = 100;
         sc3 = 100;
         
        total = findTotal();
        average = findAverage();
        grade = findGrade();
    }

    @Override
    public String toString() {
        return id + "        " + name + "\t" + gender + "\t" + age + "\t" + dateOfBirth + "\t" + course + "\t" + sc1 + "\t" + sc2 + "\t" + sc3 + "\n";
    }
    
   public static void title() {
        System.out.printf("%-10s %-15s %-10s %-10s %-20s %-20s %-10s %-10s %-10s %-10s %-10s %-10s \n", "ID", "Name", "Gender", "age", "dateOfBirth", "Course", "Java", "C#", "Spring", "Total", "Average","Grade");
    }
    
    public void output() {
        System.out.printf("%-10d %-15s %-10s %-10d %-20s %-20s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10c \n", id, name, gender, age, dateOfBirth, course, sc1, sc2, sc3, total, average, grade);
    }
    
    
    
}
