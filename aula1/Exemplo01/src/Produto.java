public class Produto {

    private Integer codigo;
    private String descricao;
    private Double precoVenda;
    private Double precoCusto;
    private Double saldoEstoque;

    public Double getPrecoVenda() {
        return this.precoVenda;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }

   

    public Double getPrecoCusto() {
        return this.precoCusto;
    }

    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public Double getSaldoEstoque() {
        return this.saldoEstoque;
    }

    public void setSaldoEstoque(Double saldoEstoque) {
        this.saldoEstoque = saldoEstoque;
    }

    
    void setCodigo(Integer codigo){
        this.codigo = codigo;
    }

    Integer getCodigo(){
        return codigo;
    }

    String getDescricao(){ //Não preciso colocar this, nesse caso porque está chamando direto o atributo
        return descricao;
    }

    void setDescricao(String descricao){
        this.descricao = descricao;
    }

    



    public void vender(double quantidadeVendida){ //não retorna nenhuma informação
        saldoEstoque = saldoEstoque - quantidadeVendida;
    }

    public void alterarPrecoCusto(double novoPrecoCusto){
        precoCusto = novoPrecoCusto;
        precoVenda = precoCusto * 1.50;
    }


}
