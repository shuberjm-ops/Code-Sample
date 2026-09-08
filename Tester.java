

public class Tester {

	public static void main(String[] args) {
		FixedArraySet set = new FixedArraySet(3);
		
		// Testing add
		System.out.println("Expected: true");
		System.out.println("Actual: " + set.add("a"));
		
		//Testing adding a duplicate
		System.out.println("Expected: false");
		System.out.println("Actual: " + set.add("a"));
		
		//Testing adding to a full set
		System.out.println("Expected: false");
		set.add("b");
		set.add("c");
		System.out.println("Actual: " + set.add("d"));
		
		//Test removing from an empty set
		FixedArraySet empty = new FixedArraySet();
		System.out.println("Expected: null");
		System.out.println("Actual: " + empty.remove());
		
		//Testing to array
		String[] arr = set.toArray();
		System.out.println("Expected Length: 3");
		System.out.println("Actual Length: " + arr.length);
		
		System.out.println("Expected first item: a");
		System.out.println("Actual first item: " + arr[0]);
		
		//Testing append
		FixedArraySet one = new FixedArraySet(3);
		one.add("a");
		one.add("b");
		FixedArraySet two = new FixedArraySet(3);
		two.add("b");
		two.add("c");
		
		FixedArraySet together = one.append(two);
		System.out.println("Expected together contains c: true");
		System.out.println("Actual together contains c: " + together.contains("c"));
		
		//Testing original sets remain unchanged
		System.out.println("Expected one contains c: false");
		System.out.println("Actual one contains c: " + one.contains("c"));
		
	}
	
}
