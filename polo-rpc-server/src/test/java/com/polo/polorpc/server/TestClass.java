package com.polo.polorpc.server;

/**
 * @author polo
 */
public class TestClass implements TestInterface{
    @Override
    public void hello() {
        System.out.println("hello world!");
    }
}
