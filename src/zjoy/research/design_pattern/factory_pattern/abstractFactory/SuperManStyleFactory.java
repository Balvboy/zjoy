package zjoy.research.design_pattern.factory_pattern.abstractFactory;

/**
 * 
 * @Description: 抽象工厂是用来创造一系列的产品，它的缺点在于对于产品线的扩充会比较无力
 * 				 真是的应用应该是，没个方法里创建一个对用部位的对象，然后这个superman工厂
 * 				创建的是里面每一个方法创建的对象的集合 
 * @date 2016年3月4日 上午10:08:27 
 * @author zhouyang
 */
public class SuperManStyleFactory implements AvatarAbstractFactory {

	@Override
	public void hairStyle() {
		System.out.println("板寸");
	}

	@Override
	public void hat() {
		System.out.println("没有帽子");
	}

	@Override
	public void glass() {
		System.out.println("没有眼镜");
	}

	@Override
	public void tshirt() {
		System.out.println("前面印有S字母的蓝色T恤");
	}

	@Override
	public void pants() {
		System.out.println("蓝色紧身裤，内裤外穿");
	}

	@Override
	public void shoes() {
		System.out.println("光脚");
	}

	@Override
	public void skinColor() {
		System.out.println("black");
	}

	@Override
	public void desc() {
		hairStyle();
		hat();
		glass();
		tshirt();
		pants();
		shoes();
		skinColor();
	}
	
	

}
