import java.util.ArrayList;
import java.util.List;

class Operation {
    String name;


    public Operation(String name) {
        this.name = name;
    }
}


public class Parser {
    static public List<Object> parse(String input) {
        List<Object> list = new ArrayList<>();

        String temp = "";
        Double number = null;
        String operator = "";
        for(char c : input.toCharArray()) {
            temp = temp.concat(Character.toString(c));

            try {
                number = Double.parseDouble(temp);
            }
            catch(NumberFormatException nfe) {
                //end of number
                if(number != null) {
                    list.add(number);
                    number = null;
                }
                list.add(Character.toString(c));
                temp = "";
            }
        }

        if(number != null) {
            list.add(number);
            number = null;
        }

        return list;
    }
}
