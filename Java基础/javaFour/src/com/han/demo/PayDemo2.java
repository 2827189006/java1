package com.han.demo;

import java.util.Scanner;

/**
 * 
 * @author ����if���
 *
 */
public class PayDemo2 {
	public static void main(String[] args) {
		int score;
		char grade;
		Scanner shuru = new Scanner(System.in);
		System.out.println("���������");
		score = shuru.nextInt();
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		}else if (score >= 70) {
			grade = 'C';
		}else if (score >= 60) {
			grade = 'D';
		}else {
			grade = 'E';
		}
		System.out.println("����Ϊ��"+score);
		System.out.println("�ȼ�λ��"+grade);
		
	}
}
