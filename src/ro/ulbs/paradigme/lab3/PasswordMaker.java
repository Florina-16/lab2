package ro.ulbs.paradigme.lab3;

import java.util.Random;

public class PasswordMaker {
    private static final int MAGIC_NUMBER = new Random().nextInt(6) + 5;
    private final String magicString;

    public class PasswordMaker(){
          this.magicString = StringRandomizer.generateRandomString(20);
    }
}
