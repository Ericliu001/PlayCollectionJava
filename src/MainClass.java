import java.util.HashSet;


public class MainClass {
	public static void main(String[] args) {

		useHashSet();
		
	}

	private static void useHashSet() {
		String[] s = {"coco", "orange", "pear", "apple", "watermelon", "coco", "apple"};
		
		HashSet<String> set1  = new HashSet<>();
		HashSet<String> repeatSet = new HashSet<>();
		
		for (String fruit: s) {
			if(!set1.add(fruit)){
				repeatSet.add(fruit);
			}
		}
		
		set1.removeAll(repeatSet);
		System.out.print(set1);
		System.out.print("\n");
		System.out.print(repeatSet);
	}

}
