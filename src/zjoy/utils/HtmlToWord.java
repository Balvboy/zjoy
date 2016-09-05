package zjoy.utils;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.poifs.filesystem.DocumentEntry;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class HtmlToWord {

	// 导出到word
	public static void exportWord(String html) throws Exception {
		String content = "<html>" + html + "</html>";
		byte b[] = content.getBytes();
		ByteArrayInputStream bais = new ByteArrayInputStream(b);
		POIFSFileSystem poifs = new POIFSFileSystem();
		DirectoryEntry directory = poifs.getRoot();
		DocumentEntry documentEntry = directory.createDocument("WordDocument", bais);
		// 输出文件
		String name = "导出知识";
		// 输出到本地文件的话，new一个文件流
		FileOutputStream ostream = new FileOutputStream("/Users/QiJia/zhouyang/test.doc");
		poifs.writeFilesystem(ostream);
		bais.close();
		ostream.close();
		System.out.println("word 生成完毕");
	}
	
	public static void main(String[] args) throws Exception {
		exportWord("<h1>你好</h1>");
	}
}
