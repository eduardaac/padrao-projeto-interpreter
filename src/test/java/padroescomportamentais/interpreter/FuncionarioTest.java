package padroescomportamentais.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveCalcularRemuneracaoTotalComFormula() {
        Funcionario funcionario = new Funcionario();

        funcionario.setSalarioBase(2000.0);
        funcionario.setBonus(1000.0);

        // Fórmula definida na Empresa: "salarioBase + bonus * 1.5"
        // Lógica do Interpretador (linear):
        // 1. salarioBase + bonus = 2000 + 1000 = 3000
        // 2. Resultado anterior * 1.5 = 3000 * 1.5 = 4500

        assertEquals(4500.0, funcionario.calcularRemuneracaoTotal());
    }
}