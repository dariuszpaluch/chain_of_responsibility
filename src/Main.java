import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        String action = "10*5";

        List<Object> list = Parser.parse(action);

        List<Handler> handlers = new ArrayList<>();
        handlers.add(new DivisionHandler(list));
        handlers.add(new AddHandler(list));
        handlers.add(new MultiplyHandler(list));

        Double result = null;
        for(Handler handler: handlers) {
            result = handler.run();

            if(result != null) {
                break;
            }
        }


        System.out.println(result);

        if(result == null) {
            System.out.println("Błędny operator");
        }
    }
}
