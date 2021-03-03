package singleton.basic;

public class Singleton {

    private Singleton(){}

    private static Singleton instance=null;

    public Singleton getInstance(){
        if(instance==null)
            instance=new Singleton();
        return instance;
    }
}
