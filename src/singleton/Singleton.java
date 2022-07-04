package singleton;

public class Singleton {
//    private Singleton obj = new Singleton(); // eager initialization
    private static Singleton obj;
    public int value;
    private Singleton(){};
    private Singleton(int value){ this.value = value;};
    public static Singleton getObj(int value){
        if(obj == null){
            obj=  new Singleton(value);  // lazy initialization
        }
        return obj;
    }
}
