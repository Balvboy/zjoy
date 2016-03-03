package zjoy.utils.file;

import java.io.IOException;

import zjoy.utils.UtilInterface;

public interface FileInterface extends UtilInterface {

	public void copyFileToDest(String sourceFile,String destFile) throws IOException;
	
	public void copyFileToDest(String sourceFile,String destFile,int bufferNumber) throws IOException;
}
