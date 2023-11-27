import javax.swing.*;

import org.example.MotocicletaDRA;
import org.example.StructData;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Main {
    private JPanel Windows;
    private JTabbedPane tabbedPane1;
    private JList lstLista;
    private JButton btnPagar;
    private JTextArea txtNuevaLista;
    private JButton btnListarCopia;

    public StructData motosSystem = new StructData();

    public Main() {
        tabbedPane1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                llenarJList();
            }
        });
        btnPagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int valor = motosSystem.valorPagar();
                JOptionPane.showMessageDialog(null, "El valor a pagar es: " + valor);
                llenarJList();
            }
        });
        btnListarCopia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (MotocicletaDRA moto: motosSystem.listarcopia()) {
                    txtNuevaLista.append(moto.toString() + "\n");
                }
            }
        });
    }

    private void llenarJList(){
        DefaultListModel modelo = new DefaultListModel<>();
        for (MotocicletaDRA moto: motosSystem.listar()) {
            modelo.addElement(moto);
        }
        lstLista.setModel(modelo);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        frame.setContentPane(new Main().Windows);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
