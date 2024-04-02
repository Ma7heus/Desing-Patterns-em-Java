package desing.pattern.orcamento;

public class Reprovado extends SituacaoOrcamento {
	
	@Override
	public void analizar(Orcamento orcamento) {
		orcamento.setSituacao(new EmAnalise());
	}

}
