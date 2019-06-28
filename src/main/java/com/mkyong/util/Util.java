package com.mkyong.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Util {
	@Value("${welcome.message}")
	private String message ;
	@Value("${author}")
	private String author ;
	public Util() {
		System.out.println("*********************creating uitl **************************");
	}

	public String getMessage(){
		System.out.println("author>>>" + author);
		return author;  
	}
}
