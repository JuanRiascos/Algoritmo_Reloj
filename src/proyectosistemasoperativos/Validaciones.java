package proyectosistemasoperativos;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Validaciones {

    JPanel PanlMensaje;

    public boolean Validaciones_Numeros(String x) {
        char[] c = x.toCharArray();
        boolean mostrar = false;
        for (char arre : c) {
            if (((int) arre >= 32 && (int) arre <= 47) || ((int) arre >= 58 && (int) arre <= 255)) {
                mostrar = true;
                break;
            }
        }
        return mostrar;
    }

    public boolean Validar_Numero_Adecuado(String b) {
        boolean Vali = false;
        if (Integer.parseInt(b) > 0 && Integer.parseInt(b) <= 500) {
            Vali = true;
        }

        return Vali;
    }

    public void Validar_Tamaño(String x) {
        if (Integer.parseInt(x) > 500) {
            Mensajes m = new Mensajes(2);
        }
        if (Integer.parseInt(x) < 1) {
            Mensajes m = new Mensajes(3);
        }

    }

}
