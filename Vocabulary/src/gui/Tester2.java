package gui;

import dto.MyMap;
import filedao.MyFileLib;

/**
 *
 * @author RaeKyo
 */
public class Tester2 {
    public static void main(String[] args) {
        MyMap map = new MyMap();
        map.init("WordsList.txt");
        map.displayWords();

        map.backupData("backup.txt");
    }
}
