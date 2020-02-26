package exercicio02;

public class AuxiliarEscritorio {

        private String nomeFuncionario;
        private int salarioAnual;
        private double bonus;



    //    Método salário anual
        public void calculoSalarioAnual(int salarioMensal) {

            this.salarioAnual = salarioMensal * 12;
            this.bonus = (this.salarioAnual * 1.20) - this.salarioAnual;

            System.out.println("O salário anual do funcionario é de " + this.salarioAnual + "e o bonus anual é de " + this.bonus);
        }

    // TODO: implemente o código desta classe


    public AuxiliarEscritorio(String nomeFuncionario, int salarioAnual, double bonus) {
        this.nomeFuncionario = nomeFuncionario;
        this.salarioAnual = salarioAnual;
        this.bonus = bonus;
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

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}



