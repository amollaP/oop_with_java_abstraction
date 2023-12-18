package oop_with_java_abstraction;

public class Principal02 {
    
    //"1° Topico de OOP: "Abstraction" Abstração
    //Interfaces
    public static void main(String[] args)
    {
        //Crio a classe Aguia, e, referencio a ela mesmo
        Aguia myAguia = new Aguia();
        
        //myAguia
        myAguia.comer();
        myAguia.som();
        myAguia.voar();
        
        
       
        
        // Acessando as constantes diretamente da interface
        System.out.println("Número de asas: " + Passaro.numeroAsas);
        System.out.println("Revestimento Externo: "+ Passaro.revestimentoExterno); 
    }
}
