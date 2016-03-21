package com.baozi.tools.logParser.test.utils;

public class LogFilterGenerator {

	public static void main(String[] args) {
		generate();

	}
	
    static void generate(){
    	Threads t1 = new Threads("./result.log");
    	Thread generator = new Thread(t1);
    	generator.start();
    }

}
