package itacademy.lsr.javalanguage.task04.n3e07;

import java.util.Optional;

public class MyOptional {

    public static Optional<String> createMyOptionalEmpty(boolean x){
        if (x){
            return Optional.empty();
        }
        else{
            return Optional.of("Test");
        }

    }
}
