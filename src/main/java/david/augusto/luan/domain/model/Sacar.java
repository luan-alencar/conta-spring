package david.augusto.luan.domain.model;

import org.springframework.beans.factory.annotation.Autowired;

import david.augusto.luan.domain.exceptions.SaldoInsuficienteException;

public class Sacar {

	@Autowired
	private Conta service;
	
	public void sacar(double valor) throws SaldoInsuficienteException {
		if (service.getSaldo() < valor) {
			throw new SaldoInsuficienteException();
		}
		double total = service.getSaldo() - valor;
		service.setSaldo(total);
	}

}
