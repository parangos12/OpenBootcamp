package slnEjercicios789;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class E9 {

	public static void main(String[] args) {
		try {
			HashMap<Integer,ArrayList<String>> elementos=new HashMap<Integer,ArrayList<String>>();			
			
			InputStream periodicTable=new FileInputStream("C:\\Users\\USER\\Desktop\\Programación\\JAVA\\JAVAWorkSpace\\CourseJavaBasicOB\\Chemistry.txt");
			byte[] datos=periodicTable.readAllBytes();
			String pruebaf="";
			for (byte b : datos) {
				System.out.println(b);
					if (b==9 ||b==10) {
						pruebaf+=",";
					}else {
						pruebaf+=(char)b;
					}
			}
			String[] fin=pruebaf.split(",");
			for (int i = 0; i < fin.length; i+=4) {
				ArrayList<String> datosf= new ArrayList<String>(Arrays.asList(fin[i+1],fin[i+2],fin[i+3]));
				elementos.put(Integer.valueOf(fin[i]), datosf);
			}
			
			System.out.println(elementos.get(1));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
