package desing.pattern.desconto;

import java.math.BigDecimal;

import desing.pattern.orcamento.Orcamento;

public class AplicaDescontoParaOrcamentoMaiorCincoItens extends Desconto {
	
	public AplicaDescontoParaOrcamentoMaiorCincoItens(Desconto proximo) {
		super(proximo);
	}

	@Override
	public boolean aplicarDesconto(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}

	@Override
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}
	
}
