package zjoy.utils.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import zjoy.utils.TimeCount;

public class FileUtils implements FileInterface {

	/**
	 * 
	 * @author zhouyang
	 * @param @param sourceFile 源文件路径，必须存在
	 * @param @param destFile  目标文件路径，如不存在会创建，存在则会覆盖
	 * @param @throws IOException
	 * @createDate 2016年2月22日
	 * @description  按字节复制文件
	 */
	public void copyFileToDest(String sourceFile,String destFile) throws IOException{
		FileInputStream input = null;
		FileOutputStream output = null;
		try {
			input = new FileInputStream(sourceFile);
			output = new FileOutputStream(destFile);
			while(true){
				// 每次从文件中读取 512 字节
				int i = input.read();
				if(i==-1){
					break;
				}
				output.write(i);
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} finally {
			if(input!=null){
				input.close();
			}
			if(output!=null){
				output.close();
			}
		}
	}
	
	/**
	 * 
	 * @author zhouyang
	 * @param @param sourceFile 源文件路径，必须存在
	 * @param @param destFile  目标文件路径，如不存在会创建，存在则会覆盖
	 * @param @param bufferNumber  读取文件数组大小
	 * @param @throws IOException
	 * @createDate 2016年2月22日
	 * @description 按字节数组读取文件，提高一定的效率
	 */
	@TimeCount
	public void copyFileToDest(String sourceFile,String destFile,int bufferNumber) throws IOException{
		byte[] buffer = new byte[bufferNumber];
		FileInputStream input = null;
		FileOutputStream output = null;
		try {
			input = new FileInputStream(sourceFile);
			output = new FileOutputStream(destFile);
			while(true){
				// 每次从文件中读取 512 字节
				int i = input.read(buffer);
				if(i==-1){
					break;
				}
				output.write(buffer);
			}
			output.write(buffer);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} finally {
			if(input!=null){
				input.close();
			}
			if(output!=null){
				output.close();
			}
		}
	}
	
	@Override
	public void util() {
		System.out.println("utils");
	}
	
}
