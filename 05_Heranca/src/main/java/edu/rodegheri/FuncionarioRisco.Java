package edu.rodegheri;

public class FuncionarioRisco extends Funcionario {

    public enum CategoriaRisco { QUIMICO, ELETRO, NUCLEAR }

    private CategoriaRisco catRisco;

    
    public FuncionarioRisco(String matricula, 
                            String nome, 
                            double salarioBruto,
                            CategoriaRisco cat){
        super(matricula, nome, salarioBruto);
        this.catRisco = cat;    
    }

    @Override
    public double getSalarioLiquido() {
        double liquido = super.getSalarioLiquido();
        
        return liquido + liquido*0.25;
    } 

    @Override
    public String toString() {
        String res = super.toString();
        res = res + "\n Funcionario com 25% de bonus. Risco: " + catRisco;
        res = res + "\n- - - - - - - - - - -\n";
        return res;
    }
}