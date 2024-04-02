package desing.pattern.pedido;

public interface CommandHandler<T> {
	
	public void execute(T entrada);

}
