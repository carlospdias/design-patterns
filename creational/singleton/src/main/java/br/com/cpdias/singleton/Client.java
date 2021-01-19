package br.com.cpdias.singleton;

/**
 * Hello world!
 *
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Singleton singleton1 = Singleton.getInstance("Hello Singleton");
        System.out.println(singleton1.value);
        
        Singleton singleton2 = Singleton.getInstance("Another World");
        System.out.println(singleton2.value);
    }
}
