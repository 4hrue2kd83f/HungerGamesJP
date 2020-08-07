package abby.hgjp;

public class IItemStack {
	Item item;
	int amount = 1;

	public IItemStack(Item itemStack) {
		item = itemStack;
	}
	
	public IItemStack(Item itemStack, int itemAmount) {
		item = itemStack;
		int amount = itemAmount;
	}

}
