package kr.test.start;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

import kh.java.trie.Trie;



public class Start{
	public static void main(String args[]) {
		Trie trie = new Trie();
		
		trie.insert("apple",1);
		trie.insert("approve",2);
		trie.insert("air",3);
		trie.insert("appa",4);
		trie.insert("appb",5);
		
		System.out.println("search : true of false");
		System.out.println(trie.search("apple"));
		System.out.println(trie.search("archive"));
		
		System.out.println();
		
		System.out.println("search : as map");
		System.out.println(trie.searchAsMap("apple"));
		System.out.println(trie.searchAsMap("archive"));
		
		System.out.println();
		
		System.out.println("auto complete");
		System.out.println("a : " + trie.allWordsWithPrefix("a"));
		System.out.println("ai : " + trie.allWordsWithPrefix("ai"));
		
		trie.insert("doubles", 6);
		trie.insert("yoon", 7);
		trie.insert("kim", 8);
		trie.insert("park", 9);
		trie.insert("lee", 10);
		trie.insert("choi", 11);
		
		System.out.println();
		
		System.out.println("sort");
		trie.sort();
		
		System.out.println();
		Trie trieForCommonPrefix = new Trie();
		
		trieForCommonPrefix.insert("hope", 1);
		trieForCommonPrefix.insert("hobby", 2);
		trieForCommonPrefix.insert("horror", 3);
		trieForCommonPrefix.insert("honor", 4);
		trieForCommonPrefix.insert("hospital", 5);
		trieForCommonPrefix.insert("horse", 6);
		System.out.println("longest common prefix : " + trieForCommonPrefix.longestCommonPrefix());
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			String s = sc.next();
			
			System.out.printf("%s : %s\n",s,trie.allWordsWithPrefix(s));
		}
	}
}