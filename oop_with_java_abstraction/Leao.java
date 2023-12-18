package oop_with_java_abstraction;

/*
    ANIMAL É UMA CLASSE ABSTRATA DO MUNDO REAL (BIOLOGIA) É UMA DO CONHECIMENTO
 */
public class Leao extends Felino  {
    
    //Existem 2 maneiras, Manual OR Automático clicando na opção de corrigir no Compilador Java.
    @Override
    void mover()
    {
        System.out.println("Leão caminha pela floresta!");
    }
    
    @Override
    void comer()
    {
        System.out.println("Leão come carne com força!");
    }

    @Override
    void dormir() {
        System.out.println("Leão dorme muito!");
    }

	@Override
	void brincar() {
		System.out.println("Leão gosta de brincar");
		
	}

    
}
