import java.util.ArrayList;
import java.util.List;

public class Filtered {

    public List<String> filtered(List<String> inicialList, Filter filter) {
        List<String> filterList = new ArrayList<>();

        for (String string : inicialList) {
            if (filter.accept(string)){
                filterList.add(string);
            }
        }
        return filterList;
    }

    public List<String> filteredStream(List<String> inicialList, Filter filter) {
        return inicialList.stream()
                .filter(string -> filter.accept(string))
                .peek(System.out::println)
                .toList();
    }
}
