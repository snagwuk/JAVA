package ch15;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExam3
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        TreeSet<String> TreeSet = new TreeSet<String>();
        TreeSet.add("apple");
        TreeSet.add("forever");
        TreeSet.add("description");
        TreeSet.add("ever");
        TreeSet.add("zoo");
        TreeSet.add("base");
        TreeSet.add("guess");
        TreeSet.add("cherry");
        System.out.println("[c-f사이의 단어 검색]");
        NavigableSet<String> rangeSet = TreeSet.subSet("c", true, "f", true);
        for(String word : rangeSet)
            System.out.println(word);
    }
    
}
