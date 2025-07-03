package com.example.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class SingletonTest {

    @Test
    void testSingletonUnicaInstancia(){
        Singleton instancia1 = Singleton.getInstancia();
        Singleton instancia2 = Singleton.getInstancia();

        assertSame(instancia1,instancia2, "Las instancias no son iguales");
    }
}
