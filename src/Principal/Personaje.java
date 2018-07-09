
package Principal;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Personaje {

    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;
    private int b=0;
    private int a=0;
    private boolean activo = false;
    
    Image caldero = new ImageIcon(getClass().getResource("/recursos/pocimas.png")).getImage();
    Image esce1 = new ImageIcon(getClass().getResource("/recursos/dungeon.png")).getImage();
    Image esce2 = new ImageIcon(getClass().getResource("/recursos/FONDOIDEAL23.jpg")).getImage();
    Image esce3 = new ImageIcon(getClass().getResource("/recursos/Final.jpg")).getImage();
    //Izquierda
    Image gI1 = new ImageIcon(getClass().getResource("/recursos/iz1.png")).getImage();
    Image gI2 = new ImageIcon(getClass().getResource("/recursos/iz2.png")).getImage();
    Image gI3 = new ImageIcon(getClass().getResource("/recursos/iz3.png")).getImage();
    //Derecha
    Image gD1 = new ImageIcon(getClass().getResource("/recursos/der1.png")).getImage();
    Image gD2 = new ImageIcon(getClass().getResource("/recursos/der2.png")).getImage();
    Image gD3 = new ImageIcon(getClass().getResource("/recursos/der3.png")).getImage();
    //Arriba
    Image gAr1 = new ImageIcon(getClass().getResource("/recursos/ar1.png")).getImage();
    Image gAr2 = new ImageIcon(getClass().getResource("/recursos/ar2.png")).getImage();
    Image gAr3 = new ImageIcon(getClass().getResource("/recursos/ar3.png")).getImage();
    //Abajo
    Image gAb1 = new ImageIcon(getClass().getResource("/recursos/ab1.png")).getImage();
    Image gAb2 = new ImageIcon(getClass().getResource("/recursos/ab2.png")).getImage();
    Image gAb3 = new ImageIcon(getClass().getResource("/recursos/ab3.png")).getImage();
    
    public Personaje() {
        initCraft();
    }
    
    private void initCraft() {
        image = gAr2;
        
        x = 17;
        y = 800;        
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void move(int m) {
        //Validando colisiones con el escenario
        switch(m){
            case 1:
                               //Limites 
                if (x == 895) {
                    x = 894;
                } else if (y == 850) {
                    y = 849;
                } else if (y == 15) {
                    y = 16;
                } else if (x == 15) {
                    x = 16;
                }
                //pasillo inferior izquierdo
                if (x == 39 && y <= 899 && y >= 720) {
                    x = 38;
                } else if (y == 680 && x <= 300 && x >= 16) {
                    y = 681;
                } else if (y == 720 && x <= 317 && x >= 40) {
                    y = 719;
                } //pasillo largo delgado
                else if (x == 300 && y <= 670 && y >= 435) {
                    x = 301;
                } else if (x == 312 && y <= 720 && y >= 435) {
                    x = 311;
                } //cuarto con yunque
                //pasillo
                else if (y == 435 && x <= 300 && x >= 100) {
                    y = 434;
                } else if (y == 403 && x <= 300 && x >= 155) {
                    y = 404;
                } //cuarto
                else if (x == 155 && y <= 404 && y >= 160) {
                    x = 154;
                } else if (x == 98 && y <= 486 && y >= 435) {
                    x = 97;
                } else if (x == 312 && y <= 435 && y >= 720) {
                    x = 311;
                } else if (y == 486 && x <= 98 && x >= 16) {
                    y = 485;
                } else if (y == 295 && x <= 155 && x >= 16) {
                    y = 296;
                } //cuarto dos piedras
                else if (y == 435 && x <= 480 && x >= 312) {
                    y = 434;
                } else if (y == 435 && x <= 562 && x >= 510) {
                    y = 434;
                } else if (y == 248 && x <= 562 && x >= 312) {
                    y = 249;
                } else if (x == 301 && y <= 403 && y >= 249) {
                    x = 302;
                } else if (x == 562 && y <= 435 && y >= 249) {
                    x = 561;
                } //pasillos y cuarto de cajas |_
                else if (y == 249 && x <= 301 && x >= 156) {
                    y = 248;
                } else if (y == 222 && x <= 301 && x >= 170) {
                    y = 223;
                } else if (x == 170 && y <= 222 && y >= 75) {
                    x = 169;
                } else if (x == 156 && y <= 249 && y >= 75) {
                    x = 157;
                } //cuarto cajas
                else if (x == 84 && y <= 32 && y >= 15) {
                    x = 83;
                } else if (x == 84 && y <= 94 && y >= 75) {
                    x = 83;
                } else if (y == 94 && x <= 84 && x >= 15) {
                    y = 93;
                } //pasillo -|
                else if (y == 32 && x <= 312 && x >= 84) {
                    y = 33;
                } else if (y == 75 && x <= 156 && x >= 84) {
                    y = 74;
                } else if (y == 75 && x <= 301 && x >= 170) {
                    y = 74;
                } else if (x == 312 && y <= 248 && y >= 32) {
                    x = 311;
                } else if (x == 301 && y <= 222 && y >= 75) {
                    x = 302;
                } //gran zona azul 
                else if (x == 480 && y <= 556 && y >= 435) {
                    x = 481;
                } else if (x == 510 && y <= 556 && y >= 435) {
                    x = 509;
                } else if (x == 433 && y <= 850 && y >= 556) {
                    x = 434;
                } else if (x == 716 && y <= 556 && y >= 479) {
                    x = 717;
                } else if (y == 556 && x <= 480 && x >= 433) {
                    y = 557;
                } else if (y == 556 && x <= 716 && x >= 510) {
                    y = 557;
                }
                 else if (y == 495 && x <=800  && x >= 716) {
                    y = 496;
                 }else if (x == 800 && y <= 495 && y >= 420) {
                    x = 801;
                }
                 else if (y == 420 && x <=848  && x >= 800) {
                    y = 421;
                }else if (x == 848 && y <=420 && y >= 115) {
                    x = 849;
                    }
                 else if (y == 125 && x <=895  && x >= 848) {
                    y = 126;
                } else {
                    x += dx;
                    y += dy;
                }
              
                break;
            case 2:
                //Limites  
                if (x == 920) {
                    x = 919;
                } else if (y == 871) {
                    y = 870;
                } else if (y == 0) {
                    y = 1;
                } else if (x == 0) {
                    x = 1;
                } //Validando colisiones con el escenario
                //lago del demonio
                else if (x == 279 && y <= 165 && y >= 65) {
                    x = 278;
                } else if (y == 60 && x <= 670 && x >= 279) {
                    y = 59;
                } else if (y == 165 && x <= 400 && x >= 279) {
                    y = 166;
                } else if (x == 400 && y <= 300 && y >= 165) {
                    x = 399;
                } else if (y == 295 && x <= 540 && x >= 400) {
                    y = 296;
                } else if (x == 540 && y <= 295 && y >= 165) {
                    x = 541;
                } else if (y == 165 && x <= 670 && x >= 540) {
                    y = 166;
                } else if (x == 670 && y <= 165 && y >= 65) {
                    x = 671;
                } //tiendita
                else if (x == 105 && y <= 14 && y >= 0) {
                    x = 104;
                } else if (y == 15 && x <= 363 && x >= 104) {
                    y = 16;
                } else if (x == 363 && y <= 14 && y >= 0) {
                    x = 364;
                } //pozo
                else if (x == 615 && y <= 700 && y >= 635) {
                    x = 614;
                } else if (x == 670 && y <= 700 && y >= 635) {
                    x = 671;
                } else if (y == 700 && x <= 670 && x >= 615) {
                    y = 701;
                } else if (y == 635 && x <= 670 && x >= 615) {
                    y = 633;
                } //torre
                else if (x == 385 && y <= 555 && y >= 325) {
                    x = 384;
                } else if (x == 530 && y <= 555 && y >= 325) {
                    x = 531;
                } else if (y == 325 && x <= 530 && x >= 385) {
                    y = 324;
                } else if (y == 555 && x <= 530 && x >= 385) {
                    y = 556;
                } //piedritas
                else if (x == 195 && y >= 770) {
                    x = 194;
                } else if (x == 370 && y >= 770) {
                    x = 371;
                } else if (y == 770 && x <= 370 && x >= 195) {
                    y = 769;
                } else {
                    x += dx;
                    y += dy;
                }
                /*if (x == 895) {
                    x = 894;
                } else if (y == 850) {
                    y = 849;
                } else if (y == 15) {
                    y = 16;
                } else if (x == 15) {
                    x = 16;
                }
                //pasillo inferior izquierdo
                if (x == 39 && y <= 899 && y >= 720) {
                    x = 38;
                } else if (y == 680 && x <= 300 && x >= 16) {
                    y = 681;
                } else if (y == 720 && x <= 317 && x >= 40) {
                    y = 719;
                } //pasillo largo delgado
                else if (x == 300 && y <= 670 && y >= 435) {
                    x = 301;
                } else if (x == 312 && y <= 720 && y >= 435) {
                    x = 311;
                } //cuarto con yunque
                //pasillo
                else if (y == 435 && x <= 300 && x >= 100) {
                    y = 434;
                } else if (y == 403 && x <= 300 && x >= 155) {
                    y = 404;
                } //cuarto
                else if (x == 155 && y <= 404 && y >= 160) {
                    x = 154;
                } else if (x == 98 && y <= 486 && y >= 435) {
                    x = 97;
                } else if (x == 312 && y <= 435 && y >= 720) {
                    x = 311;
                } else if (y == 486 && x <= 98 && x >= 16) {
                    y = 485;
                } else if (y == 295 && x <= 155 && x >= 16) {
                    y = 296;
                } //cuarto dos piedras
                else if (y == 435 && x <= 480 && x >= 312) {
                    y = 434;
                } else if (y == 435 && x <= 562 && x >= 510) {
                    y = 434;
                } else if (y == 248 && x <= 562 && x >= 312) {
                    y = 249;
                } else if (x == 301 && y <= 403 && y >= 249) {
                    x = 302;
                } else if (x == 562 && y <= 435 && y >= 249) {
                    x = 561;
                } //pasillos y cuarto de cajas |_
                else if (y == 249 && x <= 301 && x >= 156) {
                    y = 248;
                } else if (y == 222 && x <= 301 && x >= 170) {
                    y = 223;
                } else if (x == 170 && y <= 222 && y >= 75) {
                    x = 169;
                } else if (x == 156 && y <= 249 && y >= 75) {
                    x = 157;
                } //cuarto cajas
                else if (x == 84 && y <= 32 && y >= 15) {
                    x = 83;
                } else if (x == 84 && y <= 94 && y >= 75) {
                    x = 83;
                } else if (y == 94 && x <= 84 && x >= 15) {
                    y = 93;
                } //pasillo -|
                else if (y == 32 && x <= 312 && x >= 84) {
                    y = 33;
                } else if (y == 75 && x <= 156 && x >= 84) {
                    y = 74;
                } else if (y == 75 && x <= 301 && x >= 170) {
                    y = 74;
                } else if (x == 312 && y <= 248 && y >= 32) {
                    x = 311;
                } else if (x == 301 && y <= 222 && y >= 75) {
                    x = 302;
                } //gran zona azul 
                else if (x == 480 && y <= 556 && y >= 435) {
                    x = 481;
                } else if (x == 510 && y <= 556 && y >= 435) {
                    x = 509;
                } else if (x == 433 && y <= 850 && y >= 556) {
                    x = 434;
                } else if (x == 716 && y <= 556 && y >= 479) {
                    x = 717;
                } else if (y == 556 && x <= 480 && x >= 433) {
                    y = 557;
                } else if (y == 556 && x <= 716 && x >= 510) {
                    y = 557;
                }
                 else if (y == 495 && x <=800  && x >= 716) {
                    y = 496;
                 }else if (x == 800 && y <= 495 && y >= 420) {
                    x = 801;
                }
                 else if (y == 420 && x <=848  && x >= 800) {
                    y = 421;
                }else if (x == 848 && y <=420 && y >= 115) {
                    x = 849;
                    }
                 else if (y == 125 && x <=895  && x >= 848) {
                    y = 126;
                } else {
                    x += dx;
                    y += dy;
                }*/
                break;
            case 3:
                //Limites 

                if (x == 895) {
                    x = 894;
                } else if (y == 850) {
                    y = 849;
                } else if (y == 15) {
                    y = 16;
                } else if (x == 15) {
                    x = 16;
                }else if (x == 827 && y <=850 && y >= 810) {
                    x = 828;
                }
                 else if (y == 810 && x <=827  && x >=747 ) {
                    y = 809;
                }else if (x == 747 && y <=810 && y >= 730) {
                    x = 748;
                }//RING
                 else if (y == 730 && x <=747  && x >=150 ) {
                    y = 729;
                }else if (x == 150 && y <=730 && y >= 130) {
                    x = 151;
                }
                 else if (y == 130 && x <=758  && x >=150 ) {
                    y = 131;
                }else if (x == 758 && y <=760 && y >= 130) {
                    x = 757;
                }
                 else if (y == 760 && x <=894  && x >=758 ) {
                    y = 761;
                }else {
                    x += dx;
                    y += dy;
                }break;
            
        }
        
        
        }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
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
        if (key == KeyEvent.VK_LEFT) {
            switch (b) {
                case 0:
                    image = gI1;
                    b=1;
                    break;
                case 1:
                    image = gI1;
                    b=2;
                    break;
                case 2:
                    image = gI2;
                    b=3;
                    break;
                case 3:
                    image = gI2;
                    b=4;
                    break;
                case 4:
                    image=gI3;
                    b=5;
                    break;
                case 5:
                    image=gI3;
                    b=0;
                    break;
                default:
                    break;
            }
            dx = -1;
         }

        if (key == KeyEvent.VK_RIGHT) {
            switch (b) {
                case 0:
                    image = gD1;
                    b=1;
                    break;
                case 1:
                    image = gD1;
                    b=2;
                    break;
                case 2:
                    image = gD2;
                    b=3;
                    break;
                case 3:
                    image = gD2;
                    b=4;
                    break;
                case 4:
                    image = gD3;
                    b=5;
                    break;
                case 5:
                    image = gD3;
                    b=0;
                    break;
                
                default:
                    break;
            }
            dx = 1;
        }

        if (key == KeyEvent.VK_UP) {
            
            switch (a) {
                case 0:
                    image = gAr1;
                    a=1;
                    break;
                case 1:
                    image = gAr1;
                    a=2;
                    break;
                case 2:
                    image = gAr2;
                    a=3;
                    break;
                case 3:
                    image = gAr2;
                    a=4;
                    break;
                case 4:
                    image = gAr3;
                    a=5;
                    break;
                case 5:
                    image = gAr3;
                    a=0;
                    break;
                default:
                    break;
            }
            dy=-1;
        }

        if (key == KeyEvent.VK_DOWN) {
          
            switch (a) {
                case 0:
                    image = gAb1;
                    a=1;
                    break;
                case 1:
                    image = gAb1;
                    a=2;
                    break;
                case 2:
                    image = gAb2;
                    a=3;
                    break;
                case 3:
                    image = gAb2;
                    a=4;
                    break;
                case 4:
                    image = gAb3;
                    a=5;
                    break;
                case 5:
                    image = gAb3;
                    a=0;
                    break;
                default:
                    break;
            }
            dy = 1;
        }
        //investigar de ArrayList 
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
       
        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }   
}
