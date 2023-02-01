package persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import modelo.Tarifa;

public class Repositorio {
    
    public void grava(List concessionarias) throws IOException{
        FileOutputStream saidaArquivo = new FileOutputStream("pedagio.dat");//fluxo de saida para arquivos
        ObjectOutputStream objetoSaida = new ObjectOutputStream(saidaArquivo);//

        objetoSaida.writeObject(concessionarias);//metodo para fazer a "gravação"
    }

    public boolean gravar(Tarifa t){ //Sobrecarga de metodos
        return true;
    }

    public List ler() throws IOException, ClassNotFoundException{
        FileInputStream entradaArquivo = new FileInputStream("pedagio.dat");
        ObjectInputStream objetoEntrada = new ObjectInputStream(entradaArquivo);
        Object concessionarias = objetoEntrada.readObject();
        return (List) concessionarias;
    }

}
