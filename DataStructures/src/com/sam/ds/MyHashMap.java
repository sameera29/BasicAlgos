package com.sam.ds;

import java.util.ArrayList;

public class MyHashMap<K,V>{

	MyEntry<K,V>[] map = new MyEntry[16];
	int siz;
	
	 static class  MyEntry<K,V>{
		private   K key;
		private  V value;
		
		public MyEntry(K key, V value){
			this.key = key;
			this.value = value;
		}
		public K getKey(){
			return key;
		}
		
		public V getVal(){
			return value;
		}
		
		public void setVal(V value){
			this.value = value;
		}
		
		public void setKey(K key){
			this.key = key;
		}
		
	}
	 
	 public  void put(K key, V val){
		 	
	 }
	 
	
	
}