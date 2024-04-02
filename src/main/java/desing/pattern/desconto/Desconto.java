package desing.pattern.desconto;

import java.math.BigDecimal;

import desing.pattern.orcamento.Orcamento;

public abstract class Desconto {
	
	private Desconto proximo;
	
	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

	public BigDecimal calcular(Orcamento orcamento) {
		if(aplicarDesconto(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		return proximo(orcamento);
	}

	protected BigDecimal proximo(Orcamento orcamento) {
		return proximo.calcular(orcamento);
	}
	
	public abstract boolean aplicarDesconto(Orcamento orcamento);
	public abstract BigDecimal efetuarCalculo(Orcamento orcamento);

}
