package com.strings;

import java.util.ArrayList;
import java.util.List;

public class ToStringBuilder {

	private List<Pair> string = new ArrayList<Pair>();
	private String finalString;
	
	public ToStringBuilder(Object o){
		this.finalString = o.getClass().getName()+"[";
	}
	
	public ToStringBuilder append(String key, String value){
		string.add(new Pair(key, value));
		return this;
	}
	
	public String toString(){
		
		for(Pair attribute : string){
			finalString += attribute.getKey()+"="+attribute.getValue()+",";
		}
		finalString = finalString.substring(0, finalString.length()-1);
		finalString += "]";
		
		return finalString;
	}
	
}
