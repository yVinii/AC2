package Classes;
public class Tratamento {
    private String tipo = "";
    private String especial = "";
    private String especie = "";
    private String sexo = "";
    private String nome = "";
    private float custo = 0;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEspecial() {
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }
    public void LimparTratamento(){
        tipo = "";
        especial = "";
        especie = "";
        sexo = "";
        nome = "";
        custo = 0;
    }
}
