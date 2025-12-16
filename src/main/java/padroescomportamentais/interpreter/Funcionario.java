package padroescomportamentais.interpreter;

public class Funcionario {
    private double salarioBase;
    private double bonus;

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calcularRemuneracaoTotal() {
        return Empresa.calcularRemuneracao(this.salarioBase, this.bonus);
    }
}