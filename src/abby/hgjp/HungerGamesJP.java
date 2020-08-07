package abby.hgjp;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import abby.hgjp.Item.itemTypes;
import abby.hgjp.Tribute.Team;

public class HungerGamesJP {
	// Random generator
	static Random r = new Random();

	// Global variables
	static int stage = 0;

	// BufferedImages
	static BufferedImage abbyico;
	static BufferedImage stewartico;
	static BufferedImage cringeico;
	static BufferedImage iabico;
	static BufferedImage ugico;
	static BufferedImage ninjaico;
	static BufferedImage saturnico;
	static BufferedImage yevico;
	static BufferedImage macacoico;
	static BufferedImage l4ico;
	static BufferedImage stefico;
	static BufferedImage jakubico;
	static BufferedImage sealsiico;
	static BufferedImage breadico;
	static BufferedImage penguinico;
	static BufferedImage fuseico;

	static {
		try {
			abbyico = ImageIO.read(new File("resources/abby.png"));
			stewartico = ImageIO.read(new File("resources/stewart.png"));
			cringeico = ImageIO.read(new File("resources/cringe.png"));
			iabico = ImageIO.read(new File("resources/iab.png"));
			ugico = ImageIO.read(new File("resources/ug.png"));
			ninjaico = ImageIO.read(new File("resources/ninja.png"));
			saturnico = ImageIO.read(new File("resources/saturn.png"));
			yevico = ImageIO.read(new File("resources/yev.png"));
			macacoico = ImageIO.read(new File("resources/macaco.png"));
			l4ico = ImageIO.read(new File("resources/l4.png"));
			stefico = ImageIO.read(new File("resources/stef.png"));
			jakubico = ImageIO.read(new File("resources/jakub.png"));
			sealsiico = ImageIO.read(new File("resources/sealsi.png"));
			breadico = ImageIO.read(new File("resources/bread.png"));
			penguinico = ImageIO.read(new File("resources/penguin.png"));
			fuseico = ImageIO.read(new File("resources/fuse.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// JFrames
	static JFrame f = new JFrame("JetPunk Hunger Games");

	// JPanels
	static JPanel titleArea = new JPanel();
	static JPanel tributeImages = new JPanel();
	static JPanel textPanel = new JPanel();
	static JPanel nextPanel = new JPanel();

	// JLabels (Text)
	static JLabel title = new JLabel("JetPunk Hunger Games", SwingConstants.CENTER);
	static JLabel text = new JLabel("Press \"Next\" to begin", SwingConstants.CENTER);

	// JLabels (Image, Tributes)
	static JLabel abbypfp = new JLabel(new ImageIcon(abbyico));
	static JLabel stewartpfp = new JLabel(new ImageIcon(stewartico));
	static JLabel cringepfp = new JLabel(new ImageIcon(cringeico));
	static JLabel iabpfp = new JLabel(new ImageIcon(iabico));
	static JLabel ugpfp = new JLabel(new ImageIcon(ugico));
	static JLabel ninjapfp = new JLabel(new ImageIcon(ninjaico));
	static JLabel saturnpfp = new JLabel(new ImageIcon(saturnico));
	static JLabel yevpfp = new JLabel(new ImageIcon(yevico));
	static JLabel macacopfp = new JLabel(new ImageIcon(macacoico));
	static JLabel l4pfp = new JLabel(new ImageIcon(l4ico));
	static JLabel stefpfp = new JLabel(new ImageIcon(stefico));
	static JLabel jakubpfp = new JLabel(new ImageIcon(jakubico));
	static JLabel sealsipfp = new JLabel(new ImageIcon(sealsiico));
	static JLabel breadpfp = new JLabel(new ImageIcon(breadico));
	static JLabel penguinpfp = new JLabel(new ImageIcon(penguinico));
	static JLabel fusepfp = new JLabel(new ImageIcon(fuseico));

	// JButtons
	static JButton nextButton = new JButton("Next");

	// Tributes
	static Tribute abby = new Tribute("4hrue", abbypfp); // 4hrue, variable names can't start with numbers
	static Tribute stewart = new Tribute("Stewart", stewartpfp); // Stewart
	static Tribute cringe = new Tribute("CringeDragon", cringepfp); // CringeDragon
	static Tribute iab = new Tribute("IAB", iabpfp); // IAB
	static Tribute ug = new Tribute("UG", ugpfp); // UG
	static Tribute ninja = new Tribute("NinjaQKk", ninjapfp); // NinjaQKk
	static Tribute saturn = new Tribute("Saturn", saturnpfp); // Saturn
	static Tribute yev = new Tribute("Yev", yevpfp); // Yev/Jo
	static Tribute macaco = new Tribute("Macaco", macacopfp); // Macaco
	static Tribute l4 = new Tribute("TheLetter4", l4pfp); // TheLetter4
	static Tribute stef = new Tribute("Stef", stefpfp); // Stef
	static Tribute jakub = new Tribute("Jakub", jakubpfp); // Jakub
	static Tribute sealsi = new Tribute("Sealsi", sealsipfp); // Sealsi
	static Tribute bread = new Tribute("Bread", breadpfp); // Bread
	static Tribute penguin = new Tribute("Penguinish", penguinpfp); // Penguinish
	static Tribute fuse = new Tribute("Fuse", fusepfp); // Fuse

	static HashMap<String, Tribute> tributeNames = new HashMap<String, Tribute>();

	static final Tribute TRIBUTES[] = { abby, stewart, cringe, iab, ug, ninja, saturn, yev, macaco, l4, stef, jakub,
			sealsi, bread, penguin, fuse };
	static final List<Tribute> TEMPLATE = new LinkedList<Tribute>(Arrays.asList(TRIBUTES));

	static final Team TEAMS[] = { Team.HEART, Team.DIAMOND, Team.AMETHYST, Team.BANANA, Team.DREAM, Team.SQUID,
			Team.MANGO, Team.CREEPER };
	static final String TEAM_NAMES[] = { "Heart", "Diamond", "Amethyst", "Banana", "Dream", "Squid", "Mango",
			"Creeper" };

	// Items
	static Item woodenSword;
	static Item goldenSword;
	static Item stoneSword;
	static Item ironSword;
	static Item diamondSword;
	static Item netheriteSword;

	public HungerGamesJP() throws IOException {
		// ImageIcons
		ImageIcon img = new ImageIcon("ico.png");

		f.setSize(800, 500);
		f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setIconImage(img.getImage());

		titleArea.setSize(800, 100);
		tributeImages.setSize(800, 200);
		textPanel.setSize(800, 100);
		nextPanel.setSize(800, 100);

		tributeImages.setLayout(new BoxLayout(tributeImages, BoxLayout.X_AXIS));

		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 36));
		text.setFont(new Font(title.getFont().getName(), Font.PLAIN, 24));
		nextPanel.add(nextButton);
		textPanel.add(text);
		f.add(titleArea);
		f.add(tributeImages);
		f.add(textPanel);
		f.add(nextPanel);

		titleArea.add(title);
		f.setVisible(true);

	}

	public static void main(String[] args) throws IOException {
		new HungerGamesJP();
		initItems();

		List<Tribute> tributesWithoutTeams = new ArrayList<Tribute>(),
				tributesWithoutCornucopia = new ArrayList<Tribute>();

		tributesWithoutTeams.addAll(TEMPLATE);
		tributesWithoutCornucopia.addAll(TEMPLATE);

		// Event listener for "Next" button
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				tributeImages.removeAll();
				tributeImages.repaint();

				if (stage < 8) {
					title.setText("The Reaping");

					Tribute activeTribute1 = tributesWithoutTeams.get(randInt(tributesWithoutTeams.size()));
					activeTribute1.team = TEAMS[stage];
					tributesWithoutTeams.remove(activeTribute1);

					Tribute activeTribute2 = tributesWithoutTeams.get(randInt(tributesWithoutTeams.size()));
					activeTribute2.team = TEAMS[stage];
					tributesWithoutTeams.remove(activeTribute2);

					text.setText("<html>Team " + TEAM_NAMES[stage] + ": " + activeTribute1.formattedName() + " and "
							+ activeTribute2.formattedName() + "</html>");

					tributeImages.add(activeTribute1.icon);
					tributeImages.add(activeTribute2.icon);

					stage++;
				} else if (stage == 8) {
					title.setText("The Bloodbath");

					Tribute activeTribute1 = tributesWithoutCornucopia.get(randInt(tributesWithoutCornucopia.size()));
					double eventSeed = Math.random();

					if (eventSeed < 0.3) { // 40% chance to run from cornucopia
						text.setText("<html>" + activeTribute1.formattedNameWithHealth()
								+ " runs from the Cornucopia.</html>");
						tributeImages.add(activeTribute1.icon);
					} else { // 50% chance to find an item
						double itemSeed = Math.random();
						IItemStack foundItem;
						
						if (itemSeed < 0.2) {
							foundItem = new IItemStack(woodenSword);
						} else if (itemSeed < 0.3) {
							foundItem = new IItemStack(goldenSword);
						} else if (itemSeed < 0.55) {
							foundItem = new IItemStack(stoneSword);
						} else if (itemSeed < 0.75) {
							foundItem = new IItemStack(ironSword);
						} else if (itemSeed < 0.9) {
							foundItem = new IItemStack(diamondSword);
						} else {
							foundItem = new IItemStack(netheriteSword);
						}
						
						text.setText("<html>" + activeTribute1.formattedNameWithHealth()
								+ " finds a <b>" + foundItem.item.name + "</b>.</html>");
						tributeImages.add(activeTribute1.icon);
						tributeImages.add(foundItem.item.icon);
						
						activeTribute1.addItem(foundItem);
					}

					tributesWithoutCornucopia.remove(activeTribute1);

					if (tributesWithoutCornucopia.size() == 0) {
						stage++;
					}
				}
			}
		});
	}

	private static void initItems() throws IOException {
		woodenSword = new Item("Wooden Sword", "resources/items/weapon/wooden_sword.png", 4, itemTypes.WEAPON);
		goldenSword = new Item("Golden Sword", "resources/items/weapon/golden_sword.png", 4, itemTypes.WEAPON);
		stoneSword = new Item("Stone Sword", "resources/items/weapon/stone_sword.png", 5, itemTypes.WEAPON);
		ironSword = new Item("Iron Sword", "resources/items/weapon/iron_sword.png", 6, itemTypes.WEAPON);
		diamondSword = new Item("Diamond Sword", "resources/items/weapon/diamond_sword.png", 7, itemTypes.WEAPON);
		netheriteSword = new Item("Netherite Sword", "resources/items/weapon/netherite_sword.png", 8, itemTypes.WEAPON);
	}

	private static int randInt(int e) {
		if (e == 0) {
			return 0;
		} else {
			return new Random().nextInt(e);
		}
	}
}
