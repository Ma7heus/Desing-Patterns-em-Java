package desing.pattern.imposto;

import java.math.BigDecimal;

import desing.pattern.orcamento.Orcamento;

public interface Imposto {
	
	public BigDecimal calcular(Orcamento orcamento);

}
