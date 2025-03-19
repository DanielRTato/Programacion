import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcoAplicacion extends JFrame {
    private JTextField cadroTexto;

    public EcoAplicacion(){
        super();
        setTitle("Primera aplicacion Swing"); // Titulo de la ventana

        JComponent botoneria = creaBotones(); // Crea la botoneria
        JComponent panelCadtroTexto = creaPanelCadro();
        cadroTexto =(JTextField) panelCadtroTexto;

        JSplitPane panelPrincipal = new JSplitPane(JSplitPane.VERTICAL_SPLIT, botoneria, panelCadtroTexto); // Crea un panel dividido
        getContentPane().add(panelPrincipal); // Añade el panel dividido a la ventana
        pack(); // Ajusta el tamaño de la ventana
        setVisible(true); // Hace visible la ventana por defecto es invisible
    }

    private JComponent creaBotones(){
        JPanel botoneria = new JPanel(); // Crea un panel
        JButton btnHola = new JButton("Di Hola"); // Crea un boton

        btnHola.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        cadroTexto.setText("Hola Mundo");
                    }
                }
        );

        botoneria.add(btnHola); // Añade el boton al panel

        return botoneria;
    }

    private JComponent creaPanelCadro(){
        // no uso un JPanel porque no necesito añadir más componentes
        JTextField txtCadro = new JTextField(); // Crea un cuadro de texto

        return txtCadro;
    }


}

