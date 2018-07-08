/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Enemigo2 {
    
    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;
    private int a=0;
    private int b=0;
    private boolean activo;
    
    Image de81 = new ImageIcon(getClass().getResource("/recursos/fenix.gif")).getImage();
    Image de82 = new ImageIcon(getClass().getResource("/recursos/fenix.gif")).getImage();
    Image de83 = new ImageIcon(getClass().getResource("/recursos/fenix.gif")).getImage();
    Image izq69 = new ImageIcon(getClass().getResource("/recursos/fenix.gif")).getImage();
    Image izq70 = new ImageIcon(getClass().getResource("/recursos/fenix.gif")).getImage();
    Image izq71 = new ImageIcon(getClass().getResource("/recursos/fenix.gif")).getImage();
    public Enemigo2() {
        image = de81;
        initCrafti();
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    private void initCrafti() {
        x = 400;
        y = 50;        
    }
    
    public void move( ) {
        dx=1;
        if(a==0){
                for(int i=0;i<135;i++){
                switch (b) {
                case 0:
                    image = de81;
                    b=1;
                    break;
                case 1:
                    image = de81;
                    b=2;
                    break;
                case 2:
                    image = de82;
                    b=3;
                    break;
                case 3:
                    image = de82;
                    b=4;
                    break;
                case 4:
                    image= de83;
                    b=5;
                    break;
                case 5:
                    image= de83;
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
                 x += dx;
                }
                a=1;
        }else{
            for(int j=0;j<135;j++){
                switch (b) {
                case 0:
                    image = izq69;
                    b=1;
                    break;
                case 1:
                    image = izq69;
                    b=2;
                    break;
                case 2:
                    image = izq70;
                    b=3;
                    break;
                case 3:
                    image = izq70;
                    b=4;
                    break;
                case 4:
                    image = izq71;
                    b=5;
                    break;
                case 5:
                    image = izq71;
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
                 x -= dx;
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
