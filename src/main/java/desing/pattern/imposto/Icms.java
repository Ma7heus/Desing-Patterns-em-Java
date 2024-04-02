package desing.pattern.imposto;

import java.math.BigDecimal;

import desing.pattern.orcamento.Orcamento;

public class Icms implements Imposto {

	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

}
