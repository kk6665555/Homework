package number1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

 class book6 {
	private Object[] elems;
	private int next;
	
	public book6(int capacity){
		elems=new Object[capacity];
	}
	
	public book6(){
		this(16);
	}
	
	public void add(Object o ){
		if(next==elems.length){
			elems=Arrays.copyOf(elems, elems.length*2);
		}
		elems[next++]=o;
	}
	
	public Object get(int index){
		return elems[index];
	}
	
	public int size(){
		return next;
	}
	public String toString(){	
		String a = "";
		for(int i = 0; i<elems.length;i++){
			if(elems[i]!=null){
			a+=elems[i]+"\n";
			}
	}
		return a;
	}

	

}


 public class Guest{
	public static void main(String[] args) {
		book6 names = new book6();
		collectNameto(names);
		System.out.println("¦W³æ:");
		printUpperCase(names);
		System.out.println("-----");
		System.out.println(names);
		
	}
	
	static void collectNameto(book6 names){
		Scanner console=new Scanner(System.in);
		while(true){
			System.out.println("³X«È:");
			String name = console.nextLine();
			if(name.equals("quit")){
				break;
			}
			names.add(name);
		}
	}
	
	static void printUpperCase(book6 names){
		for(int i = 0; i<names.size();i++){
			String name = (String) names.get(i);
			System.out.println(name.toUpperCase());
		}
	}
}
 