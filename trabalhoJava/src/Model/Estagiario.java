
package Model;

public final class Estagiario extends Funcionario{
    private int bolsa;
    private int horas_servico;

    public Estagiario(int bolsa, int horas_servico, int registro, double salario, String nome, int idade, String rua, String bairro, String sexo, int altura, String telefone) {
        super(registro, salario, nome, idade, rua, bairro, sexo, altura, telefone);
        this.bolsa = bolsa;
        this.horas_servico = horas_servico;
    }

 

  

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    public int getHoras_servico() {
        return horas_servico;
    }

    public void setHoras_servico(int horas_servico) {
        this.horas_servico = horas_servico;
    }
    
    
    
}
