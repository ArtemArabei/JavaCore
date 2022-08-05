public class Dog extends Animal {
    @Override
    public void voice () {
        System.out.println("Wuf");
    }
    public void voice (String angryVoice) {
        System.out.println(angryVoice);
    }
    public void voice (int numberOfVoice) {
        for (int i=0; i < numberOfVoice; i++) {
            voice("WUWUWUF");
        }
    }
    /*public static void main(String[] args) {
        Dog dogJackie = new Dog();
        dogJackie.voice();
        dogJackie.voice("Wuf");
        dogJackie.voice(5);
        System.out.println(dogJackie.toString());
        System.out.println(dogJackie.getClass());
    }*/
}
