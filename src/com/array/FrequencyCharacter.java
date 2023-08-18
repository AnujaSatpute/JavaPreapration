package com.array;

import java.util.Arrays;


public class FrequencyCharacter {
	void frequencyChar(char ch[]) {
		boolean[] br = new boolean[ch.length];
		Arrays.fill(br, true);
		for (int i = 0; i < ch.length; i++) {
			int cnt = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					cnt++;
					br[j]=false;
				}
			}
			if (br[i] == true) {
				System.out.println(ch[i] + " => " + cnt);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] = { 'a', 'b', 'c', 'd', 'c', 'a', 'b', 'd', 'd', 'a', 'a' };
		FrequencyCharacter obj1 = new FrequencyCharacter();
		obj1.frequencyChar(arr);
	}

}
