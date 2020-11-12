package david.augusto.luan.domain.exceptions;

public class SaldoInsuficienteException extends Exception {
	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException() {
		super("Operação não realizada, saldo insuficiente.");
	}

}
