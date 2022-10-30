package main.java.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        Mobile mobile1=new Mobile.MobileBuilder().setName("GalaxyA20").setColor("Black").build();
        Mobile mobile2=new Mobile.MobileBuilder().setName("OppoA50").setColor("Blue").setRam(64).build();

        System.out.println(mobile1);
        System.out.println(mobile2);
    }
}
