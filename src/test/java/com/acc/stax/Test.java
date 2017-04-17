package com.acc.stax;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String l = null;
		 /*switch (l) {
		case "":
			
			break;

		default:
			break;
		}*/
		/*if("".equals(l)){
			
		}*/
		try(InputStream y = new FileInputStream(new File(".\\src\\myCalendar.xml"))){
			throw new Exception();
		}catch (Exception e) {
			// TODO: handle exception
		//	e.printStackTrace();
         System.out.println(e.getSuppressed().hashCode());
		}

	}

}
