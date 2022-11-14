package Classes;
public class Produto {
    // Atributos
    private String produto = "";
    private Integer tamanho = 0;
    private String descricao = "";
    private String fornecedor = "";
    private float custo = 0;
    private float venda = 0;
    private float icms = 0;
    //GET e SET
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descrição) {
        this.descricao = descrição;
    }

    public String getFornecedor() {
        return fornecedor ;
    }

    public void setFornecedor(String fornecedor ) {
        this.fornecedor  = fornecedor ;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }
     public float getVenda() {
        return venda;
    }

    public void setVenda(float venda) {
        this.venda = venda;
    }
     public float getICMS() {
        return icms;
    }

    public void setICMS(float icms) {
        this.icms = icms;
    }

    public void limpaProduto(){
    produto =  "";
    tamanho = 0;
    descricao = "";
    fornecedor = "";
    custo = 0;
    venda = 0;
    icms = 0;
    }
}