package Classes;
public class Funcionario {
    // Atributos:
    private String nome = "";
    private String cpf = "";
    private String senha = "";
    
    // Métodos: 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void limpaFuncionario(){
    nome =  "";
    senha = "";
    cpf = "";
    }
}
