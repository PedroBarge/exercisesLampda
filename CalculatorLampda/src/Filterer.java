import java.util.ArrayList;
import java.util.List;

public class Filterer {
    public static <T> List<T> filter(List<T> list, Filter<T> filter) {
        List<T> filteredList = new ArrayList<>();
        for (T obj : list) {
            if (filter.accept(obj)) {
                filteredList.add(obj);
            }
        }
        return filteredList;
    }
}
