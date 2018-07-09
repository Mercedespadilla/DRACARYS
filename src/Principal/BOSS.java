
package Principal;

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class BOSS {
    private int d = 118;
    private int f = 59;
    private int g = 0;
    private int h;
    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;
    private int a=0;
    private int b=0;
    private int c = 0;
    private boolean activo;
    
    //BOSS
    Image f1 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image f2 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image f3 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image f4 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image iz1 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image iz2 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image iz3 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image iz4 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image de1 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image de2 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image de3 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image de4 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image e1 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();    
    Image e2 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image e3 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image e4 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi1 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi2 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi3 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi4 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi5 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi6 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi7 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi8 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi9 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi10 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi11 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi12 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi13 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi14 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi15 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi16 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi17 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi18 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi19 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi20 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi21 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi22 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi23 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi24 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi25 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi26 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi27 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi28 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi29 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi30 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi31 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi32 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi33 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi34 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi35 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi36 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi37 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi38 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi39 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi40 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi41 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi42 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi43 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi44 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi45 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi46 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi47 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    Image Fi48 = new ImageIcon(getClass().getResource("/recursos/dra.gif")).getImage();
    
    public BOSS() {
        image = f1;
        initCrafti();
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    private void initCrafti() {
              
        x = 430;
        y = 90;
    }
    
    public void move( ) {
        //Limites del BOSS
         dx = 5;
         dy = 5;
        //a=1; 
        if(a==0){
            if(g==0){
                h=f;
                g++;
            }else{
                h=d;
            }
            for(int i=0;i<h;i++){
                switch (b) {
                case 0:
                    image = f1;
                    b=1;
                    break;
                case 1:
                    image = f1;
                    b=2;
                    break;
                case 2:
                    image = f2;
                    b=3;
                    break;
                case 3:
                    image = f2;
                    b=4;
                    break;
                case 4:
                    if(i%7 == 0){
                        for(int mi=0;mi<11;mi++){
                            switch (c) {
                                case 0:
                                    image = Fi13;
                                    c=1;
                                   break;
                                case 1:
                                    image = Fi14;
                                    c=2;
                                   break;
                                case 2:
                                    image = Fi15;
                                    c=3;
                                   break;
                                case 3:
                                    image = Fi16;
                                    c=4;
                                    break;
                                case 4:
                                    image = Fi17;
                                    c=5;
                                   break;
                                case 5:
                                    image = Fi18;
                                    c=6;
                                   break;
                                case 6:
                                    image = Fi19;
                                    c=7;
                                   break;
                                case 7:
                                    image = Fi20;
                                    c=8;
                                    break;
                                case 8:
                                    image = Fi21;
                                    c=9;
                                   break;
                                case 9:
                                    image = Fi22;
                                    c=10;
                                   break;
                                case 10:
                                    image = Fi23;
                                    c=11;
                                   break;
                                case 11:
                                    image = Fi24;
                                    c=0;
                                    break;
                                default:
                                    break;}
                                try {
                                    //x += dx;
                                    Thread.sleep(350);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(Enemigo1.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                        }    
                    }else{
                        image = f3;
                        c=0;
                    }
                    b=5;
                    break;
                case 5:
                    image = f3;
                    b=6;
                    break;
                case 6:
                    image = f4;
                    b=7;
                    break;
                case 7:
                    image = f4;
                    b=0;
                    break;
                default:
                    break;
            }
                    try {
                        //x += dx;
                        Thread.sleep(75);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Enemigo1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                 
                 x += dx;
                    //if(i==19){activo=false;}
                }
                a=1;
        }else if(a==1){
            for(int j=0;j<118;j++){
                if( image == Fi25 || image == Fi26 || image == Fi27 || image == Fi28 || image == Fi29 || image == Fi30 || image == Fi31 || image == Fi32 || image == Fi33 || image == Fi34 || image == Fi35 || image == Fi36){
                    x = (x + 55);
                }
                //x += dx;
                switch (b) {
                case 0:
                    image = iz1;
                    b=1;
                    break;
                case 1:
                    image = iz1;
                    b=2;
                    break;
                case 2:
                    image = iz2;
                    b=3;
                    break;
                case 3:
                    image = iz2;
                    b=4;
                    break;
                case 4:
                    if(j%7 == 0){
                        x = (x - 55);
                        for(int mi=0;mi<11;mi++){
                            switch (c) {
                                case 0:
                                    image = Fi25;
                                    c=1;
                                   break;
                                case 1:
                                    image = Fi26;
                                    c=2;
                                   break;
                                case 2:
                                    image = Fi27;
                                    c=3;
                                   break;
                                case 3:
                                    image = Fi28;
                                    c=4;
                                    break;
                                case 4:
                                    image = Fi29;
                                    c=5;
                                   break;
                                case 5:
                                    image = Fi30;
                                    c=6;
                                   break;
                                case 6:
                                    image = Fi31;
                                    c=7;
                                   break;
                                case 7:
                                    image = Fi32;
                                    c=8;
                                    break;
                                case 8:
                                    image = Fi33;
                                    c=9;
                                   break;
                                case 9:
                                    image = Fi34;
                                    c=10;
                                   break;
                                case 10:
                                    image = Fi35;
                                    c=11;
                                   break;
                                case 11:
                                    image = Fi36;
                                    c=0;
                                    break;
                                default:
                                    break;}
                                try {
                                    //x += dx;
                                    Thread.sleep(350);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(Enemigo1.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                        }    
                    }else{
                        image = iz3;
                        c=0;
                    }
                    b=5;
                    break;
                case 5:
                    image = iz3;
                    b = 6;
                    break;
                case 6:
                    image = iz4;
                    b = 7;
                    break;
                case 7:
                    image = iz4;
                    b=0; 
                    break;
                default:
                    break;
                }
                try { 
                        //x += dx;
                        Thread.sleep(75);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Enemigo1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    y += dy;
                }
                 a=2;
                    //if(i==19){activo=false;}
            }else if(a==2){
                for(int i=0;i<118;i++){
                if( image == Fi1 || image == Fi2 || image == Fi3 || image == Fi4 || image == Fi5 || image == Fi6 || image == Fi7 || image == Fi8 || image == Fi9 || image == Fi10 || image == Fi11 || image == Fi12){
                    y = (y + 55);
                }
                switch (b) {
                 case 0:
                    image = e1;
                    b=1;
                    break;
                case 1:
                    image = e1;
                    b=2;
                    break;
                case 2:
                    image = e2;
                    b=3;
                    break;
                case 3:
                    image = e2;
                    b=4;
                    break;
                case 4:
                    if(i%7 == 0){
                        y = (y - 55);
                        for(int mi=0;mi<11;mi++){
                            switch (c) {
                                case 0:
                                    image = Fi1;
                                    c=1;
                                   break;
                                case 1:
                                    image = Fi2;
                                    c=2;
                                   break;
                                case 2:
                                    image = Fi3;
                                    c=3;
                                   break;
                                case 3:
                                    image = Fi4;
                                    c=4;
                                    break;
                                case 4:
                                    image = Fi5;
                                    c=5;
                                   break;
                                case 5:
                                    image = Fi6;
                                    c=6;
                                   break;
                                case 6:
                                    image = Fi7;
                                    c=7;
                                   break;
                                case 7:
                                    image = Fi8;
                                    c=8;
                                    break;
                                case 8:
                                    image = Fi9;
                                    c=9;
                                   break;
                                case 9:
                                    image = Fi10;
                                    c=10;
                                   break;
                                case 10:
                                    image = Fi11;
                                    c=11;
                                   break;
                                case 11:
                                    image = Fi12;
                                    c=0;
                                    break;
                                default:
                                    break;}
                                try {
                                    //x += dx;
                                    Thread.sleep(350);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(Enemigo1.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                        }    
                    }else{
                        image = e3;
                        c=0;
                    }
                    b=5;
                    break;
                case 5:
                    image = e3;
                    b=6;
                    break;
                case 6:
                    image = e4;
                    b=7;
                    break;
                case 7:
                    image = e4;
                    b=0; 
                    break;
                default:
                    break;
                }       
                    try {
                        //x += dx;
                        Thread.sleep(75);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Enemigo1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                 
                 x -= dx;
                    //if(i==19){activo=false;}
                }
                a=3;
        }else if(a==3){
            for(int j=0;j<118;j++){
                //x += dx;
                switch (b) {
                 case 0:
                    image = de1;
                    b=1;
                    break;
                case 1:
                    image = de1;
                    b=2;
                    break;
                case 2:
                    image = de2;
                    b=3;
                    break;
                case 3:
                    image = de2;
                    b=4;
                    break;
                case 4:
                    if(j%7 == 0){                        
                        for(int mi=0;mi<11;mi++){
                            switch (c) {
                                case 0:
                                    image = Fi37;
                                    c=1;
                                   break;
                                case 1:
                                    image = Fi38;
                                    c=2;
                                   break;
                                case 2:
                                    image = Fi39;
                                    c=3;
                                   break;
                                case 3:
                                    image = Fi40;
                                    c=4;
                                    break;
                                case 4:
                                    image = Fi41;
                                    c=5;
                                   break;
                                case 5:
                                    image = Fi42;
                                    c=6;
                                   break;
                                case 6:
                                    image = Fi43;
                                    c=7;
                                   break;
                                case 7:
                                    image = Fi44;
                                    c=8;
                                    break;
                                case 8:
                                    image = Fi45;
                                    c=9;
                                   break;
                                case 9:
                                    image = Fi46;
                                    c=10;
                                   break;
                                case 10:
                                    image = Fi47;
                                    c=11;
                                   break;
                                case 11:
                                    image = Fi48;
                                    c=0;
                                    break;
                                default:
                                    break;}
                                try {
                                    //x += dx;
                                    Thread.sleep(350);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(Enemigo1.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                        }    
                    }else{
                        image = de3;
                        c=0;
                    }
                    b=5;
                    break;
                case 5:
                    image = de3;
                    b=6; 
                    break;
                case 6:
                    image = de4;
                    b=7;
                    break;
                case 7:
                    image = de4;
                    b=0; 
                    break;
                default:
                    break;
                }
                try {
                        //x += dx;
                        Thread.sleep(75);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Enemigo1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                 y -= dy;
                 a=0;
                    //if(i==19){activo=false;}
                }
        }
                //System.out.println("entro");
                
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