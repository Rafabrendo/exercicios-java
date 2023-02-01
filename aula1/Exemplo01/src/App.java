import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        /*JOptionPane opcao = new JOptionPane();
        //opcao.showMessageDialog(null, "Bem vindo a nossa aula");
        //vai aparecer uma caixa 
        String nome = opcao.showInputDialog(null, "Informe o seu nome");
        //O que eu digitar dentro da caixa de texto vai ser guardado na variavel "nome"
        //parentComponent -> em cima de qual elemento eu quero q essa janela apareça. Obs.:como não tenho nenhum, coloco null.
        opcao.showMessageDialog(null, "Seja bem-vindo "+nome+"!");
        */

        Produto produto01 = new Produto();
        //produto01.codigo = 1;
        produto01.setCodigo(1);
        //produto01.descricao = "Fone de ouvido";
        produto01.setDescricao("Fonde de ouvido");
        //produto01.precoVenda = 80.00;
        produto01.setPrecoVenda(80.00);
        produto01.precoCusto = 40.00;
        produto01.saldoEstoque = 5.0;

        Produto produto02 = new Produto();
        //produto02.codigo = 5;
        produto02.setCodigo(5);
        produto02.descricao = "Macbook";
        produto02.precoVenda = 4000.00;
        produto02.precoCusto = 2500.00;
        produto02.saldoEstoque = 1.0;
        //Desse jeito, pela lei do encaspulamento, está errado . Isso porque eles só podem ser manipulados pela classe, de acordo com o encapsulamento
        //Assim que eu passei como private, deu erro aqui. 
        //tenho que fazer um construtor e passar todos ou metodos get/set.

        JOptionPane.showMessageDialog(null, "O produto é "+ produto01.getDescricao() + " - Saldo: "+ produto01.getSaldoEstoque());
        JOptionPane.showMessageDialog(null, "O produto é "+ produto02.getDescricao() + " - Saldo: "+ produto02.getSaldoEstoque());

        produto01.vender(1.0); // Encapsulamento -> "Esconder" o código 

        //produto01.saldoEstoque = produto01.saldoEstoque - 1.0; //ERRADO no ponto de vista poo. Essa linha faz a mesma coisa que a de cima, o que muda é que a de cima tá "menos visivel"

        JOptionPane.showMessageDialog(null, "O produto é "+ produto01.getDescricao()+ " - Saldo: "+ produto01.getSaldoEstoque());

        produto02.alterarPrecoCusto(3800.00);


        JOptionPane.showMessageDialog(null, "O produto é "+ produto01.getDescricao() + " - Saldo: "+ produto01.getSaldoEstoque() + " - preço -" + produto01.getPrecoVenda());

        JOptionPane.showMessageDialog(null, "O produto é "+ produto01.getDescricao() + " - Saldo: "+ produto02.getSaldoEstoque()+ " - preço -" + produto02.getPrecoVenda());

       


    
    }
}
