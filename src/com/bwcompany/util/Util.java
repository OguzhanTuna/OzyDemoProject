package com.bwcompany.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Logical static classes
public final class Util {
    private static final Random MS_RANDOM;
    private static final String MS_ALPHABET_TR = "abcçdefgğhıijklmnoöprsştuüvyz";
    //...

    static{
        MS_RANDOM = new Random();
    }

    private Util() {}

    public static String capitalize(String s)
    {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }

    public static String getRandomStringTR(int n)
    {
        char[] randomChars = new char[n];

        IntStream.range(0, n)
                .forEach(index -> randomChars[index]
                        = MS_ALPHABET_TR.charAt(MS_RANDOM.nextInt(29)));

        return new String(randomChars);
    }

    public static List<Character> getCharacterList(String s)
    {
        List<Character> characters = new ArrayList<>();

        for(char ch : s.toCharArray()){
            characters.add(ch);
        }

        return characters;
    }
}
