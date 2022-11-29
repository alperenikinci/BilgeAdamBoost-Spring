package com.bilgeadam.boost.solid.iyi;

public class TextLog implements ILog {

	@Override
	public void Log(String value) {
		System.out.println(value + " Text e kaydedildi.");
	}
	
}
