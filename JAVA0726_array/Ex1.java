package JAVA0726_array;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
	/* 
	 * ArrayList
	 * -배열의 확장이 가능한 객체
	 * 
	 */
		
	ArrayList<String> arr = new ArrayList<String>();	
	arr.add("홍길동");
	arr.add("우영우");
	arr.add("동그라미");
	
	
	for(int i = 0; i < arr.size();i++) {
		System.out.println(arr.get(i));
	}
	
	arr.add("비둘기");
	arr.add("너구리");

	for(int i = 0; i < arr.size();i++) {
		System.out.println(arr.get(i));
	}
		
	
//	ArrayList<int> arr2 = new ArrayList<int>(); => <>기본데이터 타입을 지정할 수 없음!!!
//	=>기본데이터 타입 8개와 1:1로 대응하는 Wrapper 클래스를 지정하면 됨
	ArrayList<Integer> arr2 = new ArrayList<Integer>();
			/*
			byte = Byte
			short = Short
			int = Integer
			long = Long
			char = Character
			boolean = Boolean
			float = Float
			double = Double
			*/
	}

}
