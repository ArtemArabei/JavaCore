import java.util.HashMap;

public class PhoneBook {

    HashMap<String, Integer> phoneNumbers = new HashMap<>();

        public Integer getPhoneByName (String name) {
            return phoneNumbers.get(name);
        }

        public void addNumber(String name, Integer number) {
            phoneNumbers.put(name, number);
        }

        public static void main(String[] args) {
            PhoneBook myPhoneBook = new PhoneBook();
            myPhoneBook.addNumber("Alex", 1234567);
            myPhoneBook.addNumber("John", 1345234);
            myPhoneBook.addNumber("Will", 3235667);
            myPhoneBook.addNumber("Alex", 3456544);
            System.out.println(myPhoneBook.getPhoneByName("Alex"));
            System.out.println(myPhoneBook.getPhoneByName("Ivan"));
        }
}
