package example;

public class Container<T> {
    private T object;

    public Container(T object){
        this.object = object;
    }
    public Object doItAndReturn(){
        System.out.println("i did something");
        return this.object;
    }
}
