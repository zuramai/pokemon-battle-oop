package pokemon;

import utils.Color;

public class PokemonStats {
	private int level;
	private int hp;
	private int exp;
	private int attack;
	private int def;
	private int agility;

	private final int MAX_LEVEL = 10;
	
	public PokemonStats(int hp, int exp, int attack, int def, int agility) {
		this.hp = hp;
		this.exp = exp;
		this.attack = attack;
		this.def = def;
		this.agility = agility;
	}

	public void checkExp(Integer[] thresolds) {
		if(this.exp > thresolds[this.level]) {
			this.level = this.level < MAX_LEVEL ? this.level+1 : this.level;
			System.out.println(Color.ANSI_CYAN + "Level Up! Your level now: "+this.level+Color.ANSI_RESET);
		}
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getExp() {
		return exp;
	}
	public void addExp(float exp) {
		this.exp += exp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getAgility() {
		return agility;
	}
	public void setAgility(int agility) {
		this.agility = agility;
	}
	
}
