/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s1.exam;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JPanel;

/**
 *
 * @author Primrose
 */
public class Space extends JPanel {
    private Timer timer;
    int mx = 400;
    int my = 400;
    int vx = 360;
    int vy = 360;
    int ex = 325;
    int ey = 325;
    int Mx = 290;
    int My = 290;
    int jx = 210;
    int jy = 210;
    int sx = 140;
    int sy = 140;
    int ux = 90;
    int uy = 90;
    int nx = 40;
    int ny = 40;
    int px = 20;
    int py = 20;
    
    public Space() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 100, 1000/10);
    }

    void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            mx += 5;
            vx += 5;
            ex += 5;
            Mx += 5;
            jx += 5;
            sx += 5;
            ux += 5;
            nx += 5;
            px += 5;
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            mx -= 5;
            vx -= 5;
            ex -= 5;
            Mx -= 5;
            jx -= 5;
            sx -= 5;
            ux -= 5;
            nx -= 5;
            px -= 5;
        }
        else if (e.getKeyCode() == KeyEvent.VK_UP) {
            my -= 5;
            vy -= 5;
            ey -= 5;
            My -= 5;
            jy -= 5;
            sy -= 5;
            uy -= 5;
            ny -= 5;
            py -= 5;
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            my += 5;
            vy += 5;
            ey += 5;
            My += 5;
            jy += 5;
            sy += 5;
            uy += 5;
            ny += 5;
            py += 5;
        }
    }

    void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            mx += 5;
            vx += 5;
            ex += 5;
            Mx += 5;
            jx += 5;
            sx += 5;
            ux += 5;
            nx += 5;
            px += 5;
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            mx -= 5;
            vx -= 5;
            ex -= 5;
            Mx -= 5;
            jx -= 5;
            sx -= 5;
            ux -= 5;
            nx -= 5;
            px -= 5;
        if (e.getKeyCode() == KeyEvent.VK_UP)
            my -= 5;
            vy -= 5;
            ey -= 5;
            My -= 5;
            jy -= 5;
            sy -= 5;
            uy -= 5;
            ny -= 5;
            py -= 5;
        if (e.getKeyCode() == KeyEvent.VK_DOWN)
            my += 5;
            vy += 5;
            ey += 5;
            My += 5;
            jy += 5;
            sy += 5;
            uy += 5;
            ny += 5;
            py += 5;

    }
    
    private class ScheduleTask extends TimerTask {
    
        @Override
        public void run() {
            repaint();
        }
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        
            g.setColor(Color.LIGHT_GRAY);
            drawStars(g);
            
            g.setColor(Color.WHITE);
            drawStars2(g);
            
            g.setColor(Color.YELLOW);
            drawStars3(g);
            
            g.setColor(new Color(204, 204, 255));
            drawStars4(g);
            
            g.setColor(new Color(255, 204, 0));
            Sun(g);
            
            g.setColor(new Color(102, 102, 102));
            Mercury(g);
            
            g.setColor(new Color(255, 52, 0));
            Venus(g);
            
            g.setColor(new Color(51, 153, 255));
            Earth(g);
            
            g.setColor(new Color(153, 0, 0));
            Mars(g);
            
            g.setColor(new Color(255, 178, 102));
            Jupiter(g);
            
            g.setColor(new Color(255, 229, 204));
            Saturn(g);
            
            g.setColor(new Color(153, 204, 255));
            Uranus(g);
            
            g.setColor(new Color(18, 102, 229));
            Neptune(g);
            
            g.setColor(new Color(204, 204, 255));
            Pluto(g);
            //g.dispose();  
    }
    
    public void drawStars(Graphics g){
        int x = 0;
        int y = 0;
        for (int i = 0; i < 30; i++) {
           x = (int) (Math.random() * 1100);
           y = (int) (Math.random() * 860);
           Color curr = g.getColor();
           if (x % 2 == 0) 
               g.setColor(curr.brighter());
           else
               g.setColor(curr.darker());
            g.fillOval(x, y, 2, 2);
            
            System.out.println(x+" "+y);
            //if ( x > 1100 || y > 860 ) {
            //   break;
            //}
        }
    }
    
    public void drawStars2(Graphics g){
        int x = 0;
        int y = 0;
        for (int i = 0; i < 30; i++) {
           x = (int) (Math.random() * 1100);
           y = (int) (Math.random() * 860);
           Color curr = g.getColor();
           if (x % 2 == 0) 
               g.setColor(curr.brighter());
           else
               g.setColor(curr.darker());
            g.fillOval(x, y, 2, 2);
            
            System.out.println(x+" "+y);
            //if ( x > 1100 || y > 860 ) {
            //   break;
            //}
        }
    }
    
    public void drawStars3(Graphics g){
        int x = 0;
        int y = 0;
        for (int i = 0; i < 20; i++) {
           x = (int) (Math.random() * 1100);
           y = (int) (Math.random() * 860);
           Color curr = g.getColor();
           if (x % 2 == 0) 
               g.setColor(curr.brighter());
           else
               g.setColor(curr.darker());
            g.fillOval(x, y, 2, 2);
            
            System.out.println(x+" "+y);
            //if ( x > 1100 || y > 860 ) {
            //   break;
            //}
        }
    }
    
    public void drawStars4(Graphics g){
        int x = 0;
        int y = 0;
        for (int i = 0; i < 20; i++) {
           x = (int) (Math.random() * 1100);
           y = (int) (Math.random() * 860);
           Color curr = g.getColor();
           if (x % 2 == 0) 
               g.setColor(curr.brighter());
           else
               g.setColor(curr.darker());
            g.fillOval(x, y, 2, 2);
            
            System.out.println(x+" "+y);
            //if ( x > 1100 || y > 860 ) {
            //   break;
            //}
        }
    }
    
    public void Sun(Graphics g){
        int x = 0;
        int y = 0;
        for (int i = 0; i < 1; i++) {
           x = (int) (Math.random() * 1100);
           y = (int) (Math.random() * 860);
           Color curr = g.getColor();
           if (x % 2 == 0) 
               g.setColor(curr.brighter());
           else
               g.setColor(curr.darker());
            g.fillOval(457, 452, 158, 158);
            
            System.out.println(x+" "+y);
            //if ( x > 1100 || y > 860 ) {
            //   break;
            //}
        }
    }
    
    public void Mercury(Graphics g){
        g.fillOval(mx, my, 28, 28);
            
        System.out.println(mx+" "+my);
        //if ( x > 1100 || y > 860 ) {
        //   break;
        //}
    }
    
    public void Venus(Graphics g){
        g.fillOval(vx, vy, 38, 38);
            
        System.out.println(vx+" "+vy);
        //if ( x > 1100 || y > 860 ) {
        //   break;
        //}
    }
    
    public void Earth(Graphics g){
        g.fillOval(ex, ey, 38, 38);
            
        System.out.println(ex+" "+ey);
        //if ( x > 1100 || y > 860 ) {
        //   break;
        //}
    }
    
    public void Mars(Graphics g){
        g.fillOval(Mx, My, 33, 33);
            
        System.out.println(Mx+" "+My);
        //if ( x > 1100 || y > 860 ) {
        //   break;
        //}
    }
    
    public void Jupiter(Graphics g){
        g.fillOval(jx, jy, 88, 88);
            
        System.out.println(jx+" "+jy);
        //if ( x > 1100 || y > 860 ) {
        //   break;
        //}
    }
    
    public void Saturn(Graphics g){
        g.fillOval(sx, sy, 83, 83);
            
        System.out.println(sx+" "+sy);
        //if ( x > 1100 || y > 860 ) {
        //   break;
        //}
    }
    
    public void Uranus(Graphics g){
        g.fillOval(ux, ux, 63, 63);
            
        System.out.println(ux+" "+uy);
        //if ( x > 1100 || y > 860 ) {
        //   break;
        //}
    }
    
    public void Neptune(Graphics g){
        g.fillOval(nx, nx, 58, 58);
            
        System.out.println(nx+" "+ny);
        //if ( x > 1100 || y > 860 ) {
        //   break;
        //}
    }
    
    public void Pluto(Graphics g){
         g.fillOval(px, py, 19, 19);
            
        System.out.println(px+" "+py);
        //if ( x > 1100 || y > 860 ) {
        //   break;
        //}
    }
    
}

