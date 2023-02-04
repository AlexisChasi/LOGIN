import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class binario extends login{


    private JLabel txtDecimal;
    public JPanel convertidorBinario;
    private JToggleButton uno;
    private JToggleButton dos;
    private JToggleButton tres;
    private JToggleButton cuatro;
    private JToggleButton cinco;
    private JToggleButton seis;
    private JToggleButton siete;
    private JToggleButton ocho;
    private JToggleButton nueve;
    private JToggleButton diez;
    private JToggleButton once;
    private JLabel decimal;
    private JPanel paneldecimal;
    int binario[]=new int[11];
public binario() {
    uno.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            binario[0]=uno.isSelected()?1:0;
            uno.setText(""+binario[0]);
            calcularDecimal();
        }
    });
    dos.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            binario[1]=dos.isSelected()?1:0;
            dos.setText(""+binario[1]);
            calcularDecimal();
        }
    });
    tres.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            binario[2]=tres.isSelected()?1:0;
            tres.setText(""+binario[2]);
            calcularDecimal();
        }
    });
    cuatro.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            binario[3]=cuatro.isSelected()?1:0;
            cuatro.setText(""+binario[3]);
            calcularDecimal();
        }
    });
    cinco.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            binario[4]=cinco.isSelected()?1:0;
            cinco.setText(""+binario[4]);
            calcularDecimal();
        }
    });
    seis.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            binario[5]=seis.isSelected()?1:0;
            seis.setText(""+binario[5]);
            calcularDecimal();
        }
    });
    siete.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            binario[6]=siete.isSelected()?1:0;
            siete.setText(""+binario[6]);
            calcularDecimal();
        }
    });
    ocho.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            binario[7]=ocho.isSelected()?1:0;
            ocho.setText(""+binario[7]);
            calcularDecimal();
        }
    });
    nueve.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            binario[8]=nueve.isSelected()?1:0;
            nueve.setText(""+binario[8]);
            calcularDecimal();
        }
    });
    diez.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            binario[9]=diez.isSelected()?1:0;
            diez.setText(""+binario[9]);
            calcularDecimal();
        }
    });
    once.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            binario[10]=once.isSelected()?1:0;
            once.setText(""+binario[10]);
            calcularDecimal();
        }
    });

}
public void calcularDecimal(){
int decimal=0;
for (int i = 0 ; i<binario.length;i++){
    decimal+=binario[i]*Math.pow(2,i);
}
txtDecimal.setText(""+decimal);
}
}
