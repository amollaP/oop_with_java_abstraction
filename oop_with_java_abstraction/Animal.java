package oop_with_java_abstraction;

//Abstração

//palavra reservada do Java que cria uma Classe Abstrata

abstract class Animal { //Classe Pai Principal e que todas as classes do UNiverso animal que eu criar, irão herdar os "Procedures and Function" 
    //funções e procedimentos  abstracts da Classe PAI (ANIMAL) OU SEJA, CLASSE GENERICA
    
    //abstract methods //Metodos abstratos
    abstract void dormir();
    abstract void mover();
    abstract void comer(); //metodo abstract é obrigatorio ao finalizar a sua criação usar ";" ponto e virgula ao final
    
    //Concrete method // Metodos Concretos
    void label()
    {
        System.out.println("Dados do Animal"); 
    }
   
}
