package zjoy.utils.algorithm;

public class LeftMoneyPackage {

	public double remainSize;
	public double remainMoney;
	
	public LeftMoneyPackage(int size,int money){
		this.remainSize = size;
		this.remainMoney = money;
	}

	public double getRemainSize() {
		return remainSize;
	}

	public void setRemainSize(double remainSize) {
		this.remainSize = remainSize;
	}

	public double getRemainMoney() {
		return remainMoney;
	}

	public void setRemainMoney(double remainMoney) {
		this.remainMoney = remainMoney;
	}
	
	
	
}
