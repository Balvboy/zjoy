package zjoy.utils.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;

public class NioFileUtils implements FileInterface {

	@Override
	public void util() {
		System.out.println("名称 : "+ NioFileUtils.class.getName());
		Method[] ms = NioFileUtils.class.getDeclaredMethods();
		System.out.println("方法 ：");
		for(Method m : ms){
			System.out.println("\t"+m.getName());
		}
	}

	@Override
	public void copyFileToDest(String sourceFile, String destFile) throws IOException {
		 //把inputstream 写入文件
	    FileInputStream input = null;
	    FileOutputStream output = null;
	    FileChannel fileChannel = null;
	    FileChannel src = null;
	    try {
	        //源文件  必须是存在的
	        input = new FileInputStream(new File(sourceFile));
	        src = input.getChannel();
	        //目标文件  如果不存在会创建
	        output = new FileOutputStream(new File(destFile));
	        fileChannel = output.getChannel();
	        fileChannel.transferFrom(src, 0,src.size());
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }  finally {
	        output.close();
	        input.close();
	        fileChannel.close();
	        src.close();
	    }
	}

	@Override
	public void copyFileToDest(String sourceFile, String destFile, int bufferNumber) throws IOException {
		copyFileToDest(sourceFile,destFile);
	}

}
