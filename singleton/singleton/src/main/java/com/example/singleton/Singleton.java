package com.example.singleton;

public class Singleton {

    //Instancia privada estática y unica
    private static Singleton instancia;

    public Singleton() {
    }

    public static synchronized Singleton getInstancia(){
        if(instancia == null){
            instancia = new Singleton();
        }
        return instancia;
    }

    public void mostrarMensaje(){
        System.out.println("Esta es la instancia de Singleton");
    }
}
