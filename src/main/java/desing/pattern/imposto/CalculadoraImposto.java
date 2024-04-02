package desing.pattern.imposto;

import java.math.BigDecimal;

import desing.pattern.orcamento.Orcamento;

public class CalculadoraImposto {
	
	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}

}
