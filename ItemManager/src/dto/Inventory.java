package dto;

/**
 * Storing Item = Array object
 * Default array as null
 * @author raekyo
 */
public class Inventory {
    private int count;
    private Item[] arr; // storing Item based on [count] obj
    private final int MAX=5;
    
    public Inventory(){
        count=0;
        arr = new Item[MAX];
    }

    public Inventory(int count, Item[] arr) {
        this.count = count;
        this.arr = arr;
    }

    public int getCount() {
        return count;
    }

//    public void setCount(int count) {
//        this.count = count;
//    }

    public Item[] getArr() {
        return arr;
    }

    public void setArr(Item[] arr) {
        this.arr = arr;
    }
    

    /**
     * add the object from Item hierarchy to array Inventory
     * @param it : use Item class to created, so can use child class as Input
     * @return: 1 if successful, 0 if unsuccessful 
     */
    public boolean addItem(Item it){
        if(count >= MAX) return false; // the array is full
        arr[count] = it;
        count++;
        return true;
    }// end addItem
    
    
    
    /**
     * display all the properties of all item
     */
    public void displayAll(){
        // arr.length = MAX array
        // count = current array length aready stored
        System.out.println("-----------------------------------");
        for(int i=0; i<count; i++){
            if(arr[i] instanceof Vase) System.out.println("Vase:");
            else if(arr[i] instanceof Statue) System.out.println("Statue:");
            else System.out.println("Painting:");
            arr[i].outputItem(); // don't need to use instanceof

//            System.out.println(arr[i]); // mean arr[i].toString
//            System.out.println(i+1 + ". "+ arr[i]);
            
        }
        System.out.println("-----------------------------------");
    }// end displayAll
    
    
    
    /**
     * find the item by the value inputted, return INDEX
     * @param value: the value of item need to search
     * @return the index of the value founded firstly
     */
    public int searchItemByValue(int value){
        for(int i=0; i<count; i++){
            if(arr[i].getValue() == value) return i;// fouded
            
        }
        return -1; // not founded
    }// end searchByItemByValue()
    
    
    
    /**
     * find the item by the value inputted, return INDEX
     * @param value: the value of item need to search
     * @return : all the index founded in array
     */
    public int[] searchItemsByValue(int value){
        int[] res = new int[MAX]; // length of the res[] = length of current array
        int countRes = 0;
        for(int i=0; i<count; i++){
            if(arr[i].getValue() == value) res[countRes++] = value;
        }
        return res;
    }// end searchItemsByvalue()
    
    
    
    /**
     * update the profile of the item in array
     * @param index: index of the item 
     * @return : if update successful return true else return false
     */
    public boolean updateItemByIndex(int index){
        if(index<0 || index>count) return false;
        arr[index].inputItem();
        return true;
    }
    
    /**
     * remove the item by item inputted
     * @param index: index inputted must be <= count or else return false
     * @return : return tre if removed successful or else return false
     */
    public boolean removeItemByIndex(int index){
        if(index<0 || index>count) return false; // bad input
        
        // shift the index's position
        for(int i=index; i<count; i++)
            arr[i] = arr[i+1];
        
        // remove 1 item
        count--;
        
        return true;
    }// end remove Item By Index
    
    
    
    /**
     * sort the Item by value 
     */
    public void sortItemByValue(){
        for(int i=0; i<count; i++){
            for(int j=0; j<count; j++){
                if(arr[i].getValue() > arr[j].getValue()){
                    Item tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }// end comparasion    
            }// end for(j)
        }// end for(i)
    }// end sortItemByValue()
    
}// end Inventory
