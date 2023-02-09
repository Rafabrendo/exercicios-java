package visao;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaPracas extends JFrame {

    private static TelaPracas instancia;
    //um atributo private static da propria classe.

    private TelaPracas(){
        setTitle("Controle de Pracas");
        setSize(350, 180);
        JLabel lbTexto = new JLabel("Tela de Praças");
        getContentPane().add(lbTexto);
    }

    //vai fazer com que gera apenas uma tela por vez
    public static TelaPracas getInstancia(){
        if(instancia == null){
            instancia = new TelaPracas();
        }
        return instancia;
    }
    
}
