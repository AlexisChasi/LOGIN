import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanaComponentes extends login{
    public JPanel componentes;
    private JLabel titulo;
    private JButton calculadoraButton;
    private JButton conversorDivisasButton;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JPanel comp;
    private JLabel c1;
    private JLabel c2;
    private JLabel c3;
    private JLabel c4;
    private JLabel c5;
    private JLabel c6;
    private JLabel c7;
    private JLabel c8;
    private JLabel c9;
    private JLabel c10;


public ventanaComponentes() {
    calculadoraButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame miCalculadora = new JFrame("interfaz");
            //miCalculadora.setContentPane(new interfaz().Plantilla);
            miCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            miCalculadora.pack();
            miCalculadora.setVisible(true);
        }
    });
    conversorDivisasButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame calcDivisas = new JFrame("divisas");
            calcDivisas.setContentPane(new divisas().convertidorDivisas);
            calcDivisas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            calcDivisas.pack();
            calcDivisas.setVisible(true);

        }
    });
}
}
