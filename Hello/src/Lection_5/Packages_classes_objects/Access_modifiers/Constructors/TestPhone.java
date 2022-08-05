package Lection_5.Packages_classes_objects.Access_modifiers.Constructors;

public class TestPhone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone.number + " " + phone.model + " "
                + phone.weight);
        phone.receiveCall("Виктор");
        System.out.println(phone.getNumber(294444444));
        System.out.println();

        Phone phone2 = new Phone(292222222, "Sony Ericsson K750i");
        System.out.println(phone2.number + " " + phone2.model + " "
                + phone2.weight);
        phone.receiveCall("Сергей");
        System.out.println(phone.getNumber(295555555));
        System.out.println();

        Phone phone3 = new Phone(293333333,"Motorola RAZR V3", 167.8F);
        System.out.println(phone3.number + " " + phone3.model + " "
                + phone3.weight);
        phone.receiveCall("Николай");
        System.out.println(phone.getNumber(296666666));
        System.out.println();

        phone.sendMessage(297777777, 298888888, 299999999, 441111111,
                332222222, 256666666);
    }
}
