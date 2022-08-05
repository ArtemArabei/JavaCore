import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
public class StreamTest {
    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
        long countA1 = collection.stream().filter("a1"::equals).count();
        System.out.println(countA1);
        System.out.println(collection.stream().findFirst().orElse("0"));
        System.out.println(collection.stream().skip(collection.size() - 1).findFirst().orElse("empty"));
        System.out.println(collection.stream().filter("a3"::equals).findFirst().get());
        System.out.println(collection.stream().skip(2).findFirst().get());
        Collection<String> collection2 = collection.stream().skip(1).limit(2).collect(Collectors.toList());
        System.out.println(collection2);
    }
}
