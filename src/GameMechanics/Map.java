/**
 * 
 */
package GameMechanics;

/**
 * @author Alex Dutton
 *
 */
public class Map {
	int Length;
	int Width;
	int Id;
	String Name;
	Map(String name,int id,int length,int width){
		Length = length;
		Width = width;
		Name = name;
		Id = id;
	}
}
