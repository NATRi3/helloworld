import java.util.List;
import java.util.Random;
import java.util.Set;

public class Cat {
    private static final List<String> names = List.of("Вася","Петя","Барсик");
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRandomName(){
        name = names.get(new Random().nextInt(3));
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
