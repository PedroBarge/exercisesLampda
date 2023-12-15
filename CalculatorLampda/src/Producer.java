import java.util.ArrayList;
import java.util.List;

public class Producer {
    public static <T> List<T> produce(Generator<T> generator, int count) {
        List<T> producedList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            producedList.add(generator.generate());
        }
        return producedList;
    }
}
