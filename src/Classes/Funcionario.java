package Classes;
public class Funcionario {
    // Atributos:
    private String nome = "";
    private String cpf = "";
    private String email = "";
    private String profissao = "";
    // Métodos: 

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
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

    
    public void limpaFuncionario(){
    nome =  "";
    cpf = "";
    email = "";
    profissao = "";
    }
}
