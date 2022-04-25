package claseunab.ejemplo1;

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
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


public class Ventana extends JFrame {
    JButton boton1;
    
    JLabel display;
    int contador = 0;
    public Ventana(){
    
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 300, 350, 400);
        this.setLocationRelativeTo(null);
        

        initDisplay();
        initBoton();

        initPantalla();
    }

    private void initPantalla(){

        setTitle("Ejemplo 3: Eventos");
        setSize(350,400);
        setResizable(false);
        setLayout(null);
        //getContentPane().setBackground(Color.BLACK);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
  
      }

    public void initDisplay(){
        display = new JLabel("");
        display.setBounds(15, 15, 300, 60);
        display.setOpaque(true);
        display.setBackground(Color.BLACK);
        display.setForeground(Color.GREEN);
        display.setBorder(new LineBorder(Color.DARK_GRAY));
        display.setFont(new Font("MONOSPACED",PLAIN,24));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFocusable(true);
        this.add(display);

        display.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //String ch = String.valueOf(e.getKeyChar());
                //System.out.println(ch);
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
                //String ch = String.valueOf(e.getKeyChar());
                //System.out.println(ch);
            }

        });
    }

    public void initBoton(){
        this.boton1 = new JButton("Pulsa o teclea 1");
        boton1.setBounds(15,90,300,50);
        boton1.setFont(new Font("MONOSPACED",PLAIN,16));
        boton1.setOpaque(true);
        boton1.setFocusPainted(false);

        add(boton1);

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println( contador++);
                display.requestFocus();
            }

        });
    }
}
