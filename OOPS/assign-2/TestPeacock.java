public class TestPeacock {
	static void showPeacock(Peacock p) {
		System.out.println("Displaying Peacock now...");
        System.out.println(p);
        System.out.println(p.isHighflying());
	}
	
	static void showInheritPeacock(InheritPeacock p) {
		System.out.println("Displaying Peacock now...");
        System.out.println(p);
        System.out.println(p.isHighflying());
	}
	
	public static void main(String[] args) {
		Peacock peacock = new Peacock(true,true,true);
		InheritPeacock ipeacock = new InheritPeacock(true,true,true);
		showPeacock(peacock);
		showInheritPeacock(ipeacock);
	}

}
