package model.computer;

public interface Video {
    void playVideo();

    void pauseVideo();

    void stopVideo();

    default void sayHelloFromVideo() {
        System.out.println("hello from video default");
    }

    default void sayHello() {
        System.out.println("hello from video");
    }

}
