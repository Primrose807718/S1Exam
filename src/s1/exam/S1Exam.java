/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s1.exam;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

/**
 *
 * @author Primrose
 */
public class S1Exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame j  = new JFrame ("S1Exam");
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(1100, 860);
        Space c = new Space();
        j.add(c);
        j.setVisible(true);
        j.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent e) {
            c.keyPressed(e);
        }
        public void keyReleased(KeyEvent e) {
            c.keyReleased(e);
        }
    });
    }

}