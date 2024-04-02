package desing.pattern.orcamento;

public class Criado extends SituacaoOrcamento {
		
	@Override
	public void analizar(Orcamento orcamento) {
		orcamento.setSituacao(new EmAnalise());
	}

}
