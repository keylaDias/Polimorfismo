package Polimorfismo;


public class A�oesAnimais {

	public static void main(String[] args) {
		
		cachorro cachorro = new cachorro();
		cavalo cavalo = new cavalo();
		Pregui�a pregui�a = new Pregui�a();
		
		cachorro.setAcao("correr");
		cachorro.setNome("Bob");
		cachorro.setNome("5");
		cachorro.setEmitirSom("latir");
		
		cavalo.setAcao("correr");
		cavalo.setNome("pe De Pano");
		cavalo.setIdade("7");
		cavalo.setEmitirSom("relinchar");

	
		pregui�a.setAcao("subir em arvore ");
		pregui�a.setNome("Sidy");
		pregui�a.setIdade("10");
		pregui�a.setEmitirSom("Som de pregui�a");
		
		System.out.println("O nome do cachorro �: "+cachorro.getNome()+"lnIdade do cachorro: "
				+cachorro.getIdade()+"\nA a��o do cachorro �: "+cachorro.isAcao()+"\nO som do cachorro �: "
				+cachorro.isEmitirSom());
		
		System.out.println("O nome do cavalo �: "+cavalo.getNome()+"\nIdade do cavalo: "
				+cavalo.getIdade()+"\nA a��o do cavalo �: "+cavalo.isAcao()+"\nO som do cavalo �: "
				+cavalo.isEmitirSom());
		
		System.out.println("O nome da pregui�a �: "+pregui�a.getNome()+"lnIdade da pregui�a: "
				+pregui�a.getIdade()+"\nA a��o da pregui�a �: "+pregui�a.isAcao()+"\nO som do cavaloda pregui�a �: "
				+pregui�a.isEmitirSom());
		
		
		
		
		

	}

}
