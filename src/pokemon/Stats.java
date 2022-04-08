package pokemon;

public class Stats {
	private int hp;
	private int exp;
	private int attack;
	private int def;
	private int agility;
	
	public Stats(int hp, int exp, int attack, int def, int agility) {
		this.hp = hp;
		this.exp = exp;
		this.attack = attack;
		this.def = def;
		this.agility = agility;
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
	public void setExp(int exp) {
		this.exp = exp;
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
