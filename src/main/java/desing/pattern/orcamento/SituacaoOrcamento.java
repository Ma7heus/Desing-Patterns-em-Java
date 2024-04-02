package desing.pattern.orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {
	
	public BigDecimal calcularDescontoEspecial(Orcamento orcamento) {
		 throw new RuntimeException("N�o � permitido adicionar Desconto Especial enquanto o orcamento estiver " 
				 + orcamento.getSituacao().getClass().getSimpleName());
	}
	
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("N�o � permitido aprovar esse or�amento");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("N�o � permitido reprovar esse or�amento");
	}
	
	public void criar(Orcamento orcamento) {
		throw new RuntimeException("N�o � permitido aprovar esse or�amento");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException("N�o � permitido finalizar esse or�amento");
	}
	
	public void analizar(Orcamento orcamento) {
		throw new RuntimeException("N�o � permitido analizar esse or�amento");
	}
}
