
public class Character extends Weapon{

	protected int attack;
	protected int defense;
	protected int hp;
	
	public Character() {
		// TODO Auto-generated constructor stub
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}

	public int getHp() {
		return hp;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
}
