package com.github.prestigecode.randomcat.example;

import com.github.prestigecode.randomcat.RandomCat;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class CatSavingExample {

    public static void main(String[] args) {
        try {
            BufferedImage image = RandomCat.resolve();
            ImageIO.write(image, "PNG", new File(ThreadLocalRandom.current().nextLong(Long.MAX_VALUE) + ".png")); // i was to lazy to create a random string method xd
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
