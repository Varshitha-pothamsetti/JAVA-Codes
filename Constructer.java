import javax.swing.JOptionPane;
class Employee {
    int id,salary;
    String name;
    Employee(){
        name = JOptionPane.showInputDialog("Enter your name: ");
        id = Integer.parseInt(JOptionPane.showInputDialog("Enter your id: "));
        salary = Integer.parseInt(JOptionPane.showInputDialog("Enter yout salary"));
    }
    void showDetails(){
    String outputString = "ID: " + id + "\nNAME: " + name + "\nsalary: " + salary;
    JOptionPane.showMessageDialog(null,outputString);
  }
}
public class  Constructer {
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.showDetails();
        Employee e2 = new Employee();
        e2.showDetails();
    }
}

