
package Principal;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.applet.AudioClip;

public class Menu extends JFrame {
    AudioClip sonido;
    public Menu() {
      
        super("DRACARYS");
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/recursos/music.wav"));
        initUI();
    }
    
    private void initUI() {
        
        add(new Tablero());
        setSize(960, 700);
        setResizable(false);
        
        setTitle("THE DRACARYS NAME");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        sonido.loop();
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Menu ex = new Menu();
                ex.setVisible(true);
            }
        });
    }
}