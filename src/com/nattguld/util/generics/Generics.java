package com.nattguld.util.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author randqm
 *
 */

public class Generics {

	
	/**
	 * Converts a list to an array and retrieves it.
	 * 
	 * @param list The list.
	 * 
	 * @return The array.
	 */
	@SuppressWarnings("unchecked")
	public static <T> T[] toArray(List<T> list) {
		if (list.isEmpty()) {
			return null;
		}
		T[] array = (T[]) new Object[list.size()];
		
		for (int i = 0; i < array.length; i ++) {
			array[i] = (T) list.get(i);
		}
		return array;
	}
	
	/**
	 * Retrieves an array as a list.
	 * 
	 * @param array The array.
	 * 
	 * @return The list.
	 */
	public static <T> List<T> toList(T[] array) {
		return toArrayList(array);
	}
	
	/**
	 * Retrieves an array as an array list.
	 * 
	 * @param array The array.
	 * 
	 * @return The array list.
	 */
	public static <T> ArrayList<T> toArrayList(T[] array) {
		return (ArrayList<T>) populateCollection(new ArrayList<>(), array);
	}
	
	/**
	 * Retrieves an array as a linked list.
	 * 
	 * @param array The array.
	 * 
	 * @return The linked list.
	 */
	public static <T> LinkedList<T> toLinkedList(T[] array) {
		return (LinkedList<T>) populateCollection(new LinkedList<>(), array);
	}
	
	/**
	 * Populates a collection from an array.
	 * 
	 * @param collection The collection.
	 * 
	 * @param array The array.
	 * 
	 * @return The populated collection.
	 */
	public static <T> Collection<T> populateCollection(Collection<T> collection, T[] array) {
		for (T entry : array) {
			collection.add(entry);
		}
		return collection;
	}

}
