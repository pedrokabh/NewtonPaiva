
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Menu extends JFrame{

    private JButton jBtnOptionOne = new JButton("APOSTA 1");
    private JButton jBtnOptionTwo = new JButton("APOSTA 2");

    private JButton jBtnOptionThree = new JButton("APOSTA 3");
    private JButton jBtnSair = new JButton("SAIR");
    // Atributos
    private JPanel painel = new JPanel();
    private JLabel jLabelMenuTitle = new JLabel("SELECIONE UMA APOSTA");
    private JLabel jLabelApostaUm = new JLabel("1) APOSTAR DE 0 A 100.");
    private JLabel jLabelApostaDois = new JLabel("2) APOSTAR DE A a Z.");
    private JLabel jLabelApostaTres = new JLabel("3) APOSTAR EM UM NUMERO IMPAR OU PAR");
    private JLabel jLabelSair = new JLabel("SAIR.");
    // Construtor
    public Menu(){
        this.setTitle("LOTO FACIL");
        this.setSize(300,450);
        configurarComponentes();
        this.setLocationRelativeTo(null); // Centralizar janela
        this.setVisible(true); // Exibir janela
    }

    private void configurarComponentes() {
        Loteria lotoFacil = new Loteria();
        jLabelMenuTitle.setFont(new Font("Arial", Font.BOLD, 12));
        jLabelApostaUm.setFont(new Font("Arial", Font.PLAIN, 10));
        jLabelApostaDois.setFont(new Font("Arial", Font.PLAIN, 10));
        jLabelApostaTres.setFont(new Font("Arial", Font.PLAIN, 10));
        jLabelSair.setFont(new Font("Arial", Font.PLAIN, 10));
        painel.add(jLabelMenuTitle);
        painel.add(jLabelApostaUm);
        painel.add(jBtnOptionOne);
        painel.add(jLabelApostaDois);
        painel.add(jBtnOptionTwo);
        painel.add(jLabelApostaTres);
        painel.add(jBtnOptionThree);
        painel.add(jLabelSair);
        painel.add(jBtnSair);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        painel.setBackground(new Color(255,255,255));
        this.getContentPane().add(painel);

        jBtnSair.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                closeProgram();

            }
        }); // Botão Sair

        jBtnOptionOne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                optionOne();
            }
        }); // Btn One

        jBtnOptionTwo.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                optionTwo();

            }
        }); // Btn Two

        jBtnOptionThree.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                optionThree();

            }
        }); // Btn Three
    }

    private void closeProgram() {
        System.exit(0);
    }

    private void optionOne() {
        // CHAMA JANELA DA OPÇÃO 1
        MenuAposta01 aposta01 = new MenuAposta01();
    }

    private void optionTwo() {
        // CHAMA JANELA DA OPÇÃO 2
        MenuAposta02 aposta02 = new MenuAposta02();
    }

    private void optionThree() {
        // CHAMA JANELA DA OPÇÃO 3
        MenuAposta03 aposta03 = new MenuAposta03();
    }


    public static void main(String[] args) {
        new Menu();
    }
}