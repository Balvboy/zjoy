package zjoy.utils.stringUtil;

import zjoy.utils.UtilInterface;
import zjoy.utils.annotation.Log;

public class StringHelper implements StringUtilInterface{

	@Log
	public boolean isEmpty(String content){
		return content.equals("")||content==null;
	}

	@Override
	public void util() {
		System.out.println("StringHelper");
	}

}
