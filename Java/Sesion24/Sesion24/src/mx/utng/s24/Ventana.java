package mx.utng.s24;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Declaramos una clase que servira de ventana
public class Ventana extends JFrame{
    private JTextField txtUsuario;
    private JPasswordField txtClave;

    public Ventana(){
        //Invocando al constructor de la superclase
        super("Autenticacion de usuario");
        //Dimensiones de la ventana
        setSize(300, 200);
        //Cuando de click en el boton x se cierre
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Coloco contenedor de componentes GUI
        JPanel panel = new JPanel(new GridBagLayout());
        //Coloco restricciones para la rejilla.
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        //Etiquetas para los campos
        JLabel lblUsuario = new JLabel("Usuario:");
        JLabel lblClave = new JLabel("Clave:");

        //Inicio las cajas de texto
        txtUsuario = new JTextField(15);
        txtClave = new JPasswordField(15);

        //Boton de login
        JButton btnLogin = new JButton("Login");
        //La accion del botón
        btnLogin.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String usuario = txtUsuario.getText();
                    char [] charsClave = txtClave.getPassword();
                    String clave = new String(charsClave);

                    if(validarLogin(usuario, clave)){
                        JOptionPane.showMessageDialog(Ventana.this, "Login Correcto");
                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "Usuario o clave incorrectos");
                    }

                }
            }
        );


        //Colocando en la celda (0,0) la etiqueta
        gbc.gridx=0;
        gbc.gridy=0;
        panel.add(lblUsuario, gbc);
        
        //Colocando em la celda (0,1) la caja de texto
        gbc.gridx=1;
        gbc.gridy=0;
        panel.add(txtUsuario, gbc);

        //
        gbc.gridx=0;
        gbc.gridy=1;
        panel.add(lblClave, gbc);

        //Coloca 
        gbc.gridx=1;
        gbc.gridy=1;
        panel.add(txtClave, gbc);

        //Colocando el boton en la celda (0,2) el boton
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(btnLogin, gbc);

        this.add(panel);

        //Ventana centrada
        setLocationRelativeTo(null);



        //Hacer visible la vemtana por defecto esta en false
        setVisible(true);

    }

    public static void main(String[] args) {
        new Ventana();
    }
    
    private boolean validarLogin(String usuario, String clave){
        return usuario.equals("utng") && clave.equals("1234");
    }

}
