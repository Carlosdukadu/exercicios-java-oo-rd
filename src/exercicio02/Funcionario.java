package exercicio02;

public abstract class Funcionario {
    private int salarioMensal;
    private String nomeFuncionario;
    private int salarioAnual;

        //    Método salário anual
        public void calculoSalarioAnual(int salarioMensal) {

            this.salarioAnual = salarioMensal * 12;
            System.out.println("O salário anual do funcionário é de " + this.salarioAnual);
        }


    public Funcionario(int salarioMensal, String nomeFuncionario, int salarioAnual) {
        this.salarioMensal = salarioMensal;
        this.nomeFuncionario = nomeFuncionario;
        this.salarioAnual = salarioAnual;
    }

    public int getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(int salarioMensal) {
        this.salarioMensal = salarioMensal;
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
}





