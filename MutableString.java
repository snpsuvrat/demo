import javax.swing.event.SwingPropertyChangeSupport;

public class MutableString 
{
public static void main(String[] args) {
    
    StringBuffer name=new StringBuffer("Virat");
    System.out.println(name);
    name.append("kohli");
    System.out.println(name);
}

}
