package com.java.exam;

public abstract class MyClasses implements Interface1, Interface2  {
	public void f() { }
	public void g() { }
}
interface Interface1 
{
	int VAL_A = 1;
	int VAL_B = 2;
	void f();
	void g();
}
interface Interface2 
{
	int VAL_B = 3;
	int VAL_C = 4;
	void g();
	void h();

	

}
