package main.java.SingletonPattern;

public class LazySingleton {

    private static LazySingleton singleton;
    private LazySingleton(){
    }

 //   issue: 2 threads can simultaneously act on if condition and due to this 2 objects can be created . to avoid this we use synchronized keyword in method , so that at one time only one threads enters the method and hence only one object is formed.
    /* public static LazySingleton  getInstance(){
         if(singleton==null)
             singleton=new LazySingleton();
        return singleton;
    }*/


   /* public static  synchronized LazySingleton  getInstance(){
        if(singleton==null)
            singleton=new LazySingleton();
        return singleton;
    }*/

    //as only of condition is causing issue we can also add synchronized block around if condition
    public static  LazySingleton  getInstance(){
        if(singleton==null) {
            synchronized (LazySingleton.class) {
                if (singleton == null)
                    singleton = new LazySingleton();
            }
        }
        return singleton;
    }

}
