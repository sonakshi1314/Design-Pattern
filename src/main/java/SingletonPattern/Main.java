package main.java.SingletonPattern;

public class Main {

    public static void main(String[] args) {

        EagerSingleton eagerSingleton =EagerSingleton.getInstance();
        System.out.println(eagerSingleton.hashCode());

        EagerSingleton eagerSingleton1 =EagerSingleton.getInstance();
        System.out.println(eagerSingleton1.hashCode());

        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton.hashCode());

        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        System.out.println(lazySingleton1.hashCode());
    }



}
