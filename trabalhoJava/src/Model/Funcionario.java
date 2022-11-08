package Model;

public class Funcionario extends Pessoa{
    
    private int registro;
    private double salario;

    public Funcionario(int registro, double salario, String nome, int idade, String rua, String bairro, String sexo, int altura, String telefone) {
        super(nome, idade, rua, bairro, sexo, altura, telefone);
        this.registro = registro;
        this.salario = salario;
    }
 
    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
