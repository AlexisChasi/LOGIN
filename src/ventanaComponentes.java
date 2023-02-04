import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanaComponentes extends login{
    public JPanel componentes;
    private JLabel titulo;
    private JButton calculadoraButton;
    private JButton conversorDivisasButton;
    private JButton binarioDecimalButton;
    private JButton button4;
    private JButton button5;
    private JPanel comp;
    private JLabel c1;
    private JLabel c2;
    private JLabel c3;
    private JLabel c4;
    private JLabel c5;


    public ventanaComponentes() {
    calculadoraButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame miCalculadora = new JFrame("interfaz");
            miCalculadora.setContentPane(new interfaz().Plantilla);
            //miCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            miCalculadora.pack();
            miCalculadora.setVisible(true);
        }
    });
    conversorDivisasButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame calcDivisas = new JFrame("divisas");
            calcDivisas.setContentPane(new divisas().convertidorDivisas);
           // calcDivisas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            calcDivisas.pack();
            calcDivisas.setVisible(true);

        }
    });
        binarioDecimalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame binariodecimal = new JFrame("binario");
                binariodecimal.setContentPane(new binario().convertidorBinario);
                //binariodecimal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); para que no se cierretodo al poner X

                binariodecimal.pack();
                binariodecimal.setVisible(true);
            }
        });
    }
}
