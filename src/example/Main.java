package example;

import example.Container;

public class Main {
    public static void main(String[] args) {
        Container<User> container = new Container<>(new User());

        container.doItAndReturn();
    }

    public static void doSomething(Container<User> container){
        User u = (User) container.doItAndReturn();
    }
}
