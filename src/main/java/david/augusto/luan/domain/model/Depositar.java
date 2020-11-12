package david.augusto.luan.domain.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Depositar extends Conta {

	@Autowired
	private Conta service;
	
	public void depositar(double valor) {
		double total = service.getSaldo() + valor;
		Conta c = new ContaCorrente();
		c.setSaldo(total);
	}

}
