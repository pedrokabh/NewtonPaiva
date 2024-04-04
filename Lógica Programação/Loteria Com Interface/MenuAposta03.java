import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class MenuAposta03 extends JFrame{

    // Atributos da Classe.
    private JPanel painel = new JPanel();
    private JLabel jLabelTitle = new JLabel("APOSTAR UM NUMERO IMPAR OU PAR PARA APOSTAR");
    private JLabel jLabelLegend = new JLabel("DIGITE SUA APOSTA ABAIXO");
    private JTextField jTextFieldValue = new JTextField("",20);
    private JButton jButtonBet = new JButton("FAZER APOSTA");
    private JButton jButtonMenu = new JButton("MENU");

    // Metodos
    public MenuAposta03(){
        this.setTitle("APOSTA 03");
        this.setSize(400, 400);
        ConfigurarComponentes();
        this.setVisible(true);
    }
    public void ReturnMenu(){
        this.dispose();;
    }
    private void ConfigurarComponentes(){
        jLabelTitle.setFont(new Font("Arial", Font.BOLD, 12));
        painel.add(jLabelTitle);
        painel.add(jLabelLegend);
        painel.add(jTextFieldValue);
        painel.add(jButtonBet);
        painel.add(jButtonMenu);

        jButtonBet.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 String value = jTextFieldValue.getText();

                 try{
                     Integer number = Integer.parseInt(value);
                     Loteria lotoFacil = new Loteria();
                     String returnMessage = lotoFacil.Opcao3(number);
                     JOptionPane.showMessageDialog(null, returnMessage, "RESULT", JOptionPane.WARNING_MESSAGE);
                 } catch (NumberFormatException err) {
                     JOptionPane.showMessageDialog(null, "INSIRA UM VALOR INTEIRO", "ERRO", JOptionPane.ERROR_MESSAGE);
                 }

                 jTextFieldValue.setText("");
             }
         }
        );

        jButtonMenu.addActionListener(new ActionListener() {
                                          public void actionPerformed(ActionEvent e) {
                                              ReturnMenu();
                                          }
                                      }
        );

        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 80, 50));
        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[]args){
        new MenuAposta03();
    }
}