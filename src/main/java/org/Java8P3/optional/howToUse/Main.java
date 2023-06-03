package org.Java8P3.optional.howToUse;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        /*
        - ifPresent; +
        - orElse;  +
        - orElseGet
        - orElseThrow
         */

        DataBase dataBase = new DataBase();
        Optional<User> userOptional = dataBase.getById(10L);
        userOptional.ifPresent(System.out::println);

        //аналог операії не використовуючи Optional
        /*
          if (userOptional.isPresent() {
            User user = userOptional.get();
            System.out.println(user);
        }
         */

         // Optional<User> byId = dataBase.getById(11L);
        // User alice = byId.orElse(new User("Alice"));
        // System.out.println(alice);



      Optional<User> optional = dataBase.getById(11L);
        User john = optional.orElseGet(() -> new User("John"));
        System.out.println(john);


        Optional<User> optional1 = dataBase.getById(11L);
        System.out.println(optional.orElseGet(Main::getDafaulUser));
    }

    private static User getDafaulUser (){
        return new User("Bill");
    }
}
