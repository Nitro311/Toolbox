/**
 * 
 */
package GameMechanics;

import java.util.Random;

import Geometry.MathX;

/**
 * @author Alex Dutton
 *
 */
public class Weapon extends Item{

	/**
	 * @param name
	 * @param desc
	 * @param stack
	 * @param type
	 */
	int DamageMin;
	int DamageMax;
	int Range;
	int DamageDecay;
	Weapon(String name, String desc, int stack, String type, int damagemin, int damagemax) {
		super(name, desc, stack, type);
		damagemin = DamageMin;
		damagemax = DamageMax;
		Range = 1;
	}
	Weapon(String name, String desc, int stack, String type, int damagemin, int damagemax,int range){
			super(name, desc, stack, type);
			Range=range;
	}
	Weapon(String name, String desc, int stack, String type, int damagemin, int damagemax,int range,int damagedecay){
		super(name, desc, stack, type);
		Range=range;
		DamageDecay= damagedecay;
	}
	public int Attack(int Min,int Max){
		return MathX.randInt(Min, Max);
	}
}
