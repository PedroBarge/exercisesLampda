import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //——————————————————————————————————————————————————————————————————
        System.out.println("Calculator with Lambda and Interface");
        Operations add = (x, y) -> x + y;
        Operations sub = (x, y) -> x - y;
        Operations mult = (x, y) -> x * y;
        Operations div = (x, y) -> x / y;

        Calculator calculator = new Calculator();
        System.out.println(calculator.executeOperation(1, 2, add));
        System.out.println(calculator.executeOperation(3, 4, sub));
        System.out.println(calculator.executeOperation(5, 6, mult));
        System.out.println(calculator.executeOperation(7, 8, div));
        //——————————————————————————————————————————————————————————————————
        System.out.println();
        System.out.println("Array Filter Lambda");
        ArrayList<String> list = new ArrayList<>();
        list.add("qwertyui");
        list.add("okmnjiuh");
        list.add("ert");
        list.add("lkjh");
        list.add("vnbvnbvbnvnbv");
        list.add("ddddddddddd");
        list.add("qazxdfghbnjk");
        Filter<String> lengthFilter = s -> s.length() < 5;
        List<String> filteredStrings = Filterer.filter(list, lengthFilter);
        System.out.println("Filtered Strings: " + filteredStrings);
        //——————————————————————————————————————————————————————————————————
        System.out.println();
        System.out.println("Transformation with Function");
        Transformation lengthTransformation = String::length;
        List<Integer> transformedLengths = Transformer.applyTransformation(list, lengthTransformation);
        System.out.println("Transformed Lengths: " + transformedLengths);
        //——————————————————————————————————————————————————————————————————
        System.out.println();
        System.out.println("Consumption with Consumer");
        Action printAction = System.out::println;
        Executor.executeAction(list, printAction);
        //——————————————————————————————————————————————————————————————————
        System.out.println();
        System.out.println("Providing with Supplier");
        Generator<Integer> randomNumberGenerator = () -> (int) (Math.random() * 100);
        List<Integer> randomNumbers = Producer.produce(randomNumberGenerator, 5);
        System.out.println("Random Numbers: " + randomNumbers);

    }
}