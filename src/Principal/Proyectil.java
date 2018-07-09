
package Principal;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Proyectil {

    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;
    private boolean activo;
    
    Image de = new ImageIcon(getClass().getResource("/recursos/AT.png")).getImage();
    Image iz = new ImageIcon(getClass().getResource("/recursos/AT.png")).getImage();
    Image ar = new ImageIcon(getClass().getResource("/recursos/AT.png")).getImage();
    Image ab = new ImageIcon(getClass().getResource("/recursos/AT.png")).getImage();
      
    public Proyectil() {
        initCrafti();
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    private void initCrafti() {
        
    }

    public void setX(int x) {
        this.x=x;
    }

    public void setY(int y) {
        this.y=y;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }

    public void keyPressed(KeyEvent e)  {
      
        int key = e.getKeyCode();
               
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_SPACE) {
  
        }
    }
}
