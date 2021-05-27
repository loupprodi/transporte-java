
public class MainTest {

	public static void main(String[] args) {
		
		Transporte t1 = new Transporte(100);
		t1.liga();
		System.out.println("A velocidade do eh "+ t1.getVelocidade());
		System.out.println();
		
		Transporte t2 = new Transporte(100);
		t2.desliga();
		System.out.println("A velocidade do eh "+ t2.getVelocidade());
		System.out.println();
		
		Carro c1 = new Carro(79, 1503);
		System.out.println("A velocidade do carro é "+c1.getVelocidade()+" e a quilometragem é "+c1.getQuilometragem());
		System.out.println();

		
		Carro c2 = new Carro(203, 503);
		System.out.println("A velocidade do carro é "+c2.getVelocidade()+" e a quilometragem é "+c2.getQuilometragem());
		System.out.println();
		
		
		Carro c3 = new Carro(-1, -10);
		System.out.println("A velocidade do carro é "+c3.getVelocidade()+" e a quilometragem é "+c3.getQuilometragem());
		System.out.println();

	
	}


}
