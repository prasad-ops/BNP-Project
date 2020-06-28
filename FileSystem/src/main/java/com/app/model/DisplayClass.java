package com.app.model;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class DisplayClass implements Display {

	@Override
	public void display() {
	
		String dir;
		dir="/home/ubuntu/sampleproject/";
		File fileDir = new File(dir);
		if(fileDir.isDirectory()){

			List<String> listFile = Arrays.asList(fileDir.list());
			
			Collections.sort(listFile);
			System.out.println("---------------------------------------\n");
			System.out.println("Sorting by filename in ascending order\n");
			System.out.println("---------------------------------------");

			for(String s:listFile){
				System.out.println(s);
			}
			
			System.out.println("---------------------------------------\n");

		}
		//else{
			//System.out.println(fileDir.getAbsolutePath() + " is not a directory");
		//}
	}
	

}
