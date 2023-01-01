package local.learning.javalombok;

import lombok.Data;
import lombok.NonNull;

@Data
public class Member {
    @NonNull
    private String id;

    @NonNull
    private String name;

    public String sayHello(@NonNull String name){
        return "Hello, my name is " + name;
    }
}
