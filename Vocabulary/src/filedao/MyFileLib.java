package filedao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.TreeSet;

/**
 *
 * @author RaeKyo
 */
public class MyFileLib {
    public static ArrayList<String> loadData(String fileName) throws FileNotFoundException, IOException{
        ArrayList<String> list = new ArrayList();   
        
        // open file to load content to f variable (stream)
        FileReader f = new FileReader(fileName);
        
        // copy file to array2 to call readLine() functions 
        BufferedReader bf = new BufferedReader(f);
        
        // readData from bf
        while(bf.ready()){
            list.add(bf.readLine().trim());
        }
        
        // close reader
        f.close();
        bf.close();
        return list;
    }
    
    
    public static void writeTextFile(String fileName, HashMap<String,TreeSet<String>> map) throws FileNotFoundException{
        Collection<TreeSet<String>> values = map.values();
        PrintWriter w = new PrintWriter(fileName);
        for(TreeSet<String> t : values){
            if(t.size() > 0 ){
                for (String string : t) {
                    w.println(string);
                }
            }
        }
        w.close();
    }
}
