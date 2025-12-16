package padroescomportamentais.interpreter;

public class Empresa {

    public static String formula = "salarioBase + bonus * 1.5";

    public static double calcularRemuneracao(double salarioBase, double bonus) {
        String expressao;
        expressao = formula.replace("salarioBase", Double.toString(salarioBase));
        expressao = expressao.replace("bonus", Double.toString(bonus));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}