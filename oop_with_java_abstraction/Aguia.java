package oop_with_java_abstraction;

//"implements" uso quando quero implementar os métodos da minha Interface
class Aguia implements Animals, Passaro {
	
	
	public Aguia() {
	}

    @Override
    public void comer() {
        System.out.println("Aguia come Bicho preguiça");
    }

    @Override
    public void som() {
        System.out.println("Som agudo");
    }

    @Override
    public void voar() {
        System.out.println("Batendo asas");
    }
    
}
