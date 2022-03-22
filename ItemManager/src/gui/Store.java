package gui;
import mylib.*;
import dto.*;
/**
 *
 * @author raekyo
 */
public class Store {
    public static void main(String[] args) {
        int choice=0;
        Inventory store = new Inventory();
        Item it = null;
        
        String[] option = {"Create Vase to Inventory", "Create Statue to Inventory",
            "Create Painting to Inventory", "Display all items in the Inventory", 
            "Update the Item by Index", "Remove the Item in the inventory",
            "Sort all Item by value","Exit"};
        
        
        do{
            choice = Menu.getChoice(option);
            
            switch(choice){
                case 1:  // create vase
                    it = new Vase();
                    it.inputItem();
                    if(store.addItem(it))
                        System.out.println("Added");
                    else System.out.println("Add Failed");
                    break; // after added it base is gone
                case 2: // create statue
                    it = new Statue();
                    it.inputItem();
                    if(store.addItem(it))
                        System.out.println("Added");
                    else System.out.println("Add Failed");
                    break;
                case 3: // create Painting
                    it = new Painting();
                    it.inputItem();
                    if(store.addItem(it))
                        System.out.println("Added");
                    else System.out.println("Add Failed");
                    break;
                case 4: // Display all
                    if(store.getCount() == 0) System.out.println("The store is empty");
                    else store.displayAll();
                    break;
                case 5: // Update by index
                    try{
                        int index=0;
                        index = Validation.inputPositiveNumber("Input index: ");
                        if(store.updateItemByIndex(index)){
                            System.out.println("After update:");
                            store.displayAll();
                        }
                    }catch(Exception e){System.out.println("No update");}
                    break;
                case 6: // remove by index
                    try{
                        int index=0;
                        index = Validation.inputPositiveNumber("Input index: ");
                        if(store.removeItemByIndex(index)){
                            System.out.println("After remove:");
                            store.displayAll();
                        }
                    }catch(Exception e){System.out.println("No removed");}
                    break;
                    

                    
                    
                default: break;
                    
            }
        }while(choice < option.length);
    }// end main
    
    
    
}// end Store
