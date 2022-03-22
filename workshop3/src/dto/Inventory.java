package dto;
import java.util.ArrayList;

public class Inventory {
	private ArrayList<Guitar> list = new ArrayList<>();
	
	public Inventory(){};
	
	public void addGuitar(Guitar g){
		list.add(g);
	}
	
	public void searchGuitar(Guitar g){
		searchGuitar(g.getSerialNumber());
	}
	
	public void searchGuitar(String serialNumber){
		for(int i=0; i<list.size(); i++)
			if(list.get(i).getSerialNumber().equals(serialNumber))
				System.out.println("Guitar's serialNumber founded at: "+ list.indexOf(i));
		
	}
	
}// end Inventory
