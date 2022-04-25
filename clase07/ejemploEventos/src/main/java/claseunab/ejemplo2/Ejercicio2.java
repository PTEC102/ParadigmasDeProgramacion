package claseunab.ejemplo2;


import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.PLAIN;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Ejercicio2 extends JFrame{

  JLabel display;
  JButton boton1, boton2, boton3, botonLimpiar;

  public Ejercicio2(){

    //Declaro métodos en el constructor para simplificar el código
    initDisplay();
    initBotones();
    initAcciones();
    initHovers();
    initPantalla(); //El JFrame lo último para que me pinte correctamente los botones

    }

    private void initPantalla(){

      setTitle("Ejemplo 2: Eventos");
      setSize(240,390);
      setResizable(false);
      setLayout(null);
      getContentPane().setBackground(Color.BLACK);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);

    }

    private void initDisplay(){

      //Propiedades y estilos del JLabel
      display = new JLabel("");
      display.setBounds(15, 15, 195, 60);
      display.setOpaque(true);
      display.setBackground(Color.BLACK);
      display.setForeground(Color.GREEN);
      display.setBorder(new LineBorder(Color.DARK_GRAY));
      display.setFont(new Font("MONOSPACED",PLAIN,24));
      display.setHorizontalAlignment(SwingConstants.RIGHT);
      display.setFocusable(true);
      add(display);

      //Eventos de entrada de teclado
      display.addKeyListener(new KeyListener(){
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
          String ch = String.valueOf(e.getKeyChar());
          if ("1".equals(ch) || "2".equals(ch) || "3".equals(ch)){
            display.setText(display.getText() + ch);  
          }
          if ("c".equals(ch)){
            display.setText("");
          }
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }

      });

    }

    //Propiedades y estilos de los JButton
    private void initBotones(){

      boton1 = new JButton("Pulsa o teclea 1");
      boton2 = new JButton("Pulsa o teclea 2");
      boton3 = new JButton("Pulsa o teclea 3");
      botonLimpiar = new JButton("Limpiar display");

      boton1.setBounds(15,90,195,50);
      boton2.setBounds(15,155,195,50);
      boton3.setBounds(15,220,195,50);
      botonLimpiar.setBounds(15,285,195,50);

      boton1.setFont(new Font("MONOSPACED",PLAIN,16));
      boton2.setFont(new Font("MONOSPACED",PLAIN,16));
      boton3.setFont(new Font("MONOSPACED",PLAIN,16));
      botonLimpiar.setFont(new Font("MONOSPACED",PLAIN,16));

      boton1.setOpaque(true);
      boton2.setOpaque(true);
      boton3.setOpaque(true);
      botonLimpiar.setOpaque(true);

      boton1.setFocusPainted(false);
      boton1.setBackground(Color.DARK_GRAY);
      boton1.setBorder(new LineBorder(Color.DARK_GRAY));
      boton1.setForeground(Color.WHITE);

      boton2.setFocusPainted(false);
      boton2.setBackground(Color.DARK_GRAY);
      boton2.setBorder(new LineBorder(Color.DARK_GRAY));
      boton2.setForeground(Color.WHITE);

      boton3.setFocusPainted(false);
      boton3.setBackground(Color.DARK_GRAY);
      boton3.setBorder(new LineBorder(Color.DARK_GRAY));
      boton3.setForeground(Color.WHITE);

      botonLimpiar.setFocusPainted(false);
      botonLimpiar.setBackground(Color.DARK_GRAY);
      botonLimpiar.setBorder(new LineBorder(Color.DARK_GRAY));
      botonLimpiar.setForeground(Color.WHITE);

      add(boton1);
      add(boton2);
      add(boton3);
      add(botonLimpiar);

    }

    //Eventos de acción de botón
    private void initAcciones(){

      boton1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          display.setText(display.getText() + "1");
          display.requestFocus(); //devuelvo foco a display para que funcione el KeyListener
        }
      });

      boton2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          display.setText(display.getText() + "2");
          display.requestFocus();
        }
      });

      boton3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          display.setText(display.getText() + "3");
          display.requestFocus();
      }
      });

      botonLimpiar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          display.setText("");
          display.requestFocus();
        }
      });

    }

    //Eventos de mouse
    private void initHovers(){

      boton1.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
          boton1.setBackground(Color.GREEN);
          boton1.setBorder(new LineBorder(Color.GREEN));
          boton1.setForeground(Color.DARK_GRAY);
        }

        @Override
        public void mouseExited(MouseEvent e) {
          boton1.setBackground(Color.DARK_GRAY);
          boton1.setBorder(new LineBorder(Color.DARK_GRAY));
          boton1.setForeground(Color.WHITE);            
        }

      });

      boton2.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
          boton2.setBackground(Color.GREEN);
          boton2.setBorder(new LineBorder(Color.GREEN));
          boton2.setForeground(Color.DARK_GRAY);
        }

        @Override
        public void mouseExited(MouseEvent e) {
          boton2.setBackground(Color.DARK_GRAY);
          boton2.setBorder(new LineBorder(Color.DARK_GRAY));
          boton2.setForeground(Color.WHITE);            
        }

      });

      boton3.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
          boton3.setBackground(Color.GREEN);
          boton3.setBorder(new LineBorder(Color.GREEN));
          boton3.setForeground(Color.DARK_GRAY);
        }

        @Override
        public void mouseExited(MouseEvent e) {
          boton3.setBackground(Color.DARK_GRAY);
          boton3.setBorder(new LineBorder(Color.DARK_GRAY));
          boton3.setForeground(Color.WHITE);            
        }

    });

    botonLimpiar.addMouseListener(new MouseListener() {
      @Override
      public void mouseClicked(MouseEvent e) {
      }

      @Override
      public void mousePressed(MouseEvent e) {
      }

      @Override
      public void mouseReleased(MouseEvent e) {
      }

      @Override
      public void mouseEntered(MouseEvent e) {
        botonLimpiar.setBackground(Color.GREEN);
        botonLimpiar.setBorder(new LineBorder(Color.GREEN));
        botonLimpiar.setForeground(Color.DARK_GRAY);
      }

      @Override
      public void mouseExited(MouseEvent e) {
        botonLimpiar.setBackground(Color.DARK_GRAY);
        botonLimpiar.setBorder(new LineBorder(Color.DARK_GRAY));
        botonLimpiar.setForeground(Color.WHITE);            
      }

    });

  }

  public static void main(String[] args) {

    new Ejercicio2();

  }

}