package desing.pattern.desconto;

import java.math.BigDecimal;

import desing.pattern.orcamento.Orcamento;

public class CalculadoraDesconto {

	public BigDecimal calcular(Orcamento orcamento) {

		 AplicaDescontoParaOrcamentoMaiorCincoItens correnteCalculoDesconto =
				 new AplicaDescontoParaOrcamentoMaiorCincoItens(
						 new AplicaDescontoParaOrcamentoMaiorQuinhentosReais(
								 new SemDesconto()
								 )
						 );

		 	return correnteCalculoDesconto.calcular(orcamento);
		}

}
