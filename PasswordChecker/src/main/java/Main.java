import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String password = JOptionPane.showInputDialog(null,"Please enter ");
        Password pass = new Password();
        boolean isValid = pass.passwordIsOk(password);
        if(!isValid)
            System.out.println("password is invalid");
        else
            System.out.println("Password is Ok");

    }
}
