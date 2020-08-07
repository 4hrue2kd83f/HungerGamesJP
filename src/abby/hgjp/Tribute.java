package abby.hgjp;

import java.util.ArrayList;

import javax.swing.JLabel;

public class Tribute implements Cloneable {
	enum Team {
		HEART, DIAMOND, AMETHYST, BANANA, DREAM, SQUID, MANGO, CREEPER
	}

	public String name;
	public float health = 20.0f;
	public float maxHealth = 20.0f;
	public String teamName;
	public ArrayList<IItemStack> inventory = new ArrayList<IItemStack>();
	public JLabel icon = null;
	public Team team;

	public Tribute(String tributeName, JLabel tributeIcon) {
		name = tributeName;
		icon = tributeIcon;
	}

	public Tribute(String tributeName) {
		name = tributeName;
	}

	public String formattedName() {
		switch (team) {
		case HEART:
			return "<span style=\"color:#DC143C;\">" + name + "</span>";
		case DIAMOND:
			return "<span style=\"color:#1E90FF;\">" + name + "</span>";
		case AMETHYST:
			return "<span style=\"color:#FF69B4;\">" + name + "</span>";
		case BANANA:
			return "<span style=\"color:#DAA520;\">" + name + "</span>";
		case DREAM:
			return "<span style=\"color:#6A5ACD;\">" + name + "</span>";
		case SQUID:
			return "<span style=\"color:#000080;\">" + name + "</span>";
		case MANGO:
			return "<span style=\"color:#FF8C00;\">" + name + "</span>";
		case CREEPER:
			return "<span style=\"color:#3CB371;\">" + name + "</span>";
		default:
			return name;
		}
	}

	public String formattedNameWithHealth() {
		switch (team) {
		case HEART:
			return "<span style=\"color:#DC143C;\">" + name + " (Health: " + this.health + ")</span>";
		case DIAMOND:
			return "<span style=\"color:#1E90FF;\">" + name + " (Health: " + this.health + ")</span>";
		case AMETHYST:
			return "<span style=\"color:#FF69B4;\">" + name + " (Health: " + this.health + ")</span>";
		case BANANA:
			return "<span style=\"color:#DAA520;\">" + name + " (Health: " + this.health + ")</span>";
		case DREAM:
			return "<span style=\"color:#6A5ACD;\">" + name + " (Health: " + this.health + ")</span>";
		case SQUID:
			return "<span style=\"color:#000080;\">" + name + " (Health: " + this.health + ")</span>";
		case MANGO:
			return "<span style=\"color:#FF8C00;\">" + name + " (Health: " + this.health + ")</span>";
		case CREEPER:
			return "<span style=\"color:#3CB371;\">" + name + " (Health: " + this.health + ")</span>";
		default:
			return name;
		}
	}

	public boolean isInInventory(IItemStack item) {
		return inventory.contains(item);
	}

	public void addItem(IItemStack item) {
		inventory.add(item);
	}

	public void damage(float amt) {
		health -= amt;
	}

	public void heal(float amt) {
		health += amt;
	}
}
