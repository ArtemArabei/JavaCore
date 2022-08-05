import java.io.Serializable;
import java.util.Objects;

public class User2 implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User2 user2 = (User2) o;
        return name.equals(user2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
