import javax.swing.text.MaskFormatter;

public class all
 {
    int marks;
    String name;
    int cls;
    char grade;
    public static void main(String []args)
    {
           all stu1 = new all();
           all stu2 = new all();
           stu1.name="Suvrat";
           stu1.marks=56;
           stu2.marks=76;
           stu2.name="Himanshu";
           stu2.cls=11;
           stu1.cls=11;
           stu1.grade='c';
           stu2.grade='b';
           
           System.out.print("  Student class is " + stu1.cls);
           System.out.print("  Student name is " + stu1.name);
           System.out.print("  Student marks is " + stu1.marks);
           System.out.println("  passing grade is " + stu1.grade);
           System.out.print("  Student class is " + stu2.cls);
           System.out.print("  Student name is " + stu2.name);
           System.out.print("  Student marks is " + stu2.marks);
           System.out.print("  passing grade is " + stu2.grade);
           
    }
}
