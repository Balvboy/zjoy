package zhou.utils;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;

import zhou.utils.file.FileInterface;
import zhou.utils.file.FileUtils;
import zhou.utils.file.NioFileUtils;
import zhou.utils.handler.TimeCountHandler;

public class UnitTest {
	public static void main(String[] args) throws IOException {
		FileInterface helloWorld=new FileUtils();
        InvocationHandler handler=new TimeCountHandler(helloWorld);
        UtilFactory<FileInterface> factory = new UtilFactory<FileInterface>();
        FileInterface util = factory.getUtilInstance(helloWorld.getClass(), handler);
		util.copyFileToDest("e:\\b.zip", "e:\\b-io.zip",1024);
	}
}
