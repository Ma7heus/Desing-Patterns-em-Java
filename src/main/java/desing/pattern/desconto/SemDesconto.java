package desing.pattern.desconto;

import java.math.BigDecimal;

import desing.pattern.orcamento.Orcamento;

public class SemDesconto extends Desconto {

	protected SemDesconto() {
		super(null);
	}

	@Override
	public boolean aplicarDesconto(Orcamento orcamento) {
		return true;
	}

	@Override
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

}
