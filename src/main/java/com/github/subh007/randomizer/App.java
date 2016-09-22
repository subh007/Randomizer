package com.github.subh007.randomizer;

import com.github.subh007.factory.RandomizerFactory;
import com.gitub.subh007.random.Randomizer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Randomizer<Number> numRandomizer  = new RandomizerFactory<Number>()
        		.getRandomizer(Number.class);
        Number n = numRandomizer.getRandomElement();        
        System.out.println(n);
        
        Randomizer<String> strRandomizer = new RandomizerFactory<String>()
        		.getRandomizer(String.class);
        String str = strRandomizer.getRandomElement();
        System.out.println(str);
    }
}
