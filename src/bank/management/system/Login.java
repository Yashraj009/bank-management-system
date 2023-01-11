package bank.management.system;
import javax.swing.*;
public class Login extends JFrame {

    Login(){
        setTitle("Automated Teller Machine");
        setSize(700,600);
        setVisible(true);
        setLocation(450,200);
    }

    public static void main(String args[]) {
        new Login();
    }
}