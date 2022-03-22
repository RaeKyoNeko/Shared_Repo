package gui;

import dto.MyMap;

/**
 *
 * @author raekyo
 */
public class Tester {
    public static void main(String[] args) {
        MyMap map1 = new MyMap();
        
        map1.init();
//        map1.displayWords();
        
//        map1.removeWords("bop");
//        map1.removeWords("been");
//        map1.displayWords();
        
        map1.addWord("Hello");
        map1.addWord("nice");
        map1.addWord("boolean");
        map1.addWord("cat");
        map1.addWord("bing");
        map1.addWord("Boat");
//        map1.displayWords();
        
        
//        map1.removeWords("cat");
//        map1.checkWord("boom");
//        map1.displayWords();
        
//        for(String word : map1.getMaxGroupLength()){
//            System.out.println(word);
//        }
        
        System.out.println("Remove a");
//        map1.removeWords("a");
//        map1.removeWords("an");
        map1.addWord("ko");
        System.out.println("Shortest words: " + map1.findShortestWordOfDictionary());  
        System.out.println("Longest words Of Group b: " + map1.findLongestWordOfGroup("b"));
        System.out.println("Shortest words Of Group c: " + map1.findShortestWordOfGroup("c"));
//        map1.displayWords();
        
        
        
        map1.addWord("wooow");
        map1.addWord("dad");
        map1.addWord("moom");
        map1.addWord("meem");
//        map1.displayPalindromeWord();
//        
        
        map1.removeWords("hello");
        map1.removeWords("ko");
        
        
        map1.updateWord("dad", "meem"); // ok
        map1.updateWord("wooow", "");
        map1.updateWord("ant", "apple");
        map1.displayWords();
    }
}// end Tester
