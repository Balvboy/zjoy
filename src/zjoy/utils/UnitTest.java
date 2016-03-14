package zjoy.utils;

import java.io.IOException;

import zjoy.utils.stringUtil.StringHelper;
import zjoy.utils.stringUtil.StringUtilInterface;

public class UnitTest {
	public static void main(String[] args) throws IOException {
//		FileInterface helloWorld=new FileUtils();
//        InvocationHandler handler=new TimeCountHandler(helloWorld);
//        UtilProxyFactory<FileInterface> factory = new UtilProxyFactory<FileInterface>();
//        FileInterface util = factory.getUtilInstance(helloWorld.getClass(), handler);
//		util.copyFileToDest("e:\\b.zip", "e:\\b-io.zip",1024);
		
		
		
		UtilProxyFactory<StringUtilInterface> factory = new UtilProxyFactory<StringUtilInterface>();
		StringUtilInterface help = factory.getUtilInstance(StringHelper.class,new StringHelper());
		help.isEmpty(" help");
		
	}
}
