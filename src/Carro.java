
public class Carro extends Transporte{
	
	private int quilometragem;

	Carro(int velocidade, int quilometragem) {
		super(velocidade);
		this.setQuilometragem(quilometragem);
	}

	public int getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(int quilometragem) {
		if(quilometragem<0 || quilometragem>999999) {
			System.out.println("A quilometragem n�o pode ser negativa ");
			
			if (quilometragem>999999) {
				System.out.println("A quilometragem n�o pode ser maior que 999999 ");
			}
		} else {
			this.quilometragem = quilometragem;
		}
	}
	
	@Override
	public int getVelocidade() {
		return velocidade;
	}
	
	@Override
	public void setVelocidade(int velocidade) {
		if(velocidade>200 || velocidade<0) {
			System.out.println("A velocidade n�o pode ser maior que 200 km/l tambem n�o pode ser negativo");
		}else {
		this.velocidade = velocidade;
		}
	}}
	
	


