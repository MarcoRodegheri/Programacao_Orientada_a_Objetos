pacakage edu.rodegheri;

public class CiaAerea{
    private String codigo;
    private String nome;

    public CiaAerea(String codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public String getNome(){
        return this.nome;
    }

    public String toString(){
        return "\nCódigo: "+this.codigo+"\nNome: "+this.nome;
    }
}
