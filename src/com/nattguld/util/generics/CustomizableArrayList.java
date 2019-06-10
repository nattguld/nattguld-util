package com.nattguld.util.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author randqm
 *
 * @param <T>
 */

@SuppressWarnings("serial")
public class CustomizableArrayList<T> extends ArrayList<T> {
	
	
	/**
	 * Replaces an element in the list.
	 * 
	 * @param originalElement The original element.
	 * 
	 * @param newElement The new element.
	 */
	public void replace(T originalElement, T newElement) {
		int index = indexOf(originalElement);
		
		remove(index);
		add(index, newElement);
	}
	
	/**
	 * Moves an element up in the list.
	 * 
	 * @param element The element to move up.
	 */
	public void moveUp(T element) {
		int index = indexOf(element);
		
		if (index != 0) {
			T above = get(index - 1);
			
			remove(above);
			add(index, above);
		}
	}
	
	/**
	 * Moves an element down in the list.
	 * 
	 * @param element The element to move down.
	 */
	public void moveDown(T element) {
		int index = indexOf(element);
		
		if (index != (size() - 1)) {
			T below = get(index + 1);
			
			remove(below);
			add(index, below);
		}
	}
	
	/**
	 * Duplicates the list.
	 * 
	 * @return The duplicated list.
	 */
	public List<T> duplicate() {
		List<T> duplicatedList = new CustomizableArrayList<>();
		
		for (int i = 0; i < size(); i ++) {
			duplicatedList.add(get(i));
		}
		return duplicatedList;
	}

}
