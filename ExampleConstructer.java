import javax.swing.JOptionPane;
 class ExampleConstructer {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter yout name");
        //System.out.println("Hello," + name);
        String ouyputString = "Hello," + name;
        JOptionPane.showMessageDialog(null, ouyputString);
    }
}