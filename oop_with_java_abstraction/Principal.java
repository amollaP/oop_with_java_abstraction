package oop_with_java_abstraction;

/*
    Classe principal, que vamos usar para testar nosso programa Ex: "ABSTRAÇÃO" EM JAVA
 */
public class Principal {
    
    public static void main(String[] args)
    {

        //preciso instanciar a classe filha, que são as classes que herdam da CLASSE PAI (ANIMAL)
        //Leao pertence a familia Felino
        //Ponteiro da classe Abstrata "Animal" refencia para a "Class Leao"
        Animal leao = new Leao();
        
        /*ponteiro da classe abstrata Felino referencia para a classe leao, nesse caso a referencia pega 
         o metodo brincar que esta na classe felino, repare que quando o ponteiro esta para a classe animal
          a instancia nao possui o metodo brincar **/ 
        Felino leao2 = new Leao();
        
        //para corrigir isso se vc instancia pela propria classe vc possuira todos os metodos herdados
        Leao leao3 = new Leao();
  
        leao.comer();
        leao.dormir();
        leao.mover();
        leao2.brincar();
        leao3.brincar();
        
        
        //mas ambas, pertencem ao UNIVERSO ANIMAL
        
        //Aranha pertence a familia de Insetos
        Animal aranha = new Aranha();
        aranha.comer();
        aranha.dormir();
        aranha.mover();
       
        //Estamos no 1° Topico de OOP with Java "ABSTRAÇAO"
        
    }
    
}
