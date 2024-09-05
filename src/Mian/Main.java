package Mian;
import Students.Student;
import javax.swing.JOptionPane;
import Processor.Processor;
public class Main{
    
    static void line(int n){
        for(int i = 0; i < n; i++) 
             System.out.print("-");
        System.out.println("");
    }
    public static void main(String[] args) {
        
        Student st[] = new Student[30];
        st[0] = new Student(1001, "LongDy", "Male", 20, "22/05/2003", "Java Programming", 100, 100, 100 );
        st[1] = new Student(1002, "Veasna", "Male", 20, "22/05/2003", "Java Programming", 100, 100, 100 );
        st[2] = new Student(1003, "Dalin", "Male", 19, "22/05/2003", "Java Programming", 100, 100, 100 );
        st[3] = new Student(1004, "ChanRith", "Male", 20, "22/05/2003", "Java Programming", 90, 10, 90 );
        st[4] = new Student(1005, "Kunthea", "Female", 21, "22/05/2003", "C#", 90, 80, 19 );
        
        
        Student.title();
        line(152);
        st[0].output();
        st[1].output();
        st[2].output();
        st[3].output();
        st[4].output();
    
    }
    
}
