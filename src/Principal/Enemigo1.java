
package Principal;

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Enemigo1 {

    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;
    private int a=0;
    private int b=0;
    private boolean activo;
    
    Image ab9 = new ImageIcon(getClass().getResource("/recursos/hip.gif")).getImage();
    Image ab10 = new ImageIcon(getClass().getResource("/recursos/hip.gif")).getImage();
    Image ab11 = new ImageIcon(getClass().getResource("/recursos/hip.gif")).getImage();
    Image a45 = new ImageIcon(getClass().getResource("/recursos/hip.gif")).getImage();
    Image a46 = new ImageIcon(getClass().getResource("/recursos/hip.gif")).getImage();
    Image a47= new ImageIcon(getClass().getResource("/recursos/hip.gif")).getImage();
    public Enemigo1() {
        image= ab9;
        initCrafti();
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    private void initCrafti() {
                x = 103;
                y = 100;
    }
    public void move( ) {
         dy=1;
        if(a==0){
                for(int i=0;i<135;i++){
                switch (b) {
                case 0:
                    image = ab9;
                    b=1;
                    break;
                case 1:
                    image = ab9;
                    b=2;
                    break;
                case 2:
                    image = ab10;
                    b=3;
                    break;
                case 3:
                    image = ab10;
                    b=4;
                    break;
                case 4:
                    image=ab11;
                    b=5;
                    break;
                case 5:
                    image=ab11;
                    b=0;
                    break;
                default:
                    break;
            }
                    try {
                        Thread.sleep(40);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Enemigo1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                 y += dy;
                }
                a=1;
        }else{
            for(int j=0;j<135;j++){
                switch (b) {
                case 0:
                    image = a45;
                    b=1;
                    break;
                case 1:
                    image = a45;
                    b=2;
                    break;
                case 2:
                    image = a46;
                    b=3;
                    break;
                case 3:
                    image = a46;
                    b=4;
                    break;
                case 4:
                    image=a47;
                    b=5;
                    break;
                case 5:
                    image=a47;
                    b=0;
                    break;
                default:
                    break;
                }
                try {
                        Thread.sleep(40);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Enemigo1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                 y -= dy;
                 a=0;
                }
        }
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
