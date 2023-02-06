package visao;

import javax.swing.*;

import acoes.AcaoBotaoEncerrar;

import java.awt.*;

public class TelaPrincipal extends JFrame {
    //onde eu vou "montar" a minha tela 
    /*Gerenciadores layout: Flow layout; Box Layout; Grid; Border Layout; GridBag*/
    //JPanel -> é como se fosse um painel que acieta componentes. 
    
    private static final long serialVersionUID = 1L;

    private JButton btConsultar;
    private JButton btRelatorio = new JButton("Relatório");
    private JButton btConfiguracoes = new JButton("Configurações");
    private JLabel lbRodape = new JLabel("Aula 03 de Java"); //É um texto que eu quero que apareça

    private JButton btPraca = new JButton("Praças");
    private JButton btTarifas = new JButton("Tarifas");
    private JButton btCategorias = new JButton("Categorias");
    private JButton btEncerrar = new JButton("Encerrar");



    public TelaPrincipal(){
        JButton btConsultar = new JButton("Consultar"); 
        //posso declarar e instanciar direto ou posso apenas declarar e instanciar no construtor

        setTitle("Sistema de gestão de Pedágios");
        setSize(400, 250);
        getContentPane().setLayout(new BorderLayout());
        //getContentPane -> serve para adicionar outros componentes

        JPanel painelSuperior = new JPanel();
        painelSuperior.setLayout(new GridLayout(1, 3, 5, 5));
        painelSuperior.add(btConsultar);
        painelSuperior.add(btRelatorio);
        painelSuperior.add(btConfiguracoes);

        getContentPane().add(painelSuperior, BorderLayout.NORTH); //Para adicionar os botões ao norte

        getContentPane().add(lbRodape, BorderLayout.SOUTH);

        JPanel painelDireita = new JPanel();
        painelDireita.setLayout(new GridLayout(4,1, 5, 5));
        painelDireita.add(btPraca);
        painelDireita.add(btTarifas);
        painelDireita.add(btCategorias);
        painelDireita.add(btEncerrar);

        getContentPane().add(painelDireita, BorderLayout.EAST);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Vai encerrar o programa assim que fechar a tela.

        btEncerrar.addActionListener(new AcaoBotaoEncerrar());



    }

}
