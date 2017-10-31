package proyectosistemasoperativos;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Mensajes extends JFrame {

    JPanel Panl1;
    JLabel EtiqMensaje, EtiqMensaje2, EtiqMensaje3;

    public Mensajes() {
    }

    public Mensajes(int x) {

        setSize(600, 200);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setUndecorated(true);

        Panl1 = new JPanel();
        Panl1.setLayout(null);
        Panl1.setOpaque(false);
        switch (x) {
            case 1:
                EtiqMensaje = new JLabel("Solo Digite Numeros");
                EtiqMensaje.setFont(new Font("Dinarjev Republika", Font.BOLD, 40));
                EtiqMensaje.setForeground(Color.BLACK);

                Panl1.setBounds(0, 0, 500, 200);
                EtiqMensaje.setBounds(0, 0, 550, 200);

                add(Panl1);
                Panl1.add(EtiqMensaje);

                setVisible(true);
                AWTUtilities.setWindowOpaque(this, false);
                break;
            case 2:
                EtiqMensaje = new JLabel("El numero ingresado ");
                EtiqMensaje2 = new JLabel("debe ser menor o igual");
                EtiqMensaje3 = new JLabel("               a 500");
                EtiqMensaje.setFont(new Font("Dinarjev Republika", Font.BOLD, 40));
                EtiqMensaje2.setFont(new Font("Dinarjev Republika", Font.BOLD, 40));
                EtiqMensaje3.setFont(new Font("Dinarjev Republika", Font.BOLD, 40));
                EtiqMensaje.setForeground(Color.BLACK);
                EtiqMensaje2.setForeground(Color.BLACK);
                EtiqMensaje3.setForeground(Color.BLACK);

                Panl1.setBounds(0, 0, 600, 200);
                EtiqMensaje.setBounds(0, -10, 550, 100);
                EtiqMensaje2.setBounds(0, 50, 600, 100);
                EtiqMensaje3.setBounds(0, 100, 600, 100);

                add(Panl1);
                Panl1.add(EtiqMensaje);
                Panl1.add(EtiqMensaje2);
                Panl1.add(EtiqMensaje3);

                setVisible(true);
                AWTUtilities.setWindowOpaque(this, false);
                break;
            case 3:
                EtiqMensaje = new JLabel("El numero ingresado ");
                EtiqMensaje2 = new JLabel("     debe ser mayor");
                EtiqMensaje3 = new JLabel("         o igual a 1");
                EtiqMensaje.setFont(new Font("Dinarjev Republika", Font.BOLD, 40));
                EtiqMensaje2.setFont(new Font("Dinarjev Republika", Font.BOLD, 40));
                EtiqMensaje3.setFont(new Font("Dinarjev Republika", Font.BOLD, 40));
                EtiqMensaje.setForeground(Color.BLACK);
                EtiqMensaje2.setForeground(Color.BLACK);
                EtiqMensaje3.setForeground(Color.BLACK);

                Panl1.setBounds(0, 0, 600, 200);
                EtiqMensaje.setBounds(0, -10, 550, 100);
                EtiqMensaje2.setBounds(0, 50, 600, 100);
                EtiqMensaje3.setBounds(0, 100, 600, 100);

                add(Panl1);
                Panl1.add(EtiqMensaje);
                Panl1.add(EtiqMensaje2);
                Panl1.add(EtiqMensaje3);

                setVisible(true);
                AWTUtilities.setWindowOpaque(this, false);

                break;
        }
        Temporizador T = new Temporizador(this);
        T.start();
        

    }

}
