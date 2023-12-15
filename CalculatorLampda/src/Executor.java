import java.util.List;

public class Executor {
    public static void executeAction(List<String> list, Action action) {
        for (String str : list) {
            action.execute(str);
        }
    }
}
