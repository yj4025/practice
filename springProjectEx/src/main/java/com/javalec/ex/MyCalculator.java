package com.javalec.ex;

public class MyCalculator {
	private Calculator calculator;
	private int firstNum;
	private int secondNum;
	
	//calculator
	public Calculator getCalculator() {
		return calculator;
	}
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	//firstNum
	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	
	//secondNum
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public void add(){
		calculator.addition(firstNum, secondNum);
	}
	
	public void sub(){
		calculator.subtraction(firstNum, secondNum);
	}
	
	public void multi(){
		calculator.multiplication(firstNum, secondNum);
	}
	
	public void div(){
		calculator.division(firstNum, secondNum);
	}
}
