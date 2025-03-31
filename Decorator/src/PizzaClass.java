public class PizzaClass {
    private static PizzaClass instance;

    private PizzaClass(){}

    public static synchronized PizzaClass getInstance(){
        if(instance==null){
            instance = new PizzaClass();
        }
        return instance;
    }
    
}
