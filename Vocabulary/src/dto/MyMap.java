package dto;

import filedao.MyFileLib;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.TreeSet;

/**
 *
 * @author raekyo
 * 
 * Key: "a"
 * Value: TreeSet contains word start with "<Key>"
 * 
 * ex:
 * <key> = "a" -> 
 * <value> = "apple", "ant" ,...
 */
public class MyMap {
    private HashMap<String, TreeSet<String>> map;
            
    public MyMap(){
        map = new HashMap<>();
    }

    public MyMap(HashMap<String, TreeSet<String>> map) {
        this.map = map;
    }

    public HashMap<String, TreeSet<String>> getMap() {
        return map;
    }

    public void setMap(HashMap<String, TreeSet<String>> map) {
        this.map = map;
    }
    
    /**
     * INITial dictionary
     */
    public  void init(){
        TreeSet<String> g1 = new TreeSet();
        g1.add("apple");
        g1.add("ant");
        g1.add("arm");
        g1.add("an");
        g1.add("a");
        map.put("a", g1); // put dictionary for "a"
        
        
        TreeSet<String> g2 = new TreeSet();
        g2.add("boom");
        g2.add("bee");
        g2.add("been");
        g2.add("bop");
        g2.add("bubble");
        map.put("b", g2); // put dictionary for "b"
        
        
        TreeSet<String> g3 = new TreeSet();
        g3.add("cut");
        g3.add("can");
        g3.add("cancel");
        g3.add("catch");
        g3.add("cat");
        map.put("c", g3); // put dictionary for "c"
    }// end init()
    
    public void init(String fileName){
        
        try {
            ArrayList<String> list = MyFileLib.loadData(fileName);
            
            // 26 treeSet   
                for(char i='a'; i<='z'; i++){
                    TreeSet<String> t = new TreeSet();
                    map.put(Character.toString(i), t);
                }
                
//            System.out.println(list);
            // slip each word in list to TreeSet<String>
            for(String str : list){
                // get first character
                String key = str.charAt(0) + "";
                // format to LowerCase
                key.toLowerCase();
                
                TreeSet<String> t = map.get(key);
                if(t!=null)t.add(str);
            }
        } catch (Exception e) {
//            System.out.println("ERROR");
            e.printStackTrace();
        }
    }
    
    /**
     * display all word in dictionary by group
     */
    public void displayWords(){
        Collection<TreeSet<String>> value = map.values();
        
        for (TreeSet<String> treeSet : value) {
//            System.out.println("\nWord/Group: [" + treeSet.first().charAt(0) +"]" 
//                    + "(" + treeSet.size() + " words)");
                System.out.println("Word/Group:");
            for (String string : treeSet) {
                System.out.print(string + "; ");
            }// end fore treeset
        }// end fore value
        
        System.out.println();
    }// end displayWords
    
    public String formatString(String words){
        return words.toLowerCase();
    }
    
    
    /**
     * add new word to map
     * case1: exist key in map -> add to map
     * case2: not exist key -> create new set -> add to map
     * case3: duplicate -> notification "can not add" || "words already exist"
     * @param words: word need to add
     * @return true if add successful
     */
    public boolean addWord(String words){
        words = formatString(words);
        TreeSet<String> tmp = map.get(getGroupOf(words));
        
        // if the tree is empty (word key not in map yet)
        if(tmp == null){
            tmp = new TreeSet();
            tmp.add(words);
            map.put(getKeyOf(words), tmp);
            return true;
        }else return tmp.add(words);
    }
    
    private String getKeyOf(String words){
        return Character.toString(words.charAt(0));
    }
    
    private TreeSet<String> getGroupOf(String words){
        return map.get(getKeyOf(words));
    }
    
    
    /**
     * remove words from map,tree
     * case1: if there are only 1 words -> remove key of that map
     * case2: remove successful -> remove at set
     * case3: words not exist in set, map
     * @param words: words need to remove
     * @return: true if successful
     */
    public boolean removeWords(String words){
        String key = getKeyOf(words);
        TreeSet<String> tmp = map.get(key);
        if(tmp == null){
            return false;
        }else if(tmp.size() == 1) return map.remove(key, tmp);
        else return tmp.remove(words);
    }
    
    
    
    /**
     * Check random words exist in map ?
     * @param words: words need to find 
     * @return true if words in map
     */
    public boolean checkWord(String words){
        return map.get(getKeyOf(words)).contains(words);
    }
    
    
    public boolean checkKey(String key){
        TreeSet<String> tmp = map.get(key);
        if(tmp == null) return false;
        return true;
    }
    
    
    public TreeSet<String> getGroupOfKey(String key){
        return map.get(key);
    }
    
    
    /**
     * count words have a largest words contained
     * ex: a have the largest contain words
     * @return: value contains most words in maps
     */
    public TreeSet<String> getMaxGroupLength(){
        TreeSet<String> max = new TreeSet<>();
        for(TreeSet<String> tmp : map.values()){
            if(max.size() < tmp.size()) max = tmp;
        }
        return max;
    }
    
    
    /**
     * words have the longest words of the specific group
     * ex: anonymous is longest in "a" key
     * @param groupName: group name to find
     * @return: the words have longest character
     */
    public String findLongestWordOfGroup(String groupName){
        groupName = formatString(groupName);
        if(groupName == null || groupName.isEmpty() || !checkKey(groupName)) return null;
        else{
            TreeSet<String> tmp = getGroupOf(groupName);
            String max = "";
            for (String string : tmp) {
                if(max.compareTo(string) < 0) max = string;
            }
            return max;
        }
    }// end findLongestWordOfGroup
    
    
    public String findShortestWordOfGroup(String groupName){
        if(groupName == null || groupName.isEmpty() || !checkKey(groupName)) return null;
        else{
            TreeSet<String> tmp = getGroupOf(groupName);
            String max = "";
            for (String string : tmp) {
                if(max.compareTo(string) < 0) max = string;
            }
            return max;
        }
    }// end findShortestWordOfGroup
    
    /**
     * find the shortest words in MAP
     * @return: the words have shortest words in MAP
     */
    public String findShortestWordOfDictionary(){
        String shortest = "abcdefghijklmnopkostuvwxyz";
        for(TreeSet<String> tree : map.values()){
            for (String str : tree) {
                if(shortest.length() > str.length()) shortest = str; 
            }
        }
        return shortest;
    }
    
    
    /**
     * display All words symmetric, Palindrome
     * ex: "ex", "moon", "dad", "mom"
     */
    public void displayPalindromeWord(){
        System.out.println("Palindrome Words List: ");
        boolean flag = false;
        for(TreeSet<String> set : map.values()){
            for (String string : set) {
                String palindrome="";
                for(int i=string.length()-1; i>=0; i--){
                    palindrome += string.charAt(i);
                }
                if(palindrome.equals(string)){
                    System.out.println(palindrome);
                    flag=true;
                }
            }
        }
        if(!flag) System.out.println("Dictionary does not exist palindrome words!");
    }
    
    
    /**
     * update words 1 word in map
     * ex:
     *  case1: "a" -> "ant" -> OK
     *  case2: "a" -> "unban" -> OK
     *              remove "a" from group 1 and add to group "u"
     *              if(group u exist) -> add "unban"
     *              else -> create new TreeSet -> add unban to tree -> put to map
     *  case3:  "test" -> "testing" -> NOT OK (not exist test in map)
     * @param: words need to change
     * @return: true if successful
     */
    public boolean updateWord(String oldWords, String newWords){
        oldWords = formatString(oldWords);
        newWords = formatString(newWords);
        if(oldWords.isEmpty() || newWords.isEmpty()){
             System.out.println("Words must be non-empty");
             System.out.println("Old words removed");
             if(newWords.isEmpty()) removeWords(oldWords);
            return false;
        }
        if(removeWords(oldWords)){
            // both word are in the same group
            if(getKeyOf(oldWords).equalsIgnoreCase(getKeyOf(newWords)))
                if(newWords.contains(oldWords) || checkWord(newWords))
                    return false;
                else addWord(newWords);
            // both word are not in the same group
            else{
                TreeSet<String> tmpNewWords = getGroupOf(newWords);
                if(tmpNewWords == null){
                    tmpNewWords = new TreeSet<String>();
                    tmpNewWords.add(newWords);
                    map.put(getKeyOf(newWords), tmpNewWords);
                }  else tmpNewWords.add(newWords);
            }
            
        }else System.out.println("Words does not exist");
        return true;
    }
    
    
    public void backupData(String fileName){
        try {
            MyFileLib.writeTextFile(fileName, map);
            System.out.println("Backup complete");
        } catch (Exception e) {
            System.out.println("ERROR:");
        }
    }
}// end MyMap
