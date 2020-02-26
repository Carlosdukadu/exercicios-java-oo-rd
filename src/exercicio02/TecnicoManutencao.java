package exercicio02;

public class TecnicoManutencao {

    private String nomeFuncionario;
    private int salarioAnual;
    private double mensal;
    private double bonus;
    private double insalubridade;


    public void salarioMensalSalubridade(int mensal){
        this.insalubridade = mensal * 1.40;
        System.out.println("O salário mensal do funcionario com a salubridade é de " + this.insalubridade);
    }


    //    Método salário anual
    public void calculoSalarioAnual(int salarioMensal) {


        this.salarioAnual = salarioMensal * 12;
        this.bonus = (this.salarioAnual * 1.20) - this.salarioAnual;

        System.out.println("O salário anual do funcionario é de " + this.salarioAnual + "e o bonus é de " + this.bonus);
    }



    // TODO: implemente o código desta classe


    public TecnicoManutencao(String nomeFuncionario, int salarioAnual, double mensal, double bonus, double insalulbridade) {
        this.nomeFuncionario = nomeFuncionario;
        this.salarioAnual = salarioAnual;
        this.mensal = mensal;
        this.bonus = bonus;
        this.insalubridade = insalulbridade;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public int getSalarioAnual() {
        return salarioAnual;
    }

    public void setSalarioAnual(int salarioAnual) {
        this.salarioAnual = salarioAnual;
    }

    public double getMensal() {
        return mensal;
    }

    public void setMensal(double mensal) {
        this.mensal = mensal;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getInsalulbridade() {
        return insalubridade;
    }

    public void setInsalulbridade(double insalulbridade) {
        this.insalubridade = insalulbridade;
    }
}
