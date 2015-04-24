package com.sam.ds;

import com.sam.util.*;
public class Trie{
	public static void main(String args[]) {
		TNode root = new TNode(true,'/');
		addWord("/flapp/server/apache", root);
		addWord("/d/apps", root);
		addWord("/d/apps/pub", root);
		addWord("/flapp", root);
		addWord("/flocal/firms", root);
		addWord("/d/sw/java", root);
		addWord("/d/sw/orcl/jdbc", root);
		StringBuilder str = new StringBuilder("/");
		printTrie(root, str);
		
	}
	public static void addWord(String str, TNode root) {
		char c;
		for(int i = 0; i < str.length(); i++ ) {
			c = str.charAt(i);
			
			if(c == '/') {
				root.isPrefixWord = true;
				continue;
			}
			
			if(root.childrens[c-'a'] == null) {
				root.childrens[c-'a'] = new TNode(false,c);
			}
			root = root.childrens[c-'a'];
			
			if(root.endFlag) {
				break;
			}
		}
		
		root.endFlag = true;
		root.isPrefixWord = false;
		for(int i =0; i < 26; i++) {
			root.childrens[i] = null;
		}
	}
	
	public static void printTrie(TNode root, StringBuilder str) {
		if(root.endFlag) {
			System.out.println(str);
			return;
		}
		for(int i = 0; i < 26; i++) {
			if(root.childrens[i] != null) {
				str.append(root.childrens[i].value);
				if(root.childrens[i].isPrefixWord)
					str.append("/");
				printTrie(root.childrens[i], str);
				str.deleteCharAt(str.length()-1);
				if(root.childrens[i].isPrefixWord)
					str.deleteCharAt(str.length()-1);
			}
		}
	}
}