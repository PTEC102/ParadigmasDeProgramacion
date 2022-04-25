/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package claseunab.ejemplo0;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.PLAIN;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

/**
 *
 * @author luster
 */
public class Ejemplo0 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        JButton boton1 = new JButton("Pulsa para escribir");
        boton1.setBounds(15,90,300,50);
        boton1.setFont(new Font("MONOSPACED",PLAIN,16));
        boton1.setOpaque(true);
        boton1.setFocusPainted(false);

        JFrame frame = new JFrame("Mi JFrame");
        //frame.setSize(300, 100);
        //frame.setLocation(50, 50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel contenedor = new JPanel();
        contenedor.setLayout(null);
        
        frame.setBounds(300, 300, 350, 400);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().add(contenedor);
        
        
        JLabel display = new JLabel("");
        display.setBounds(15, 15, 300, 60);
        display.setOpaque(true);
        display.setBackground(Color.BLACK);
        display.setForeground(Color.GREEN);
        display.setBorder(new LineBorder(Color.DARK_GRAY));
        display.setFont(new Font("MONOSPACED", PLAIN, 24));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFocusable(true);
               
        contenedor.add(display);        
        
        
        contenedor.add(boton1);

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Boton presionado");
                display.requestFocus();
            }

        });

        display.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                String ch = String.valueOf(e.getKeyChar());
                System.out.println(ch);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                String ch = String.valueOf(e.getKeyChar());
                if ("1".equals(ch) || "2".equals(ch) || "3".equals(ch)) {
                    display.setText(display.getText() + ch);
                    System.out.println(ch);
                }
                if ("c".equals(ch)) {
                    display.setText("");
                    System.out.println("c presionada");
                }
                System.out.println(ch);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                String ch = String.valueOf(e.getKeyChar());
                System.out.println(ch);
            }

        });

        frame.setVisible(true);

    }
}

//make an event key listener and print key on pressed
// EventKeyListener eventKeyListener = new EventKeyListener();
// eventKeyListener.addKeyListener(new KeyListener() {
//     @Override
//     public void keyPressed(KeyEvent e) {
//         System.out.println("Key pressed: " + e.getKeyCode());
//     }
//     @Override
//     public void keyReleased(KeyEvent e) {
//         System.out.println("Key released: " + e.getKeyCode());
//     }
//     @Override
//     public void keyTyped(KeyEvent e) {
//         System.out.println("Key typed: " + e.getKeyCode());
//     }
        // });
