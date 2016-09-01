package zjoy.research.solr;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrInputDocument;

public class SolrApiTest {

	public static void main(String[] args) throws SolrServerException, IOException {
		
		HttpSolrServer server = new HttpSolrServer("http://172.17.202.107:8983/solr/test2");
		
		
//		SolrQuery query = new SolrQuery();
//		query.setQuery("*中国*");
//		QueryResponse response = server.query(query);
//		SolrDocumentList result = response.getResults();
//		System.out.println(result.size());
		
//		server.deleteById("7");
		
		Collection<SolrInputDocument> docs = new ArrayList<SolrInputDocument>();
               //设置每个字段不得为空，可以在提交索引前进行检查
	      SolrInputDocument doc = new SolrInputDocument();
//	      List<String> strs = new ArrayList<String>();
//	      strs.add("周洋");
//	      strs.add("熙熙");
//	      strs.add("常雪菲");
//	      strs.add("明熙");
	      //在这里请注意date的格式，要进行适当的转化，上文已提到
	      doc.addField("lcid", "9");
	      doc.addField("fei_entname", "result");
	     // doc.addField("markname", strs);
	      
	      //docs.add(doc);
 
        try {
        	server.deleteByQuery("*:*");
        	server.commit();
//               server.add(docs);
//               //对索引进行优化
//               server.optimize();
//               server.commit();
        } catch (Exception e) {
               e.printStackTrace();
        }
		
//		BlockingQueue<String> lists = new LinkedBlockingQueue<String>(100);
//		System.out.println(lists.remainingCapacity());
//		
//		
//		System.out.println(80*0.25);
	}
}
