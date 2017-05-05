import java.util.List;
import java.util.Objects;

public class AddHandler implements Handler{
    List<Object> list = null;

    public AddHandler(List<Object> list) {
        this.list = list;
    }

    public Double run () {
        if(Objects.equals((String) list.get(1), "+")) {
            int leftInt = (int)list.get(0);
            int rightInt = (int)list.get(2);
            return new Double(leftInt + rightInt);
        }

        return null;
    }
}
