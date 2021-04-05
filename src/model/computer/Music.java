package model.computer;

public interface Music {
    String NAME = "MUSIC";

    static String getName() {
        return NAME;
    }

    void playMusic();

    void pauseMusic();

    void stopMusic();

    default void sayHelloFromMusic() {
        System.out.println("hello from music default");
    }

    default void sayHello() {
        System.out.println("hello from music");
    }

// od java 9
//    private static void privateMethod() {
//        System.out.println("hello");
//    }

}
