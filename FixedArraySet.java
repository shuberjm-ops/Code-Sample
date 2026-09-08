/**
 * Implements a set of strings using a fixed-length array.
 * Does not necessarily maintain the order of the elements.
 * 
 */
public class FixedArraySet {
	
	// need exactly 2 instance variables
	private String[] data;
	private int size;
	
	/**
	 * Constructs a new empty set, with specified capacity
	 * @param capacity the max number of elements this set can contain
	 */
	public FixedArraySet(int capacity) {
		this.data = new String[capacity];
		this.size = 0;
	}
	
	/**
	 * Constructs a new empty set, with a predetermined, default capacity of 10
	 */
	public FixedArraySet() {
		this.data = new String[10];
		this.size = 0;
	}
	
	// Updated version of the add method, checks for length and duplicates
	public boolean add(String s) {
		if (this.size == this.data.length) {
			return false;
		}
		if (indexOf(s) != -1) {
			return false;
		}
		this.data[this.size] = s;
		this.size++;
		return true;
	}
	
	/**
	 * Returns whether this set is empty
	 * @return true if this set is empty, and false otherwise
	 */
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	/**
	 * Returns the size of this set
	 * @return the size of this set
	 */
	public int size() {
		return this.size;
	}
	
	/**
	 * Returns the set as a string, with a space separating each element
	 * @return the set as a string
	 */
	public String toString() {
		String result = "";
		
		// loop to add all the elements of the set
		// to the string
		for (int i = 0; i < this.size; i++) {
			result += this.data[i] + " ";
		}
		
		return result.trim(); // gets rid of trailing spaces
	}
	
	/**
	 * Loops through the set to find the position within it an element is located. Accounts for the element
	 * potentially not being in the set
	 * @param s - The element being searched for within a set
	 * @return - the position within the set the element was found. If the
	 * element could not be found, returns -1
	 */
	private int indexOf(String s) {
		for (int i = 0; i < this.size; i++) {
			if (this.data[i].equals(s)) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Loops through the set and returns if an element is found in it or not
	 * @param s - the element being searched for
	 * @return - if the element was found or not
	 */
	public boolean contains(String s) {
		return indexOf(s) != -1;
	}
	
	/**
	 * Loops through the set and removes the specified element if it is in the set, returning true
	 * if an element was removed or false if it wasn't
	 * @param s - the element to be removed
	 * @return - if that element was removed or not
	 */
	public boolean remove(String s) {
		int index = indexOf(s);
		if (index == -1) {
			return false;
		}
		this.data[index] = this.data[this.size - 1];
		
		this.data[this.size - 1] = null;
		this.size--;
		return true;
	}
	
	/**
	 * Removes the last element in a set, returning true if it did and false if it couldn't
	 * @return - weather the last element in the set was removed or not
	 */
	public String remove() {
		if (this.size == 0) {
			return null;
		}
		String removed = this.data[this.size - 1];
		this.data[this.size - 1] = null;
		this.size--;
		return removed;
	}
	
	/**
	 * Empties out a set, setting all values within it to null
	 */
	public void clear() {
		for (int i = 0; i < this.size; i++) {
			this.data[i] = null;
		}
		this.size = 0;
	}
	
	/**
	 * Converts the data in a set to an array, excluding any null elements within it
	 * @return - an array of the data without null elements
	 */
	public String[] toArray() {
		String[] result = new String[this.size];
		for (int i = 0; i < this.size; i++) {
			result[i] = this.data[i];
		}
		return result;
	}
	
	/**
	 * Creates a new Fixed-Array Set by placing two sets one after another
	 * @param other - the fixed-array set that is being added to the end of the first set
	 * @return - a new set that contains the data of the first and other sets, with a size equal
	 * to the combined size of the two original sets
	 */
	public FixedArraySet append(FixedArraySet other) {
		FixedArraySet result = new FixedArraySet(this.size + other.size);
		for (int i = 0; i < this.size; i++) {
			result.add(this.data[i]);
		}
		for (int i = 0; i < other.size; i++) {
			result.add(other.data[i]);
		}
		return result;
	}

}
