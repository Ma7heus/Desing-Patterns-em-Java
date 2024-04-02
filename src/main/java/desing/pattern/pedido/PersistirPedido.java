package desing.pattern.pedido;

public class PersistirPedido implements CommandHandler<Object> {

	@Override
	public void execute(Object entrada) {
		System.out.println("Salvando pedido em Banco de dados");
	}

}
