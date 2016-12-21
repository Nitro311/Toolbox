/**
 * 
 */
package SpaceGame;

import java.util.ArrayList;

/**
 * @author Alex Dutton
 *
 */
public class Sector {
	int X;
	int Y;
	ArrayList<Sector> Connections;
	Sector (int x,int y){
		X=x;
		Y=y;
		Connections = null;
	}
	Sector (int x, int y,ArrayList<Sector> connections){
		super();
		Connections = connections;		
	}
	public void connect(Sector connection){
		if (not(Connections.contains(connection))){
		Connections.add(connection);
		connection.Connections.add(this);
		}
	}
	/**
	 * @param true or false statement
	 * @return opposite
	 */
	private boolean not(boolean falseifyer) {
		if (falseifyer){
			return false;
		}else
			return true;
	}
	public void disconnect(Sector connected){
		if (Connections.contains(connected)){
			Connections.remove(connected);
			connected.Connections.remove(this);
		}
	}
}
