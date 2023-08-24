package generics;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Response<User> response = new Response<>();

        response.setData(new User(1,"Test"));
        User u = response.getData();

        System.out.println(u);

        Main main = new Main();
        main.foo("data");

        Pair<String, Integer> pair = new Pair<>();
        pair.put("123",0);



        System.out.println(pair.getValue("1234"));;

    }

    public <A> A foo(A a){
        return a;
    }

    public void foo(Response<User> userResponse){

    }

}
