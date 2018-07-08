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


public class Enemigo3 {
        private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;
    private int a=0;
    private int b=0;
    private boolean activo;
    
    Image de24 = new ImageIcon(getClass().getResource("/recursos/mino.gif")).getImage();
    Image de25 = new ImageIcon(getClass().getResource("/recursos/mino.gif")).getImage();
    Image de26 = new ImageIcon(getClass().getResource("/recursos/mino.gif")).getImage();
    Image ab0 = new ImageIcon(getClass().getResource("/recursos/mino.gif")).getImage();
    Image ab1 = new ImageIcon(getClass().getResource("/recursos/mino.gif")).getImage();
    Image ab2 = new ImageIcon(getClass().getResource("/recursos/mino.gif")).getImage();
    Image ar36 = new ImageIcon(getClass().getResource("/recursos/mino.gif")).getImage();
    Image ar37 = new ImageIcon(getClass().getResource("/recursos/mino.gif")).getImage();
    Image ar38 = new ImageIcon(getClass().getResource("/recursos/mino.gif")).getImage();
    Image izq12 = new ImageIcon(getClass().getResource("/recursos/mino.gif")).getImage();
    Image izq13 = new ImageIcon(getClass().getResource("/recursos/mino.gif")).getImage();
    Image izq14 = new ImageIcon(getClass().getResource("/recursos/mino.gif")).getImage();
    
    public Enemigo3() {
        image = de24;
        initCrafti();
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    private void initCrafti() {
              
        x = 557;
        y = 586;        
    }

    public void move( ) {
         dx=1;
         dy =1;
            switch (a) {
                case 0:
                    for(int i=0;i<135;i++){
                        switch (b) {
                            case 0:
                                image = de24;
                                b=1;
                                break;
                            case 1:
                                image = de24;
                                b=2;
                                break;
                            case 2:
                                image = de25;
                                b=3;
                                break;
                            case 3:
                                image = de25;
                                b=4;
                                break;
                            case 4:
                                image = de26;
                                b=5;
                                break;
                            case 5:
                                image = de26;
                                b=0;
                                break;
                            default:
                                break;
                        }
                        try {
                            Thread.sleep(75);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Enemigo1.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        x += dx;
                    }   a=1;
                    break;
                case 1:
                    for(int j=0;j<135;j++){
                        //x += dx;
                        switch (b) {
                            case 0:
                                image = ab0;
                                b=1;
                                break;
                            case 1:
                                image = ab0;
                                b=2;
                                break;
                            case 2:
                                image = ab1;
                                b=3;
                                break;
                            case 3:
                                image = ab1;
                                b=4;
                                break;
                            case 4:
                                image = ab2;
                                b=5;
                                break;
                            case 5:
                                image = ab2;
                                b=0;
                                break;
                            default:
                                break;
                        }
                        try {
                            Thread.sleep(75);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Enemigo1.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        y += dy;
                    }   a=2;
                    break;
                case 2:
                    for(int i=0;i<135;i++){
                        switch (b) {
                            case 0:
                                image = ar36;
                                b=1;
                                break;
                            case 1:
                                image = ar36;
                                b=2;
                                break;
                            case 2:
                                image = ar37;
                                b=3;
                                break;
                            case 3:
                                image = ar37;
                                b=4;
                                break;
                            case 4:
                                image = ar38;
                                b=5;
                                break;
                            case 5:
                                image = ar38;
                                b=0;
                                break;
                            default:
                                break;
                        }
                        try {
                            Thread.sleep(75);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Enemigo1.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        y -= dy;
                    }   a=3;
                    break;
                case 3:
                    for(int j=0;j<135;j++){ 
                        switch (b) {
                            case 0:
                                image = izq12;
                                b=1;
                                break;
                            case 1:
                                image = izq12;
                                b=2;
                                break;
                            case 2:
                                image = izq13;
                                b=3;
                                break;
                            case 3:
                                image = izq13;
                                b=4;
                                break;
                            case 4:
                                image = izq14;
                                b=5;
                                break;
                            case 5:
                                image = izq14;
                                b=0;
                                break;
                            default:
                                break;
                        }
                        try {
                            Thread.sleep(75);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Enemigo1.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        x -= dx;
                        a=0;
                    }   break;
                default:
                    break;
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