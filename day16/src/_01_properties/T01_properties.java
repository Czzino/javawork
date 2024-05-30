package _01_properties;

import java.io.IOException;
import java.util.*;

public class T01_properties {

	public static void main(String[] args) {

		// properties : Map계열 => 키 + 값
		// HashMap과의 차이 : properties에는 키 = String, 값 = String으로 담는다

		Properties prop = new Properties();

		// 값을 추가할떄-**                                                                                                                                                         
		// 1. setProperty(String key, String valuse)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		// 정렬 순서가 없음
		System.out.println(prop);

		// 2. getProperty(String key)
		// 값을 얻어 올떄

		System.out.println(prop.getProperty("Set"));
		System.out.println(prop.getProperty("AAA")); // 키가 존재하지 않으면 null

		// 파일경로 , 파일명
		// driver = oricle Oracle Driver
		// url jdbd this
		// userName = oracle
		// password = oracle 123
		
		// 파일로 내보내기
//		try {
//			prop.store(new FileOutputStream("test.properties"), "propertiesTest");
//
//			prop.storeToXML(new FileOutputStream("test.xml"), "propertiesTest");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}
