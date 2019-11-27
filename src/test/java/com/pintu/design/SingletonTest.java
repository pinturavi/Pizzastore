package com.pintu.design;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SingletonTest {


    @BeforeEach
    public void createObjec(){

    }


    @Test
    public void check() {
        final var instance = Singleton.getInstance();
        final var instance1 = Singleton.getInstance();
        Assertions.assertSame(instance, instance1);
    }
}
