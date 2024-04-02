package desing.pattern.pedido;

import java.time.LocalDateTime;
import java.util.List;

import desing.pattern.orcamento.Orcamento;

public class GeradorPedidoHandler implements CommandHandler<GeradorPedido> {
	
	private List<CommandHandler> acoes;
	
	public GeradorPedidoHandler(List<CommandHandler> acoes) {
		this.acoes = acoes;
	}

	public void execute(GeradorPedido entrada) {
		
		Orcamento orcamento = new Orcamento(entrada.getValorOrcamento(), entrada.getQuantidadeItens());
		orcamento.analizar();
		orcamento.aplicarDescontoExtra();
		orcamento.aprovar();
		
		Pedido pedido = new Pedido(entrada.getCliente(), LocalDateTime.now(), orcamento);
		System.out.println(pedido.toString());
		
		acoes.forEach(a -> a.execute(entrada));
		
	}
	
}
