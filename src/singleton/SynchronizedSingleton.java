package singleton;

public class SynchronizedSingleton {

    private static SynchronizedSingleton obj;
    public int value;
    private SynchronizedSingleton(){};
    private SynchronizedSingleton(int value){ this.value = value;};
    public static synchronized SynchronizedSingleton getObj1(int value){ // with method synchronization
        if(obj == null){
            obj=  new SynchronizedSingleton(value);  // lazy initialization
        }
        return obj;
    }

    public static SynchronizedSingleton getObj2(int value){ // with block synchronization (best)
        if(obj == null){
            synchronized (Singleton.class) {
                obj = new SynchronizedSingleton(value);  // lazy initialization
            }
        }
        return obj;
    }
}
