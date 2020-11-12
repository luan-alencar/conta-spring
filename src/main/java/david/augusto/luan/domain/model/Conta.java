package david.augusto.luan.domain.model;

import lombok.*;

@Data
@Getter @Setter
public abstract class Conta {

	private int agencia;
	private int conta;
	private String titular;
	private double saldo;
	
	
}
