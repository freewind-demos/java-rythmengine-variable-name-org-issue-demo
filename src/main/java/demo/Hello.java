package demo;

import org.rythmengine.Rythm;

import java.io.File;

public class Hello {

    public static void main(String[] args) {
        System.out.println(Rythm.render(new File("src/main/resources/rythm/hello.rythm"), "rythm"));
    }

}

