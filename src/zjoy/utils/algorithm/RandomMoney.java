package zjoy.utils.algorithm;

import java.util.Random;

public class RandomMoney {

	public static double getRandomMoney(LeftMoneyPackage _leftMoneyPackage) {
		// remainSize 剩余的红包数量 
		// remainMoney 剩余的钱
		if (_leftMoneyPackage.remainSize == 1) {
			_leftMoneyPackage.remainSize--;
			//return (double) Math.round(_leftMoneyPackage.remainMoney * 100) / 100;
			return _leftMoneyPackage.remainMoney;
		}
		Random r = new Random();
		double min = 0.01; //
		double max = _leftMoneyPackage.remainMoney
				/ _leftMoneyPackage.remainSize * 2;
		double money = r.nextDouble() * max;
		money = money <= min ? 0.01 : money;
		money = Math.floor(money * 100) / 100;
		_leftMoneyPackage.remainSize--;
		_leftMoneyPackage.remainMoney -= money;
		return money;
	}
	
	public static void main(String[] args) {
		int size = 4;
		LeftMoneyPackage pac = new LeftMoneyPackage(size,30);
		double sum = 0;
		for(int i = 0;i<size;i++){
			double result = getRandomMoney(pac);
			System.out.println(result);
			sum +=result;
		}
		System.out.println("总数是："+sum);
	}
	
}
