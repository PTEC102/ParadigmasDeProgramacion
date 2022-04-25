package claseunab.ejemplo3;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Formulario extends JFrame {

    JPanel contenedor;

    JButton botonSaludar;
    JLabel saludo;
    JTextField cajaNombre;    


    public Formulario() {
        initComponents();
        
        initPantalla();        
    }

    private void initPantalla(){

        setTitle("Ejemplo 3: Formulario");
        setBounds(300, 300, 500, 300);  
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
      }

    private void initComponents() {

        contenedor=new JPanel();
        
        this.getContentPane().add(this.contenedor);        
        this.contenedor.setLayout(null);
        

        botonSaludar =new JButton("Ingresa tu nombre para un saludo");
        contenedor.add(botonSaludar);
        botonSaludar.setBounds(10, 10, 400, 30);

        cajaNombre =new JTextField();
        contenedor.add(cajaNombre);
        cajaNombre.setBounds(10, 50, 400, 30);

        saludo =new JLabel();
        contenedor.add(saludo);
        saludo.setBounds(10, 100, 400, 30);

        ActionListener accion=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if( !cajaNombre.getText().isEmpty() ){
                    saludo.setText("Hola " + cajaNombre.getText() + "!");
                }else{
                    JOptionPane.showMessageDialog(null,"Hola sin nombre!");
                }
            }
        };

        botonSaludar.addActionListener(accion);

        pack();
    }

    // private void botonSaludarActionPerformed(java.awt.event.ActionEvent evt) {
    //     if( !cajaNombre.getText().isEmpty() ){
    //         saludo.setText("Hola " + cajaNombre.getText() + "!");
    //     }else{
    //         JOptionPane.showMessageDialog(null,"Hola sin nombre!");
    //     }

    // }

}