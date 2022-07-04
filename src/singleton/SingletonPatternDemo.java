package singleton;



// purpose: crate single instance with global access point
// example: logging, driver objects, caching, thread pool, database connections
public class SingletonPatternDemo {
    public static void main(String[] args) {
        Singleton obj1, obj2;
        obj1 = Singleton.getObj(15);
        obj2 = Singleton.getObj(20);

        System.out.println(obj1);
        System.out.println(obj1.value);
        System.out.println(obj2);
        System.out.println(obj2.value);

//        SynchronizedSingleton obj3, obj4;
//

//        obj3 = SynchronizedSingleton.getObj1(18);
//        obj4 = SynchronizedSingleton.getObj1(25);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                SynchronizedSingleton obj3 = SynchronizedSingleton.getObj2(18);
//                System.out.println(obj3);
                System.out.println("Sync Singleton-1: "+obj3.value);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                SynchronizedSingleton obj3 = SynchronizedSingleton.getObj2(20);
//                System.out.println(obj3);
                System.out.println("Sync Singleton-2: "+obj3.value);
            }
        });

        thread1.start();
        thread2.start();

    }
}
