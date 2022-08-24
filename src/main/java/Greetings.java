import java.util.ArrayList;
import java.util.Locale;

public class Greetings {

    public String sayHello() {
        return "Hello";
    }


    public String greet(Object name) {

        if (name == null) {
            return "Hello, my friend";
        }

        if (name instanceof String) {

            if (((String) name).toUpperCase().equals(name)) {
                return "HELLO " + name + "!";
            } else {
                return "Hello " + name;
            }
        }

        if(name instanceof String[]){

            String greeting = "Hello ";

            for (int i = 0; i < ((String[]) name).length; i++) {

                if(i == 0){
                    greeting += ((String[]) name)[i];
                } else {
                    greeting += ", " + ((String[]) name)[i];
                }
            }
            return greeting;
        }
        return "Error!";
    }
}
