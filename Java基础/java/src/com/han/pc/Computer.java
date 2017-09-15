package com.han.pc;

/**
 * super¹Ø¼ü×Ö
 * 
 * @author Administrator
 *
 */
public class Computer extends Calcuator {
	public void play() {
	    super.play1();
	}

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.play1();
	}
}
