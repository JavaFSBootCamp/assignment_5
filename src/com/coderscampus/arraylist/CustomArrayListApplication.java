package com.coderscampus.arraylist;

public class CustomArrayListApplication {

	public static void main(String[] args) {

		CustomList<String> myCustomList = new CustomArrayList<>();
		for(int i=0; i< 20; i++) {
			myCustomList.add("element "+ (i+1)); 
		}

		for (int i=0; i<myCustomList.getSize(); i++) {
		    System.out.println(myCustomList.get(i));
		}	
	}

}
