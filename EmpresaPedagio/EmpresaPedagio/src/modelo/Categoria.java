package modelo;

import java.io.Serializable;

public class Categoria implements Serializable{
    
    private String descricao;

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    

}
