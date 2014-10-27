package com.xiaoju.qa.tools.logParser.test.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class  Threads implements Runnable{ 
    private String path; //文件路径
    //随机字段，用来过滤日志
    private static final String[] wtb = { "am", "pm", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday", "january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december", "gmt", "ut", "utc", "est", "edt", "cst", "cdt", "mst", "mdt", "pst", "pdt" };
    Threads(String path){ 
        this.path=path; 
    } 
    public void run(){ 
        while(true){ 
            try {
            	FileWriter writer = new FileWriter(path, true);  
            	writer.write("NOTICE: "+new Date()+" [3769188250012987073][pushorder.cpp:115][execute] task:kkk|"+wtb[(int) Math.random()]+"|sdf|222|234|ooo");  
            	writer.write("\n");
            	writer.close();  
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
        } 
    } 
}
