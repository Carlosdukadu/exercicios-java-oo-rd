package exercicio03;

public class Perfumaria{
    private int  id;
    private String nomePerfumaria;
    private double precoDeVenda;
    private double desconto;
    private double precoPromocao;
    private int qtdLMPM;

//GET e Set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomePerfumaria() {
        return nomePerfumaria;
    }

    public void setNomePerfumaria(String nomePerfumaria) {
        this.nomePerfumaria = nomePerfumaria;
    }

    public double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getPrecoPromocao() {
        return precoPromocao;
    }

    public void setPrecoPromocao(double precoPromocao) {
        this.precoPromocao = precoPromocao;
    }

    public int getQtdLMPM() {
        return qtdLMPM;
    }

    public void setQtdLMPM(int qtdLMPM) {
        this.qtdLMPM = qtdLMPM;
    }
}

// TODO: implemente o código-fonte de Perfumaria.java
