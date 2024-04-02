package desing.pattern.pedido;

public class EnviarPedidoPorEmail implements CommandHandler<Object> {

	@Override
	public void execute(Object entrada) {
		System.out.println("Enviando pedido por email.");
	}

}
