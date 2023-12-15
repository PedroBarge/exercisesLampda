import java.util.ArrayList;
import java.util.List;

public class Transformer {
    public static List<Integer> applyTransformation(List<String> list, Transformation transformation) {
        List<Integer> transformedList = new ArrayList<>();
        for (String str : list) {
            transformedList.add(transformation.transform(str));
        }
        return transformedList;
    }
}
