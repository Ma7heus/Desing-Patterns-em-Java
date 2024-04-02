package desing.pattern.orcamento;

import java.math.BigDecimal;

public class Orcamento {
	
	private BigDecimal valor;
	
	private Long quantidadeItens;
	
	private SituacaoOrcamento situacao;
	
	public Orcamento(BigDecimal valor, Long quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
		this.situacao = new Criado();
	}
	
	public void aplicarDescontoExtra() {
		BigDecimal descontoEspecial = this.situacao.calcularDescontoEspecial(this);
		setValor(getValor().subtract(descontoEspecial));
	}
	
	public void aprovar() {
		this.situacao.aprovar(this);
		System.out.println("Orcamento Aprovado");
	}
	
	public void reprovar() {
		this.situacao.reprovar(this);
		System.out.println("Orcamento Reprovado");
	}
	
	public void analizar() {
		this.situacao.analizar(this);
		System.out.println("Orcamento Em analise");
	}
	
	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Long getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setQuantidadeItens(Long quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}

	public SituacaoOrcamento getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

}
