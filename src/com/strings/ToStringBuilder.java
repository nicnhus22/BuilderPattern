package com.strings;

import java.util.ArrayList;
import java.util.List;

public class ToStringBuilder {

	private List<Pair> string = new ArrayList<Pair>();
	private String finalString;
	
	public ToStringBuilder append(String key, String value){
		string.add(new Pair(key, value));
		return this;
	}
	
	public String toString(){
		finalString = new String();
		
		for(Pair attribute : string){
			finalString += "the "+attribute.getKey()+" is "+attribute.getValue()+" ";
		}
		
		return finalString;
	}
	
	public String stringBeautifuler(String originalString){
		originalString = originalString.trim();
		originalString = originalString.substring(0, 1).toUpperCase() + originalString.substring(1);
		return originalString;
	}
	
}
