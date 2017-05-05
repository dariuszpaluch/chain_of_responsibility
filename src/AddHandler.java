import java.util.List;
import java.util.Objects;

public class AddHandler implements Handler{
    List<Object> list = null;

    public AddHandler(List<Object> list) {
        this.list = list;
    }

    public void action() {
        int i = 1;
        while(i < list.size() && i >= 0)
            if(Objects.equals((String) list.get(i), "+")) {
                double leftInt = (double)list.get(i-1);
                double rightInt = (double)list.get(i+1);

                list.set(i-1, new Double(leftInt + rightInt));
                list.remove(i);
                list.remove(i);

            } else {
            i +=2;
        }
    }

    public List<Object> run () {
        this.action();

        return list;
    }
}
