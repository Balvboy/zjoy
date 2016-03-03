package zjoy.utils;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;

import zjoy.utils.file.FileInterface;
import zjoy.utils.file.FileUtils;
import zjoy.utils.file.NioFileUtils;
import zjoy.utils.handler.TimeCountHandler;

public class UnitTest {
	public static void main(String[] args) throws IOException {
		FileInterface helloWorld=new FileUtils();
        InvocationHandler handler=new TimeCountHandler(helloWorld);
        UtilFactory<FileInterface> factory = new UtilFactory<FileInterface>();
        FileInterface util = factory.getUtilInstance(helloWorld.getClass(), handler);
		util.copyFileToDest("e:\\b.zip", "e:\\b-io.zip",1024);
	}
}
