package main.java.FlyWeightPattern;

import java.util.HashMap;

     class PenFactory {

    final static HashMap<String , Pen> hashMap =new HashMap<>();


    public static Pen getThickPen(String color){

        String key=color+"- thick" ;

        if(hashMap.containsKey(key))
            return hashMap.get(key);
        else{
            ThickPen pen=new ThickPen();
            pen.setColor(color);
            hashMap.put(key , pen);
        }
        return hashMap.get(key);
    }

    public static Pen getThinPen(String color){
        String key = color +"- thin";
        if(hashMap.containsKey(key))
            return hashMap.get(key);
        else{
            ThinPen pen=new ThinPen();
            pen.setColor(color);
            hashMap.put(key , pen);
        }
        return hashMap.get(key);
    }

    public static Pen getMediumPen(String color){
        String key = color +"- medium";
        if(hashMap.containsKey(key))
            return hashMap.get(key);
        else{
            MediumPen pen=new MediumPen();
            pen.setColor(color);
            hashMap.put(key , pen);
        }
        return hashMap.get(key);
    }

}
