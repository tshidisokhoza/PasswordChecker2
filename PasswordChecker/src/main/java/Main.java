import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String password = JOptionPane.showInputDialog(null,"Please enter ");
        Password pass = new Password();
        boolean isValid = false;
        isValid = pass.passwordIsOk(password);

            System.out.println(isValid);


    }
}
