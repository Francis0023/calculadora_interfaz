import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class forma2 {
    JPanel menuprincipal;
    private JLabel texto1Lbl;
    private JLabel texto2Lbl;
    private JTextField texto1Field1;
    private JLabel texto3Lbl;
    private JTextField texto2Field;
    private JLabel resultado1Lbl;
    private JButton botto1;
    private JLabel resultado2Lbl;
    private JLabel resultado3Lbl;
    private JLabel resultado4Lbl;

    // El botton hace la accion que se va a desarrollar para cada uno de las partes que se van a desarrollar
    public forma2() {
        botto1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Prueba botton");
                String n1= texto1Field1.getText();
                String n2= texto2Field.getText();
                //operacion
                int numero1, numero2,resul1,resul2,resul3,resul4;
                numero1=Integer.parseInt(n1);
                while(numero1==0){


                }
                numero2=Integer.parseInt(n2);
                resul1 = numero1+numero2;
                resul2 = numero1-numero2;
                resul3 = numero1*numero2;
                resul4 = numero1/numero2;

                System.out.println(n1);
                System.out.println(n2);
                System.out.println(resul1);
                //Resultado tipo string
                String r1,r2,r3,r4;
                r1=Integer.toString(resul1);
                r2=Integer.toString(resul2);
                r3=Integer.toString(resul3);
                r4=Integer.toString(resul4);
                resultado1Lbl.setText("Resultado: "+r1);
                resultado2Lbl.setText("Resultado: "+r2);
                resultado3Lbl.setText("Resultado: "+r3);
                resultado4Lbl.setText("Resultado: "+r4);
            }
        });
    }



}

