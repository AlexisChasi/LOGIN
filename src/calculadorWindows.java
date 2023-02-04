import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class calculadora {
    private JPanel panelPrincipal;
    private JButton menosButton;
    private JButton igualButton;
    private JButton decimalButton;
    private JButton a0Button;
    private JButton a9Button;
    private JButton a8Button;
    private JButton a7Button;
    private JButton divisionButton;
    private JButton multipButton;
    private JButton masButton;
    private JButton a6Button;
    private JButton a5Button;
    private JButton a3Button;
    private JButton a2Button;
    private JButton a1Button;
    private JButton a4Button;
    private JButton cButton;
    private JButton borrarButton;
    private JLabel salida;
    private JLabel salidaResultado;
    private boolean inicio = true, igual = true, operacion1, operacion2;

    private double valor1, valor2, resultado;
    private String tipoOperaciones;

    public calculadora(){
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(inicio == true) {
                    salidaResultado.setText("");
                    salidaResultado.setText("0");
                    inicio = false;
                } else {
                    salidaResultado.setText(salidaResultado.getText()+"0");
                }
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio == true) {
                    salidaResultado.setText("");
                    salidaResultado.setText("1");
                    inicio = false;
                } else {
                    salidaResultado.setText(salidaResultado.getText()+"1");
                }
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inicio == true) {
                    salidaResultado.setText("");
                    salidaResultado.setText("2");
                    inicio = false;
                } else {
                    salidaResultado.setText(salidaResultado.getText() + "2");
                }
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio == true) {
                    salidaResultado.setText("");
                    salidaResultado.setText("3");
                    inicio = false;
                } else {
                    salidaResultado.setText(salidaResultado.getText()+"3");
                }
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio == true) {
                    salidaResultado.setText("");
                    salidaResultado.setText("4");
                    inicio = false;
                } else {
                    salidaResultado.setText(salidaResultado.getText()+"4");
                }
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio == true) {
                    salidaResultado.setText("");
                    salidaResultado.setText("5");
                    inicio = false;
                } else {
                    salidaResultado.setText(salidaResultado.getText()+"5");
                }
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio == true) {
                    salidaResultado.setText("");
                    salidaResultado.setText("6");
                    inicio = false;
                } else {
                    salidaResultado.setText(salidaResultado.getText()+"6");
                }
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio == true) {
                    salidaResultado.setText("");
                    salidaResultado.setText("7");
                    inicio = false;
                } else {
                    salidaResultado.setText(salidaResultado.getText()+"7");
                }
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio == true) {
                    salidaResultado.setText("");
                    salidaResultado.setText("8");
                    inicio = false;
                } else {
                    salidaResultado.setText(salidaResultado.getText()+"8");
                }
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio == true) {
                    salidaResultado.setText("");
                    salidaResultado.setText("9");
                    inicio = false;
                } else {
                    salidaResultado.setText(salidaResultado.getText()+"9");
                }
            }
        });
        decimalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(salidaResultado.getText().contains(".")){
                }else{
                    salidaResultado.setText(salidaResultado.getText()+".");
                    inicio = false;
                }
            }
        });
        igualButton.addActionListener(new ActionListener() {//Boton igual
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio = true;
                operacion1 = true;
                if (igual = true) {
                    if (tipoOperaciones == null) {

                    }else{
                        valor2 = Double.parseDouble(salidaResultado.getText());
                        salida.setText(salida.getText()+salidaResultado.getText());
                        Operaciones(valor1,valor2);
                        igual = false;
                    }
                } else {
                    salida.setText("");
                    Operaciones(valor1,valor2);
                }
            }
        });
        multipButton.addActionListener(new ActionListener() {//Boton de multiplicacion
            @Override
            public void actionPerformed(ActionEvent e) {
                igual = true;
                inicio = true;
                // condicion para la variable operacion1
                if (operacion1 = true) {
                    valor1 = Double.parseDouble(salidaResultado.getText());
                    salida.setText("");
                    salida.setText(salidaResultado.getText()+" x ");
                    operacion1 = false;
                }else {
                    // condicion para la variable operacion2
                    if (operacion2 = true) {
                        valor2 = Double.parseDouble(salidaResultado.getText());
                        salida.setText("");
                        salida.setText(salidaResultado.getText()+" x ");
                        operacion2 = false;
                    }else {
                        salida.setText(salidaResultado.getText()+" x ");
                        Operaciones(resultado, valor2);
                    }
                }
                tipoOperaciones = "*";
            }
        });
        divisionButton.addActionListener(new ActionListener() {//Boton division
            @Override
            public void actionPerformed(ActionEvent e) {
                igual = true;
                inicio = true;
                // condicion para la variable operacion1
                if (operacion1 = true) {
                    valor1 = Double.parseDouble(salidaResultado.getText());
                    salida.setText("");
                    salida.setText(salidaResultado.getText()+" / ");
                    operacion1 = false;
                }else {
                    // condicion para la variable operacion2
                    if (operacion2 = true) {
                        valor2 = Double.parseDouble(salidaResultado.getText());
                        salida.setText("");
                        salida.setText(salidaResultado.getText()+" / ");
                        operacion2 = false;
                    }else {
                        salida.setText(salidaResultado.getText()+" / ");
                        Operaciones(resultado, valor2);
                    }
                }
                tipoOperaciones = "/";
            }
        });
        masButton.addActionListener(new ActionListener() {//Boton suma
            @Override
            public void actionPerformed(ActionEvent e) {
                igual = true;
                inicio = true;
                // condicion para la variable operacion1
                if (operacion1 = true) {
                    valor1 = Double.parseDouble(salidaResultado.getText());
                    salida.setText("");
                    salida.setText(salidaResultado.getText()+" + ");
                    operacion1 = false;
                }else {
                    // condicion para la variable operacion2
                    if (operacion2 = true) {
                        valor2 = Double.parseDouble(salidaResultado.getText());
                        salida.setText("");
                        salida.setText(salidaResultado.getText()+" + ");
                        operacion2 = false;
                    }else {
                        salida.setText(salidaResultado.getText()+" + ");
                        Operaciones(resultado, valor2);
                    }
                }
                tipoOperaciones = "+";
            }
        });
        menosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                igual = true;
                inicio = true;
                // condicion para la variable operacion1
                if (operacion1 = true) {
                    valor1 = Double.parseDouble(salidaResultado.getText());
                    salida.setText("");
                    salida.setText(salidaResultado.getText()+" - ");
                    operacion1 = false;
                }else {
                    // condicion para la variable operacion2
                    if (operacion2 = true) {
                        valor2 = Double.parseDouble(salidaResultado.getText());
                        salida.setText("");
                        salida.setText(salidaResultado.getText()+" - ");
                        operacion2 = false;
                    }else {
                        salida.setText(salidaResultado.getText()+" - ");
                        Operaciones(resultado, valor2);
                    }
                }
                tipoOperaciones = "-";
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (salidaResultado.getText().length() > 0) {
                    salidaResultado.setText(salidaResultado.getText().substring(0,salidaResultado.getText().length()-1));
                    if (salidaResultado.getText().length() == 0){
                        salidaResultado.setText("0");
                        inicio = true;
                    }
                }
            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salidaResultado.setText("0");
                salida.setText("0");
                inicio = true;
                operacion1 = true;
                operacion2 = true;
                igual = true;
                valor1 = 0;
                valor2 = 0;
                resultado = 0;
            }
        });
    }

    private void Operaciones(double valor1, double valor2){
        switch (tipoOperaciones){
            // Case con las funciones de sumar
            case "+":
                resultado = valor1 + valor2;
                salidaResultado.setText(resultado+"");
                valor1 = Double.parseDouble(salidaResultado.getText());
                break;
            // Case con las funciones de restar
            case "-":
                resultado = valor1 - valor2;
                salidaResultado.setText(resultado+"");
                valor1 = Double.parseDouble(salidaResultado.getText());
                break;
            // Case con las funciones de multiplicar
            case "*":
                resultado = valor1 * valor2;
                salidaResultado.setText(resultado+"");
                valor1 = Double.parseDouble(salidaResultado.getText());
                break;
            // Case con las funciones de dividir
            case "/":
                if (valor2 == 0){
                    salidaResultado.setText("No se puede divir entre 0");
                    break;

                } else {
                    resultado = valor1 / valor2;
                    salidaResultado.setText(resultado + "");
                    valor1 = Double.parseDouble(salidaResultado.getText());
                    break;

                }
        }
    }
    public static void main(String[] args) {
        JFrame frame =new JFrame("calculadora");

        frame.setContentPane(new calculadora().panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.pack();
        frame.setVisible(true);

    }
}
