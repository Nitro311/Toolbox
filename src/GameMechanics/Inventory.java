/**
 * 
 */
package GameMechanics;

import java.util.ArrayList;

/**
 * @author Alex Dutton
 *
 */
public class Inventory {
	Player Player;
	int Size;
	String Type;
	String Name;
	ArrayList <Item> Contents;
	/**
	 * 
	 * @param player1
	 * @param size
	 * @param contents
	 */
	Inventory (Player player1,int size){
		Player = player1;
		Size = size;
		Name = Player.Name + "'s Inventory";
		Contents = new ArrayList<Item>();
	}
	Inventory (Player player1,int size,ArrayList<Item> contents){
		Player = player1;
		Size = size;
		Name = Player.Name + "'s Inventory";
		Contents = contents;
	}
	Inventory (String type, int size,ArrayList<Item> contents){
		Size = size;
		Name = type;
		Player = null;
		Contents = contents;
	}
	public String toString(){
		return "Inventory: ["+Name+" contains" + Contents +" and can hold "+Size+" items]";
	}
	public void delete(int itemNumber){
		Contents.remove(itemNumber-1);
	}
	public void delete (Item obj) {
		if (Contents.contains(obj)){
			Contents.remove(obj);
		}
		else{
			return;
		}
	}
	public void add(Item obj){
		Contents.add(obj);
	}
	public Item identify(int itemNumber){
		return Contents.get(itemNumber-1);
	}
	public int indexOf(Item item){
		return Contents.indexOf(item);
	}
	public boolean contains(Item item){
		return Contents.contains(item);
	}
	public void moveTo(int itemNumber, Inventory other){
		Item item = Contents.get(itemNumber-1);
		other.add(item);
		Contents.remove(itemNumber);
	}
	public void moveTo(Item item, Inventory other){
		int index = Contents.indexOf(item);
		
		if (index < 0)
			return;
		Item foundItem = Contents.get(index);
		other.add(foundItem);
		Contents.remove(foundItem);
	}
}
