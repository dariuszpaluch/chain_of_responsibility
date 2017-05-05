import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        String action = "10-5+20+100";

        List<Object> list = Parser.parse(action);

        List<Handler> handlers = new ArrayList<>();
        handlers.add(new DivisionHandler(list));
        handlers.add(new AddHandler(list));

        List<Object> result = null;
        for(Handler handler: handlers) {
            result = handler.run();

            if(result.size() == 1) {
                break;
            }
        }


        System.out.println(result.get(0));

        if(result == null) {
            System.out.println("Błędny operator");
        }
    }
}
