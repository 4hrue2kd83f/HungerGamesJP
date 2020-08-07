package abby.hgjp;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Item {
	enum itemTypes {
		ITEM, WEAPON, ARMOR_HEAD, ARMOR_BODY, ARMOR_LEGS, ARMOR_FEET, POTION
	}

	String name;
	JLabel icon;
	float damage;
	itemTypes type;

	public Item(String itemName, String fileName, float itemDamage, itemTypes itemType) throws IOException {
		name = itemName;
		damage = itemDamage;
		type = itemType;
		
		BufferedImage iconBI = ImageIO.read(new File(fileName));
		icon = new JLabel(new ImageIcon(iconBI));
	}

}
