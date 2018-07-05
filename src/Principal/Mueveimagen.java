
package Principal;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.applet.AudioClip;

public class Mueveimagen extends JFrame {
    AudioClip sonido;
    public Mueveimagen() {
      
        super("Oriyinal");
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/recursos/music.wav"));
        initUI();
    }
    
    private void initUI() {
        
        add(new Tablero());
        setSize(960, 960);
        setResizable(false);
        
        setTitle("The Journey");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        sonido.loop();
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Mueveimagen ex = new Mueveimagen();
                ex.setVisible(true);
            }
        });
    }
}