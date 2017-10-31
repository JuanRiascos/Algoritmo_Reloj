package proyectosistemasoperativos;

import javax.swing.JFrame;

public class Temporizador extends Thread {

    JFrame Vol;

    public Temporizador(JFrame x) {
        Vol = x;
    }

    public void run() {
        try {
            for (int i = 3; i > 0; i--) {
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        Vol.setVisible(false);
    }
}
