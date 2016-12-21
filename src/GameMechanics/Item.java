/**
 * 
 */
package GameMechanics;

/**
 * @author Alex Dutton
 *
 */
public class Item {
	int Stack ;
	String Name;
	String Description;
	String Type;
	Item(String name,String desc,int stack,String type){
		Name = name;
		Description = desc;
		Type = type;
		Stack =stack;
	}
	public String toString(){
		return "Item: [Name: "+Name +", Description: " +Description + ",Stack size "+Stack+ ", Type: " + Type+"]";
	}
}
