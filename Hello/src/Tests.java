public class Tests {

    enum GeneralInformation{
            NAME, POL;
        }

        private static void print(GeneralInformation val){
            System.out.println(val);
        }

        public static void main(String[] args) {
            print(GeneralInformation.POL);
        }
}
