import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;


public class login {
    private JLabel imagenEsfot;
    private JLabel cabecera;
    private JPanel ventana1;
    private JPanel foto;
    private JPanel ingresodatos;
    private JTextField txtUsuario;
    private JButton iniciarSesiónButton;
    private JLabel labelUsuario;
    private JLabel labelContraseña;
    private JPasswordField passwordField1;

    public login() {
        JFrame validacion = new JFrame("ventana-emergente");
        validacion.setSize(150, 150);
        validacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        validacion.setLayout(new BorderLayout());
        iniciarSesiónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuarioValido = "admin";
                String contraseñaValida = "admin";
                String usuario = txtUsuario.getText();
                char[] contraseña = passwordField1.getPassword();

                if (usuarioValido.equals(usuario) && contraseñaValida.equals(new String(contraseña))) {
                    JOptionPane.showMessageDialog(validacion, "Inicio de sesión exitoso");

                    JFrame misComponentes = new JFrame("ventanaComponentes");
                    misComponentes.setContentPane(new ventanaComponentes().componentes);
                    misComponentes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    misComponentes.pack();
                    misComponentes.setVisible(true);


                } else {
                    JOptionPane.showMessageDialog(validacion, "Usuario o contraseña incorrectos");
                }
            }
        });
    }
    public static void main(String[] args) {
        JFrame milogin = new JFrame("login");
        milogin.setContentPane(new login().ventana1);
        milogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        milogin.pack();
        //milogin.dispose();
        milogin.setVisible(true);
    }

}

