
public class Transporte {
	
	private boolean ligado;
	protected int velocidade;
	
	Transporte (int velocidade){
		this.setVelocidade(velocidade);
	}
	
	
	public boolean liga(){  
	    return ligado = true;       
	}  
	  
	  
	public boolean desliga(){  
		velocidade=0;
		return ligado = false;  
	}


	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		if(velocidade<0) {
			System.out.println("A velocidade não pode ser negativa");
		}else {
		this.velocidade = velocidade;}
	}
	
	

}
