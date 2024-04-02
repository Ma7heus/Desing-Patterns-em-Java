package desing.pattern.orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {
	
	public BigDecimal calcularDescontoEspecial(Orcamento orcamento) {
		 throw new RuntimeException("Não é permitido adicionar Desconto Especial enquanto o orcamento estiver " 
				 + orcamento.getSituacao().getClass().getSimpleName());
	}
	
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Não é permitido aprovar esse orçamento");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Não é permitido reprovar esse orçamento");
	}
	
	public void criar(Orcamento orcamento) {
		throw new RuntimeException("Não é permitido aprovar esse orçamento");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException("Não é permitido finalizar esse orçamento");
	}
	
	public void analizar(Orcamento orcamento) {
		throw new RuntimeException("Não é permitido analizar esse orçamento");
	}
}
