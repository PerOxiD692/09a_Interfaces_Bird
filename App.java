public class App {
    public static void main(String[] args) {
       
        Bird bird = new Bird();
        ausgabe(bird.fly());
        ausgabe(bird.hasFeathers());

    }//end main

    private static void ausgabe(String outStr) {
        System.out.println(outStr);
    }//end ausgabe

}//end App
