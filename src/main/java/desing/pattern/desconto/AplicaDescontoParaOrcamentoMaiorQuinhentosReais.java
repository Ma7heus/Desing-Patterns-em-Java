package desing.pattern.desconto;

import java.math.BigDecimal;

import desing.pattern.orcamento.Orcamento;

public class AplicaDescontoParaOrcamentoMaiorQuinhentosReais extends Desconto {
	
	public AplicaDescontoParaOrcamentoMaiorQuinhentosReais(Desconto proximo) {
		super(proximo);
	}
	
	@Override
	public boolean aplicarDesconto(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) == 1;
	}

	@Override
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.2"));
	}

}
