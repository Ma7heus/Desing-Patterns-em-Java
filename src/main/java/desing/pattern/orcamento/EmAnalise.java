package desing.pattern.orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento {

	@Override
	public void aprovar(Orcamento orcamento) {
		orcamento.setSituacao(new Aprovado());
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		orcamento.setSituacao(new Reprovado());
	}

	@Override
	public BigDecimal calcularDescontoEspecial(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}
}
