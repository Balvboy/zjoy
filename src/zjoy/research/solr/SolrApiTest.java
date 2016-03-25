package zjoy.research.solr;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrInputDocument;

public class SolrApiTest {

	public static void main(String[] args) throws SolrServerException, IOException {
		
		HttpSolrServer server = new HttpSolrServer("http://172.16.244.87:8890/solr/new");
		
		
//		SolrQuery query = new SolrQuery();
//		query.setQuery("*中国*");
//		QueryResponse response = server.query(query);
//		SolrDocumentList result = response.getResults();
//		System.out.println(result.size());
		
//		server.deleteById("7");
		
		Collection<SolrInputDocument> docs = new ArrayList<SolrInputDocument>();
               //设置每个字段不得为空，可以在提交索引前进行检查
	      SolrInputDocument doc = new SolrInputDocument();
	      //在这里请注意date的格式，要进行适当的转化，上文已提到
	      doc.addField("id", "7");
	      doc.addField("title", "nihao");
	      doc.addField("description", "nihao");
	      
	      docs.add(doc);
 
        try {
               server.add(docs);
               //对索引进行优化
               server.optimize();
               server.commit();
        } catch (Exception e) {
               e.printStackTrace();
        }
		
		
	}
}
