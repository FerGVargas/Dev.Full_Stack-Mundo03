/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastroclient;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 *
 * @author Fernanda
 */
public class CadastroClient extends Thread {

    private final JTextArea textArea;
    private final JFrame frame;

    public CadastroClientbjectInputStream in) {
        this.in = in;
        frame = new JFrame("Mensagens do Servidor");
        textArea = new JTextArea(20, 50);
        textArea.setEditable(false);
        frame.add(new JScrollPane(textArea));
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    @Override
    public void run() {
        try {
            while (true) {
                Object data = in.readObject();
                String mensagem = (String) data;
                SwingUtilities.invokeLater(() -> {
                    textArea.append(mensagem + "\n");
                    textArea.setCaretPosition(textArea.getDocument().getLength()); // Rolagem automática
                });
            }
        } catch (Exception e) {
            // Lidar com exceções, se necessário
        }
    }
}
