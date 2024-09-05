package Processor;
import java.util.Scanner;
import Students.Student;
public class Processor {
    public static void InputStudents(Student st[], final int n) {
        for (int i = 0; i < n; i++) {
            st[i] = new Student();
            st[i].Input(i+1);
        }
    }
    
    public static void DisplayStudents(final Student st[], final int n) {
        for(Student s : st) {
            System.out.print(s);
        }
    }
    
    
    
    public static int search(final Student st[], final int n, int search_id) {
        for (int i = 0; i < n; i++) 
            if (search_id == st[i].getId()) return i;
        return -1;
    }
    
    
    
    public static void SearchStudent(final Student st[], final int n) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter id of student you want ot seach : ");
        int searchId = sc.nextInt();
        
        var foundIndex = search(st, n, searchId);
 
        if (foundIndex == -1) {
            System.out.println("The student i you want ot search not found in student array...");
        } else {
            System.out.println(st[foundIndex]);
        }
        
    }
        
    
    public static void delete(Student s[], int n, int index) {
        for (int i = index; i < n - 1; i++) {
            s[i] = s[i+1];
        }
    }
    
    public static void showMessage() {
        System.out.println("Not found");
    }
    
    public static int DeleteStudent(Student s[], int n) {
        int id;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student id you want to delete : ");
        id = sc.nextInt();
        
        int index = search(s, n, id);
        
        if (index > -1) {
            delete(s, n, index);
            return n - 1;
        } else {
            System.out.println("This student id not exist in student list....");
        }

        return n;
    }
}
