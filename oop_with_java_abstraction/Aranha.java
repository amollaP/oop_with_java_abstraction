package oop_with_java_abstraction;

public class Aranha extends Animal{

    @Override
    void dormir() {
        System.out.println("Aranha dorme");
    }

    @Override
    void mover() {
        System.out.println("Aranha se move");
    }

    @Override
    void comer() {
        System.out.println("Aranha come");
    }
  
}
