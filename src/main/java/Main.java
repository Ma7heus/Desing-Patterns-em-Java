

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import desing.pattern.pedido.CommandHandler;
import desing.pattern.pedido.EnviarPedidoPorEmail;
import desing.pattern.pedido.GeradorPedido;
import desing.pattern.pedido.GeradorPedidoHandler;
import desing.pattern.pedido.PersistirPedido;

/*
 * @autor MATHEUS BIASI
 */

public class Main {
	
	/*
	 * Para fazer o calculo do imposto estou usando o Desing Pattern STRATEGY
	 * Para fazer o calculo dos descontos uso o Desing CHAIN OF RESPONSABILITY
	 * Para melhorar o aproveitamento de codigo da classe Desconto, usso o desing TEMPLATE METHOD
	 * Para os Status dos Orcamentos estou usando o desing STATE.
	 * Para Gerar os pedidos estou usando COMMAND e COMMAND HANDLER
	 * Para Gerencias as "acoesAposPedido" estou usando o pattern OBSERVER
	 * 
	 */

	public static void main(String[] args) {
		
		GeradorPedido entrada = new GeradorPedido("Matheus Biasi", new BigDecimal("151"), 3L);
		
		List<CommandHandler> acoesAposPedido = new ArrayList<>();
		acoesAposPedido.add(new PersistirPedido());
		acoesAposPedido.add(new EnviarPedidoPorEmail());
		
		new GeradorPedidoHandler(acoesAposPedido).execute(entrada);
		
	}

}
