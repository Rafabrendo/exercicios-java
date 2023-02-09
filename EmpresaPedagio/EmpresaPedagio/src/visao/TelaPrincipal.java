package visao;

import javax.swing.*;
//import javax.swing.table.TableModel;

import java.awt.*;
import java.awt.event.ActionListener;//Posso pegar o nome do pacote e passar na instanciação
import java.awt.event.*;

public class TelaPrincipal extends JFrame {
    //onde eu vou "montar" a minha tela 
    /*Gerenciadores layout: Flow layout; Box Layout; Grid; Border Layout; GridBag*/
    //JPanel -> é como se fosse um painel que aceita componentes. 
    
    private static final long serialVersionUID = 1L;

    private final JButton btConsultar;
    private final JButton btRelatorio = new JButton("Relatório");
    private final JButton btConfiguracoes = new JButton("Configurações");
    private final JLabel lbRodape = new JLabel("Aula 03 de Java"); //É um texto que eu quero que apareça

    private final JButton btPraca = new JButton("Praças");
    private final JButton btTarifas = new JButton("Tarifas");
    private final JButton btCategorias = new JButton("Categorias");
    private final JButton btEncerrar = new JButton("Encerrar");

    private final JTextField tfValor = new JTextField();



    public TelaPrincipal() {
        btConsultar = new JButton("Consultar"); 
        //posso declarar e instanciar direto ou posso apenas declarar e instanciar no construtor

        setTitle("Sistema de gestão de Pedágios");
        setSize(400, 250);
        getContentPane().setLayout(new BorderLayout());
        //getContentPane -> serve para adicionar outros componentes

        final JPanel painelSuperior = new JPanel();
        painelSuperior.setLayout(new GridLayout(1, 3, 5, 5));
        painelSuperior.add(btConsultar);
        painelSuperior.add(btRelatorio);
        painelSuperior.add(btConfiguracoes);

        getContentPane().add(painelSuperior, BorderLayout.NORTH); //Para adicionar os botões ao norte

        getContentPane().add(lbRodape, BorderLayout.SOUTH);

        final JPanel painelDireita = new JPanel();
        painelDireita.setLayout(new GridLayout(4,1, 5, 5));
        painelDireita.add(btPraca);
        painelDireita.add(btTarifas);
        painelDireita.add(btCategorias);
        painelDireita.add(btEncerrar);

        getContentPane().add(painelDireita, BorderLayout.EAST);

        // tbDados.setModel(new javax.swing.table.DefaultTableModel(
        //     new Object[][]{
        //         {null, null, null},
        //         {null, null, null},
        //         {null, null, null},
        //         {null, null, null},
        //     },
        //     new String[]{"Código", "Nome", "Valores"}

        // ));

        getContentPane().add(tfValor, BorderLayout.CENTER);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Vai encerrar o programa assim que fechar a tela.

        // Dentro de um metodo eu passei uma função (pipeline). Ao invés de eu fazer uma nova classe. Passei 
        //a actionListener que é uma interface. Automatiza e facilita.
        btEncerrar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }

        });

        btPraca.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e){
                //TelaPracas tPracas = new TelaPracas();
                TelaPracas tPracas = TelaPracas.getInstancia();
                tPracas.setVisible(true);
            }

        });

        btTarifas.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    Integer numero = Integer.valueOf(tfValor.getText());//converte a String para Integer
                    //Integer dobro = numero * 2; //Não vou fazer isso porque não quero reutilizar esse valor
                    JOptionPane.showMessageDialog(null, "O dobro do valor é " + numero * 2);
                }
                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Apenas números são aceitos neste campo!");
                    tfValor.requestFocus();//Esse campo vai requisitar o foco da tela
                    tfValor.selectAll();//Seleciona tudo que tem dentro da tela 

                }
            }

        });



    }

}
