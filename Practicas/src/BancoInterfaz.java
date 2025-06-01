import javax.swing.*;
import java.awt.*;

public class BancoInterfaz {
    private  Cuenta cuenta;
    private JLabel balanceLabel;

    public BancoInterfaz() {
        cuenta = new Cuenta(0);

        JFrame frame = new JFrame("Programa Bancario");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(5, 1));

        balanceLabel = new JLabel("Balance actual: $" + cuenta.getBalance(), SwingConstants.CENTER);
        frame.add(balanceLabel);

        JButton balanceButton = new JButton("Mostrar Balance");
        balanceButton.addActionListener(e -> mostrarBalance());
        frame.add(balanceButton);

        JButton depositButton = new JButton("Depositar");
        depositButton.addActionListener(e -> depositar());
        frame.add(depositButton);

        JButton withdrawButton = new JButton("Retirar");
        withdrawButton.addActionListener(e -> retirar());
        frame.add(withdrawButton);

        JButton exitButton = new JButton("Salir");
        exitButton.addActionListener(e -> System.exit(0));
        frame.add(exitButton);

        frame.setVisible(true);
    }

    private void mostrarBalance() {
        balanceLabel.setText("Balance actual: $" + cuenta.getBalance());
    }

    private void depositar() {
        String input = JOptionPane.showInputDialog("Ingrese la cantidad a depositar:");
        try {
            double cantidad = Double.parseDouble(input);
            cuenta.depositar(cantidad);
            mostrarBalance();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Cantidad inválida");
        }
    }

    private void retirar() {
        String input = JOptionPane.showInputDialog("Ingrese la cantidad a retirar:");
        try {
            double cantidad = Double.parseDouble(input);
            if (cantidad > cuenta.getBalance()) {
                JOptionPane.showMessageDialog(null, "No tienes suficiente balance");
            } else {
                cuenta.retirar(cantidad);
                mostrarBalance();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Cantidad inválida");
        }
    }

    public static void main(String[] args) {
        new BancoInterfaz();

    }
}
