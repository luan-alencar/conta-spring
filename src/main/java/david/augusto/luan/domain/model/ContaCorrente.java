package david.augusto.luan.domain.model;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int conta, String titular, double saldo) {
		super(agencia, conta, titular, saldo);
	}

	public ContaCorrente(int agencia, int conta, String titular) {
		super(agencia, conta, titular);
	}

	public ContaCorrente() {
	}


}
