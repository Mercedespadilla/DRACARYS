
package Principal;

import java.awt.Image;
import javax.swing.ImageIcon;


public class Estrella {
    private int x;
    private int y;
    private final Image image;
    private boolean activo;
    
    java.awt.Image estre = new ImageIcon(getClass().getResource("/recursos/estrella.png")).getImage();
    public Estrella() {
        image = estre;
        initCrafti();
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    private void initCrafti() {
                x = 640;
                y = 695;
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
}
