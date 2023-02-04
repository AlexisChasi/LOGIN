import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class divisas extends login{
    public JPanel convertidorDivisas;
    private JSlider slider1;
    private JComboBox Convertidor2;
    private JComboBox Convertidor1;
    private JLabel leyenda;
    private JLabel Cantidadlbl;
    private JLabel JlbCantidad;
    private JLabel JlbDe;
    private JLabel JlbA;
    private JLabel ResultadoJlb;


    //Valores por Default
    private int cantidad = 0;
    private double conversion = 0;
    private String de = "EUR", a = "EUR";
    public divisas() {
        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                cantidad = slider1.getValue();
                Cantidadlbl.setText(""+ cantidad);
                convertir();
            }

        });

        Convertidor2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                de = Convertidor2.getSelectedItem().toString();
                convertir();

            }
        });

        Convertidor1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                a = Convertidor1.getSelectedItem().toString();
                convertir();
            }
        });
    }

    public String aMoneda(double cantidad, String moneda){
        return "$" + Math.round(cantidad*100.0)/100.0 + " " + moneda;
    }

    public void convertir(){
        switch (de){
            case "EUR":
                if (a.equals("USD")) {
                    conversion = cantidad * 1.16;
                } else if (a.equals("MXN")) {
                    conversion = cantidad * 23.59;
                } else {
                    conversion = cantidad;
                }
                break;

            case "USD":
                if (a.equals("EUR")) {
                    conversion = cantidad * 0.96;
                } else if (a.equals("MXN")) {
                    conversion = cantidad * 20.34;
                } else {
                    conversion = cantidad;
                }
                break;

            case "MXN":
                if (a.equals("USD")) {
                    conversion = cantidad * 0.049;
                } else if (a.equals("EUR")) {
                    conversion = cantidad * 0.042;
                } else {
                    conversion = cantidad;
                }
                break;
        }

        ResultadoJlb.setText(aMoneda(cantidad, de) + " ---> " + aMoneda(conversion,a));
    }
}
