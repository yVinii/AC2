package Classes;
public class Produto {
    // Atributos
    private String produtos = "";
    private String tipo = "";
    private String descricao = "";
    private String marca = "";
    private float valor = 0;
    private float tamanho = 0;
    private String embalagem = "";
    //GET e SET

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    

    public void limpaProduto(){
    produtos =  "";
    tipo = "";
    descricao = "";
    marca = "";
    valor = 0;
    embalagem = "";
    tamanho = 0;
    }
}