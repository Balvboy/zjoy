package zjoy.research.innerClass;

/**
 * 
 * @Title: HyBridNature.java 
 * @projectName zhouUtils
 * @Description: 最简单版本的 使用内部类模拟实现 多继承，感觉然并卵
 * @date 2016年2月23日 下午4:58:29 
 * @version V1.0   
 * @author zhouyang
 * Copyright (c) 2015 北京企嘉科技有限公司  All rights reserved.
 */
public class HyBridNature {
	
	private ElmentA a = new ElmentA();
	
	private ElmentB b = new ElmentB();
	
	public void fly(){
		a.fly();
	}
	
	public void run(){
		b.run();
	}
	
	class ElmentA extends Bird{
		
	}
	
	class ElmentB extends Animal{
		
	}
}
