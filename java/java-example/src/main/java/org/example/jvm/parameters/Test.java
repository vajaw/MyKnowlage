package org.example.jvm.parameters;

public class Test
{
    public static void main(String[] args)
    {
        Long longMin = Long.MIN_VALUE;
        Long longMax = Long.MAX_VALUE;
        System.out.println(longMin);
        System.out.println(longMax);
        System.out.println(9223371036855551616L);
        System.out.println( Long.MIN_VALUE + 775808);

        System.out.println( Long.MIN_VALUE + 775808);
        System.out.println( Long.MAX_VALUE - 775807);
        System.out.println( Long.MIN_VALUE + 75808);
        System.out.println( Long.MAX_VALUE - 75807);
        System.out.println( Long.MIN_VALUE + 5808);
        System.out.println( Long.MAX_VALUE - 5807);
        System.out.println( Long.MIN_VALUE + 808);
        System.out.println( Long.MAX_VALUE - 807);
        System.out.println( Long.MIN_VALUE + 8);
        System.out.println( Long.MAX_VALUE - 7);
        System.out.println( Long.MIN_VALUE + 8);
        System.out.println( Long.MAX_VALUE - 7);
        System.out.println( Long.MIN_VALUE);
        System.out.println( Long.MAX_VALUE);

        System.out.println(775808%10);
        System.out.println(775808%100);
        System.out.println(775808%1000);
        System.out.println(775808%10000);
    }
}
