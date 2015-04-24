package com.sam.util;



public class TNode {
	public boolean endFlag;
	public TNode[] childrens;
	public boolean isPrefixWord;
	public char value;
	public boolean isRoot;
	
	public TNode(boolean isRoot, char value) {
		childrens = new TNode[26];
		endFlag = false;
		isPrefixWord = false;
		this.isRoot = isRoot;
		this.value = value;
	}
 }