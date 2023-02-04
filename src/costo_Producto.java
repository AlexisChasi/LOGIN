import com.sun.scenario.animation.shared.FiniteClipEnvelope;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class costo_Producto extends login {
    public JPanel costoProducto;
    private JLabel LogoLbl;
    private JScrollPane ScrollImagen;
    private JLabel ImagenProducto;
    private JComboBox ProductoComb;
    private JRadioButton a6MesesRadioButton;
    private JRadioButton a12MesesRadioButton;
    private JRadioButton a18MesesRadioButton;
    private JSpinner CantidadSpn;
    private JCheckBox a5DeDescuentoCheckBox;
    private JLabel PrecioContado;
    private JLabel PrecioCredito;
    private JLabel Descuento;
    private JLabel Seguro_Vida;
    private JLabel Garantia;
    private JLabel Costo_Total;
    private JLabel Abono;
    private JLabel lblPrecio;
    private JCheckBox aSeguro;
    private JCheckBox aGarantia;
    private JButton buttonOK;

    int precios[] = {
            350,
            1500,
            650,
            800,
            1500
    };

    String imgs[] = {
            "Imágenes/celular.png",
            "Imágenes/comedor.png",
            "Imágenes/laptop.png",
            "Imágenes/tele.png",
            "Imágenes/sala.png",
    };

    int cantidad = 1, index = 0, plazo = 6;
    double precio = 0, aumento = 0;


    double contado = 0 ,
            credito = 0,
            descuento = 0,
            seguro = 0,
            garantia = 0,
            total = 0,
            abono = 0;
    public costo_Producto() {
        calcularCredito();
        ProductoComb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                index = ProductoComb.getSelectedIndex();
                calcularCredito();
            }
        });

        CantidadSpn.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                cantidad = Integer.parseInt(CantidadSpn.getValue().toString());
                calcularCredito();
            }
        });

        a6MesesRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aumento = a6MesesRadioButton.isSelected() ? 1.07:1.0;
                plazo = 6;
                calcularCredito();
            }
        });

        a12MesesRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aumento = a12MesesRadioButton.isSelected() ? 1.1:1.0;
                plazo = 12;
                calcularCredito();
            }
        });

        a18MesesRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aumento = a18MesesRadioButton.isSelected() ? 1.125:1.0;
                plazo = 18;
                calcularCredito();
            }
        });

        a5DeDescuentoCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                descuento = a5DeDescuentoCheckBox.isSelected() ? 0.05 : 0;
                calcularCredito();
            }
        });

        aSeguro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    seguro = aSeguro.isSelected() ? 100 : 0;
                    calcularCredito();
            }
        });

        aGarantia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                garantia = aGarantia.isSelected() ? 0.03 : 0;
                calcularCredito();

            }
        });
    }

    public String aMoneda(double precio){
        return "$ " + Math.round(precio * 100) / 100 + " USD";
    }
    public void calcularCredito(){
        precio = precios[index];
        lblPrecio.setText(aMoneda(precio * cantidad));
        Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource(imgs[index]));
        ImagenProducto.setIcon(new ImageIcon(img));

        contado = precio * cantidad;
        credito = contado * aumento;

        total = credito - (credito * descuento) + seguro + (credito * garantia);

        PrecioContado.setText(aMoneda(contado));
        PrecioCredito.setText(aMoneda(credito));

        Descuento.setText(aMoneda(credito * descuento));
        Seguro_Vida.setText(aMoneda(seguro));
        Garantia.setText(aMoneda(credito * garantia));
        Costo_Total.setText(aMoneda(total));
        Abono.setText(aMoneda(total / plazo));
    }
}
