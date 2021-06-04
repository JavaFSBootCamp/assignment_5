package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size =0;

	@Override
	public boolean add(T item) {
		if(size == items.length) {
			items = increaseArraySizeByDouble();
		}
		items[size++] = item;
		return true;
	}

	private Object[] increaseArraySizeByDouble() {
		Object[] newItems = new Object[size*2];
		int i=0;
		for(Object obj:items) {
			newItems[i++] = obj;
		}
		
		return newItems;
	}

	@Override
	public int getSize() {
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index){
		try {
			return (T) items[index];
		}catch(ArrayIndexOutOfBoundsException e) {
			throw new ArrayIndexOutOfBoundsException("Please provide a Valid! index.");
		}
	}
	
	
}
