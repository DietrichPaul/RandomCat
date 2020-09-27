package com.github.prestigecode.randomcat;

import com.google.gson.JsonParser;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class RandomCat {

    public static final String API = "https://aws.random.cat/meow";

    public static BufferedImage resolve() throws IOException {
        URL url = new URL(API);
        InputStream in = url.openConnection().getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String text = reader.readLine();
        reader.close();
        return ImageIO.read(new URL(JsonParser.parseString(text).getAsJsonObject().get("file").getAsString()));
    }

}
