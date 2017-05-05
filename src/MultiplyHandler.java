import java.util.List;
import java.util.Objects;

/**
 * Created by dpaluch on 05.05.2017.
 */
public class MultiplyHandler implements Handler{
    List<Object> list = null;

    public MultiplyHandler(List<Object> list) {
        this.list = list;
    }

    public List<Object> run () {
//        if(Objects.equals((String) list.get(1), "*")) {
//            int leftInt = (int)list.get(0);
//            int rightInt = (int)list.get(2);
//            return new Double(leftInt * rightInt);
//        }
//
//        return null;

        return list;
    }
}
