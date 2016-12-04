package com.sd.ch8.p5;

class Hello{
	private String name;
	public Hello(String name){
		this.name = name;
	}
	public void sayHello(){
		System.out.println("Hello "+name);
	}
	public static void main(String[] args){
		Hello[] h = new Hello[5];
		h[0] = new Hello("KHB");
		h[1] = new Hello("JMJ");
		h[2] = new Hello("KHJ");
		h[3] = new Hello("JMB");
		h[4] = new Hello("KMB");
		for(Hello e:h){
			e.sayHello();
		}
	}
}