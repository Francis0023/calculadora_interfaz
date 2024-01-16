import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        JFrame aplicacion=new JFrame(" Prototipo");
        aplicacion.setContentPane(new forma2().menuprincipal);
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setSize(600,480);
        aplicacion.pack();
        aplicacion.setVisible(true);
    }
}