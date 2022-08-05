import java.io.*;

public class TestUser2 {
    public static void main(String[] args) {
        User2 userOld;
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/house.dat"))) {
            userOld = new User2();
            userOld.setName("Alex");
            oos.writeObject(userOld);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        User2 userNew;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/house.dat"))) {
            userNew = (User2) ois.readObject();
            System.out.printf("Name: %s", userNew.getName());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\n" + userOld.equals(userNew));
    }
}
