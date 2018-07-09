package Principal;

import Principal.Tablero.hilo;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Tablero extends JPanel implements ActionListener {

    private Timer timer;
    private Personaje craft = new Personaje();
    private int vida = 30001;
    private int puntaje = 10000;
    public Proyectil bala;
    public Enemigo1 mango;
    public Enemigo2 white;
    public Enemigo3 purple;
    private Estrella estrella;
    public BOSS boss;
    private int bossi = 0;
    private int bossvida = 100;
    private final int DELAY = 10;
    private Image fondo;
    private int a;
    private int m = 0;
    private hilo h1;
    private hilo2 h2;
    private hilo3 h3;
    private hilo4 h4;
    private hilo5 h5;
    private Image image;
    private int ini = 0;
    private JTextField punta;
    private String nickname;
    Font fuente=new Font("Dialog", Font.BOLD, 36);
    Image de = new ImageIcon(getClass().getResource("/recursos/flecha11.png")).getImage();
    Image iz = new ImageIcon(getClass().getResource("/recursos/iz.png")).getImage();
    Image ar = new ImageIcon(getClass().getResource("/recursos/ar.png")).getImage();
    Image ab = new ImageIcon(getClass().getResource("/recursos/ab.png")).getImage();
    Image life1 = new ImageIcon(getClass().getResource("/recursos/vida1.png")).getImage();
    Image life2 = new ImageIcon(getClass().getResource("/recursos/vida2.png")).getImage();
    Image life3 = new ImageIcon(getClass().getResource("/recursos/vida3.png")).getImage();
    Image life4 = new ImageIcon(getClass().getResource("/recursos/vida4.png")).getImage();
    Image life5 = new ImageIcon(getClass().getResource("/recursos/vida5.png")).getImage();
    Image BL1 = new ImageIcon(getClass().getResource("/recursos/BL1.png")).getImage();
    Image BL2 = new ImageIcon(getClass().getResource("/recursos/BL2.png")).getImage();
    Image BL3 = new ImageIcon(getClass().getResource("/recursos/BL3.png")).getImage();
    Image BL4 = new ImageIcon(getClass().getResource("/recursos/BL4.png")).getImage();
    Image BL5 = new ImageIcon(getClass().getResource("/recursos/BL5.png")).getImage();
    Image flecha = new ImageIcon(getClass().getResource("/recursos/flecha2.gif")).getImage();
    

    public Tablero() {
        java.awt.Image start = new ImageIcon(getClass().getResource("/recursos/start.png")).getImage();
       
        fondo = start;
        initBoard();
    }

    private void initBoard() {

        addKeyListener(new TAdapter());
        setFocusable(true);
        setOpaque(false);
        mango = new Enemigo1();
        mango.setActivo(true);
        white = new Enemigo2();
        white.setActivo(true);
        purple = new Enemigo3();
        purple.setActivo(true);
        estrella = new Estrella();
        craft.setActivo(true);
        estrella.setActivo(true);
        boss = new BOSS();
        h2 = new hilo2();
        h2.start();
        h3 = new hilo3();
        h3.start();
        h4 = new hilo4();
        h4.start();
        h5 = new hilo5();
        h5.start();
        punta = new JTextField();
        //punta.setLocation(100, 100);
        //punta.setVisible(false);
        punta.setOpaque(false);
        punta.setBorder(null);
        punta.setFont(fuente);
        punta.setForeground(Color.GREEN);
        
        //punta.setBounds(100, 50, 100, 50);
        punta.setText(String.valueOf(puntaje));
        bala = new Proyectil();
        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {

        g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
        doDrawing(g);
        Toolkit.getDefaultToolkit().sync();
    }
 

    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        add(punta);
        if(m==1||m==2||m==3){
            //add(punta);
            if(craft.isActivo()){
            if(bala.isActivo()) {
                g2d.drawImage(image, bala.getX(), bala.getY(), this);
            }
            
            g2d.drawImage(craft.getImage(), craft.getX(), craft.getY(), this);

            if(mango.isActivo()) {
                g2d.drawImage(mango.getImage(), mango.getX(), mango.getY(), this);
                if((bala.getX()) >= mango.getX() && (bala.getX()) <= (mango.getX() + 36) && (bala.getY()) >= (mango.getY()) && (bala.getY()) <= (mango.getY() + 36)) {
                    bala.setActivo(false);
                    bala.setX(0);
                    mango.setActivo(false);
                    puntaje = (puntaje + 50);
                    mango.setX(0);
                    mango.setY(0);
                }
                if ((craft.getX()) >= mango.getX() && (craft.getX()) <= (mango.getX() + 36) && (craft.getY()) >= (mango.getY()) && (craft.getY()) <= (mango.getY() + 36) || (craft.getX()) >= mango.getX() && (craft.getX()) <= (mango.getX() + 32) && (craft.getY()) >= (mango.getY()) && (craft.getY()) <= (mango.getY() + 32) || (craft.getX()) >= mango.getX() && (craft.getX()) <= (mango.getX() + 28) && (craft.getY()) >= (mango.getY()) && (craft.getY()) <= (mango.getY() + 28) || (craft.getX()) >= mango.getX() && (craft.getX()) <= (mango.getX() + 24) && (craft.getY()) >= (mango.getY()) && (craft.getY()) <= (mango.getY() + 24) || (craft.getX()) >= mango.getX() && (craft.getX()) <= (mango.getX() + 20) && (craft.getY()) >= (mango.getY()) && (craft.getY()) <= (mango.getY() + 20) || (craft.getX()) >= mango.getX() && (craft.getX()) <= (mango.getX() + 16) && (craft.getY()) >= (mango.getY()) && (craft.getY()) <= (mango.getY() + 16) || (craft.getX()) >= mango.getX() && (craft.getX()) <= (mango.getX() + 12) && (craft.getY()) >= (mango.getY()) && (craft.getY()) <= (mango.getY() + 12) || (craft.getX()) >= mango.getX() && (craft.getX()) <= (mango.getX() + 8) && (craft.getY()) >= (mango.getY()) && (craft.getY()) <= (mango.getY() + 8) || (craft.getX()) >= mango.getX() && (craft.getX()) <= (mango.getX() + 4) && (craft.getY()) >= (mango.getY()) && (craft.getY()) <= (mango.getY() + 4)) {
                    System.out.println("CHOCARON WE :v");
                    vida = (vida- 30);
                    System.out.println("Vida actual "+vida);
                }
            }
            if (white.isActivo()) {
                g2d.drawImage(white.getImage(), white.getX(), white.getY(), this);
                if ((bala.getX()) >= white.getX() && (bala.getX()) <= (white.getX() + 36) && (bala.getY()) >= (white.getY()) && (bala.getY()) <= (white.getY() + 36)) {
                    bala.setActivo(false);
                    bala.setX(0);
                    white.setActivo(false);
                    puntaje = (puntaje + 50);
                    white.setX(0);
                    white.setY(0);
                }
                if ((craft.getX()) >= white.getX() && (craft.getX()) <= (white.getX() + 36) && (craft.getY()) >= (white.getY()) && (craft.getY()) <= (white.getY() + 36) || (craft.getX()) >= white.getX() && (craft.getX()) <= (white.getX() + 32) && (craft.getY()) >= (white.getY()) && (craft.getY()) <= (white.getY() + 32) || (craft.getX()) >= white.getX() && (craft.getX()) <= (white.getX() + 28) && (craft.getY()) >= (white.getY()) && (craft.getY()) <= (white.getY() + 28) || (craft.getX()) >= white.getX() && (craft.getX()) <= (white.getX() + 24) && (craft.getY()) >= (white.getY()) && (craft.getY()) <= (white.getY() + 24) || (craft.getX()) >= white.getX() && (craft.getX()) <= (white.getX() + 20) && (craft.getY()) >= (white.getY()) && (craft.getY()) <= (white.getY() + 20) || (craft.getX()) >= white.getX() && (craft.getX()) <= (white.getX() + 16) && (craft.getY()) >= (white.getY()) && (craft.getY()) <= (white.getY() + 16) || (craft.getX()) >= white.getX() && (craft.getX()) <= (white.getX() + 12) && (craft.getY()) >= (white.getY()) && (craft.getY()) <= (white.getY() + 12) || (craft.getX()) >= white.getX() && (craft.getX()) <= (white.getX() + 8) && (craft.getY()) >= (white.getY()) && (craft.getY()) <= (white.getY() + 8) || (craft.getX()) >= white.getX() && (craft.getX()) <= (white.getX() + 4) && (craft.getY()) >= (white.getY()) && (craft.getY()) <= (white.getY() + 4)) {
                    System.out.println("CHOCARON WE :v");
                    vida = (vida - 30);
                    System.out.println("Vida actual "+vida);
                }
            }
            if (purple.isActivo()) {
                g2d.drawImage(purple.getImage(), purple.getX(), purple.getY(), this);
                if ((bala.getX()) >= purple.getX() && (bala.getX()) <= (purple.getX() + 48) && (bala.getY()) >= (purple.getY()) && (bala.getY()) <= (purple.getY() + 48)) {
                    bala.setActivo(false);
                    bala.setX(0);
                    purple.setActivo(false);
                    puntaje = (puntaje + 100);
                    purple.setX(0);
                    purple.setY(0);
                }
                if ((craft.getX()) >= purple.getX() && (craft.getX()) <= (purple.getX() + 36) && (craft.getY()) >= (purple.getY()) && (craft.getY()) <= (purple.getY() + 36) || (craft.getX()) >= purple.getX() && (craft.getX()) <= (purple.getX() + 32) && (craft.getY()) >= (purple.getY()) && (craft.getY()) <= (purple.getY() + 32) || (craft.getX()) >= purple.getX() && (craft.getX()) <= (purple.getX() + 28) && (craft.getY()) >= (purple.getY()) && (craft.getY()) <= (purple.getY() + 28) || (craft.getX()) >= purple.getX() && (craft.getX()) <= (purple.getX() + 24) && (craft.getY()) >= (purple.getY()) && (craft.getY()) <= (purple.getY() + 24) || (craft.getX()) >= purple.getX() && (craft.getX()) <= (purple.getX() + 20) && (craft.getY()) >= (purple.getY()) && (craft.getY()) <= (purple.getY() + 20) || (craft.getX()) >= purple.getX() && (craft.getX()) <= (purple.getX() + 16) && (craft.getY()) >= (purple.getY()) && (craft.getY()) <= (purple.getY() + 16) || (craft.getX()) >= purple.getX() && (craft.getX()) <= (purple.getX() + 12) && (craft.getY()) >= (purple.getY()) && (craft.getY()) <= (purple.getY() + 12) || (craft.getX()) >= purple.getX() && (craft.getX()) <= (purple.getX() + 8) && (craft.getY()) >= (purple.getY()) && (craft.getY()) <= (purple.getY() + 8) || (craft.getX()) >= purple.getX() && (craft.getX()) <= (purple.getX() + 4) && (craft.getY()) >= (purple.getY()) && (craft.getY()) <= (purple.getY() + 4)) {
                    System.out.println("CHOCARON WE :v");
                    vida = (vida-30);
                    System.out.println("Vida actual"+vida);
                }
            }
            if(estrella.isActivo()){
                g2d.drawImage(estrella.getImage(), estrella.getX(), estrella.getY(), this);
                if((craft.getX()) >= estrella.getX() && (craft.getX()) <= (estrella.getX() + 40) && (craft.getY()) >= (estrella.getY()) && (craft.getY()) <= (estrella.getY() + 40) || (craft.getX()) >= estrella.getX() && (craft.getX()) <= (estrella.getX() + 40) && (craft.getY()) >= (estrella.getY()) && (craft.getY()) <= (estrella.getY() + 40) || (craft.getX()) >= estrella.getX() && (craft.getX()) <= (estrella.getX() + 40) && (craft.getY()) >= (estrella.getY()) && (craft.getY()) <= (estrella.getY() + 40) || (craft.getX()) >= estrella.getX() && (craft.getX()) <= (estrella.getX() + 40) && (craft.getY()) >= (estrella.getY()) && (craft.getY()) <= (estrella.getY() + 40) || (craft.getX()) >= estrella.getX() && (craft.getX()) <= (estrella.getX() + 40) && (craft.getY()) >= (estrella.getY()) && (craft.getY()) <= (estrella.getY() + 40) || (craft.getX()) >= estrella.getX() && (craft.getX()) <= (estrella.getX() + 40) && (craft.getY()) >= (estrella.getY()) && (craft.getY()) <= (estrella.getY() + 40) || (craft.getX()) >= estrella.getX() && (craft.getX()) <= (estrella.getX() + 40) && (craft.getY()) >= (estrella.getY()) && (craft.getY()) <= (estrella.getY() + 40) || (craft.getX()) >= estrella.getX() && (craft.getX()) <= (estrella.getX() + 40) && (craft.getY()) >= (estrella.getY()) && (craft.getY()) <= (estrella.getY() + 40) || (craft.getX()) >= estrella.getX() && (craft.getX()) <= (estrella.getX() + 40) && (craft.getY()) >= (estrella.getY()) && (craft.getY()) <= (estrella.getY() + 40)){
                    puntaje = (puntaje * 2);
                    estrella.setActivo(false);
                }
            }
        }
        if (boss.isActivo()) {
            g2d.drawImage(boss.getImage(), boss.getX(), boss.getY(), this);
            if ((bala.getX()) >= boss.getX() && (bala.getX()) <= (boss.getX() + 200) && (bala.getY()) >= (boss.getY()) && (bala.getY()) <= (boss.getY() + 200)) {
                bala.setActivo(false);
                bala.setX(0);
                bossvida = (bossvida - 20);
                System.out.println("BOSSLIFE "+bossvida);
                if(bossvida <= 0){
                    boss.setActivo(false);
                }
            }
            if ((craft.getX()) >= boss.getX() && (craft.getX()) <= (boss.getX() + 36) && (craft.getY()) >= (boss.getY()) && 
                (craft.getY()) <= (boss.getY() + 36) || (craft.getX()) >= boss.getX() && (craft.getX()) <= (boss.getX() + 32) &&
                (craft.getY()) >= (boss.getY()) && (craft.getY()) <= (boss.getY() + 32) || (craft.getX()) >= purple.getX() && 
                (craft.getX()) <= (purple.getX() + 28) && (craft.getY()) >= (purple.getY()) && 
                (craft.getY()) <= (purple.getY() + 28) || (craft.getX()) >= purple.getX() && 
                (craft.getX()) <= (purple.getX() + 24) && (craft.getY()) >= (purple.getY()) && 
                (craft.getY()) <= (purple.getY() + 24) || (craft.getX()) >= purple.getX() && 
                (craft.getX()) <= (purple.getX() + 20) && (craft.getY()) >= (purple.getY()) && 
                (craft.getY()) <= (purple.getY() + 20) || (craft.getX()) >= purple.getX() &&
                (craft.getX()) <= (purple.getX() + 16) && (craft.getY()) >= (purple.getY()) && 
                (craft.getY()) <= (purple.getY() + 16) || (craft.getX()) >= purple.getX() && 
                (craft.getX()) <= (purple.getX() + 12) && (craft.getY()) >= (purple.getY()) && 
                (craft.getY()) <= (purple.getY() + 12) || (craft.getX()) >= purple.getX() && 
                (craft.getX()) <= (purple.getX() + 8) && (craft.getY()) >= (purple.getY()) && 
                (craft.getY()) <= (purple.getY() + 8) || (craft.getX()) >= purple.getX() && 
                (craft.getX()) <= (purple.getX() + 4) && (craft.getY()) >= (purple.getY()) && 
                (craft.getY()) <= (purple.getY() + 4)) {
                System.out.println("CHOCARON WE :v");
                vida = (vida - 10);
                System.out.println("Vida actual"+vida);
            }
        }
        if(bossvida <= 0){
                boss.setActivo(false);
        }
        }
        if(!mango.isActivo() && !white.isActivo() && !purple.isActivo()){
            if(m == 1 && craft.isActivo()){
                g2d.drawImage(flecha, 483, 1, this);
                
            }
            if(m == 2 && craft.isActivo()){
               // g2d.drawImage(flecha, 483, 1, this);
                g2d.drawImage(flecha, 885, 150, this);
            }
            if (craft.getX() >= 440 && craft.getX() <= 500 && craft.getY() == 1) {
                m = 2;
                puntaje += 500;
                white.setX(460);
                white.setY(320);
                white.setActivo(true);
                mango.setX(771);
                mango.setY(636);
                mango.setActivo(true);
                purple.setX(120);
                purple.setY(75);
                purple.setActivo(true);
                estrella.setX(20);
                estrella.setY(60);
                estrella.setActivo(true);
                if(vida >= 20000 && vida <= 30000){
                    puntaje = (puntaje + 1000);
                }else if(vida >= 10000 && vida <= 19999){
                    puntaje = (puntaje + 500);
                }
            }
            if (craft.getX() >= 860 && craft.getX() <= 882 && craft.getY() == 126) {
                m = 3;
                puntaje += 500;
                white.setX(0);
                white.setY(0);
               
                mango.setX(0);
                mango.setY(0);
                
                purple.setX(0);
                purple.setY(0);
            }
        }
        switch (m) {
            case 1:

                java.awt.Image fond1 = new ImageIcon(getClass().getResource("/recursos/dungeon.png")).getImage();
                fondo = fond1;
                punta.setVisible(true);
                punta.setLocation(810, 5);
                punta.setText(String.valueOf(puntaje));
            
                break;
            case 2:
                Image fond = new ImageIcon(getClass().getResource("/recursos/FONDOIDEAL27.jpg")).getImage(); 
                fondo = fond;
                /*punta.setVisible(true);
                punta.setLocation(810, 5);
                punta.setText(String.valueOf(puntaje));*/
                punta.setLocation(810, 5);
                punta.setText(String.valueOf(puntaje));
                if (ini == 0) {
                    craft.setX(17);
                    craft.setY(850);
                    ini = 2;
                }
                break;
            case 3:
                Image finale = new ImageIcon(getClass().getResource("/recursos/Final.jpg")).getImage();
                fondo = finale;
                
                if(bossi == 0){
                    boss.setActivo(true);
                    bossi = 1;
                }
                estrella.setActivo(false);
                punta.setLocation(810, 5);
                punta.setText(String.valueOf(puntaje));
                if (ini == 2) {
                    craft.setX(755);
                    craft.setY(354);
                    ini = 3;
                }                
                break;
        }
        if(vida > 0){
        if(vida >= 24000 && vida <= 30000){
            g2d.drawImage(life5, 590, 0, this);
        }else if(vida >= 18000 && vida <= 23999){
            g2d.drawImage(life4, 590, 0, this);
        }else if(vida >= 12000 && vida <= 17999){
            g2d.drawImage(life3, 590, 0, this); 
        }else if(vida >= 6000 && vida <= 11999){
            g2d.drawImage(life2, 590, 0, this);
        }else if(vida >= 0 && vida < 6000){
            g2d.drawImage(life1, 590, 0, this);
        }
        }
        if(m == 3 && bossvida > 0){
        if(bossvida >= 80 && bossvida <= 100){
            g2d.drawImage(BL1, 0, 0, this);
        }else if(bossvida >= 60 && bossvida <= 79){
            g2d.drawImage(BL2, 0, 0, this);
        }else if(bossvida >= 40 && bossvida <= 59){
            g2d.drawImage(BL3, 0, 0, this); 
        }else if(bossvida >= 20 && bossvida <= 39){
            g2d.drawImage(BL4, 0, 0, this);
        }else if(bossvida >= 0 && bossvida < 20){
            g2d.drawImage(BL5, 0, 0, this);
        }
        }
        if(vida < 0){
                    java.awt.Image GameOver = new ImageIcon(getClass().getResource("/recursos/GameOver.png")).getImage();
                    fondo = GameOver;
                    bala.setActivo(false);
                    mango.setActivo(false);
                    white.setActivo(false);
                    purple.setActivo(false);
                    craft.setActivo(false);
                    boss.setX(0);
                    boss.setY(0);
                    //System.out.println("*********GAME OVER*******");
                    //System.out.println("GAME OVER");
                }
                else if(craft.isActivo() && m == 3 && bossvida <= 0){
                    java.awt.Image Win = new ImageIcon(getClass().getResource("/recursos/YouWin.png")).getImage();
                    fondo = Win;
                    craft.setX(1000);
                    craft.setY(1000);
                    vida = 0;
                }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        craft.move(m);
        repaint();
    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            craft.keyReleased(e);
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_SPACE) {
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            craft.keyPressed(e);
            if (key == KeyEvent.VK_SPACE) {
                if (!bala.isActivo()) {
                    bala.setActivo(true);
                    h1 = new hilo(bala);
                    h1.start();
                    System.out.println(craft.getX() + "," + craft.getY());
                }
            }

            if (key == KeyEvent.VK_RIGHT) {
                a = 0;
            }
            if (key == KeyEvent.VK_LEFT) {
                a = 1;
            }
            if (key == KeyEvent.VK_UP) {
                a = 2;
            }
            if (key == KeyEvent.VK_DOWN) {
                a = 3;
            }
            if (key == KeyEvent.VK_ENTER) {
                if(m==0){
                    m=1;
                    vida = 30000;
                    //add(punta);
                }
                if(!craft.isActivo()){
                    nickname = JOptionPane.showInputDialog("What is the name of who has tried to beat me? ", "Player");
                    System.out.println(nickname);
                }
                if(craft.isActivo() && m == 3 && bossvida <=0){
                    boss.setActivo(false);
                    nickname = JOptionPane.showInputDialog("Whats yoour name, hero? ", "Player");
                    System.out.println(nickname);
                }
            }
        }
    }

    public class hilo extends Thread {

        private Proyectil ba;

        public hilo(Proyectil b) {
            ba = b;
            ba.setX(craft.getX() + 9);
            ba.setY(craft.getY() + 6);
        }

        @Override
        public void run() {
            while (ba.isActivo()) {
                if (ba.isActivo()) {
                    switch (a) {
                        //DERECHA
                        case 0:
                            image = de;
                            for (int i = 0; i < 50; i++) {

                                ba.setX(ba.getX() + 3);
                                try {
                                    Thread.sleep(30);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(Tablero.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            ba.setActivo(false);
                            break;
                        //IZQUIERDA
                        case 1:
                            image = iz;
                            for (int i = 0; i < 50; i++) {

                                ba.setX(ba.getX() - 3);
                                try {
                                    Thread.sleep(30);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(Tablero.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            ba.setActivo(false);
                            break;
                        //ARRIBA
                        case 2:
                            image = ar;
                            for (int i = 0; i < 50; i++) {

                                ba.setY(ba.getY() - 3);
                                try {
                                    Thread.sleep(30);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(Tablero.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            ba.setActivo(false);
                            break;
                        //ABAJO
                        case 3:
                            image = ab;
                            for (int i = 0; i < 50; i++) {
                                ba.setY(ba.getY() + 3);
                                try {
                                    Thread.sleep(30);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(Tablero.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            ba.setActivo(false);
                            break;
                    }
                }
            }
        }
    }

    public class hilo2 extends Thread {

        @Override
        public void run() {
            while (true) {
                mango.move();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Tablero.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public class hilo3 extends Thread {

        @Override
        public void run() {
            while (true) {  
                white.move();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Tablero.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public class hilo4 extends Thread {

        @Override
        public void run() {
            while (true) {
                purple.move();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Tablero.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public class hilo5 extends Thread {
        @Override
        public void run() {
            while (true) {
                boss.move();
                try {
                    Thread.sleep(8);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Tablero.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
