package Model;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String rua;
    private String bairro;    
    private String sexo;
    private int altura;
    private String telefone;

    public Pessoa(String nome, int idade, String rua, String bairro, String sexo, int altura, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.rua = rua;
        this.bairro = bairro;
        this.sexo = sexo;
        this.altura = altura;
        this.telefone = telefone;
    }

   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    
}
