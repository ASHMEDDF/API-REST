package com.learn.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Greeting {	
	
	private final long id;
	private final String content;
			

	public Greeting(long incrementAndGet, String content) {
		this.content = content;
		this.id = incrementAndGet;
		
	}
	public String getContent() {
		return content;
	}
	public long getId() {
		return id;
	}
	
}
