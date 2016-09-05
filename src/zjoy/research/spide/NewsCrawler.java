package zjoy.research.spide;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import cn.edu.hfut.dmic.webcollector.model.CrawlDatums;
import cn.edu.hfut.dmic.webcollector.model.Page;
import cn.edu.hfut.dmic.webcollector.plugin.berkeley.BreadthCrawler;
import zjoy.utils.HtmlToWord;

public class NewsCrawler extends BreadthCrawler {

    /**
     * @param crawlPath crawlPath is the path of the directory which maintains
     * information of this crawler
     * @param autoParse if autoParse is true,BreadthCrawler will auto extract
     * links which match regex rules from pag
     */
    public NewsCrawler(String crawlPath, boolean autoParse) {
        super(crawlPath, autoParse);
        /*start page*/
        this.addSeed("http://www.cottonchina.org/textile/index.php");
//        this.addSeed("http://news.hfut.edu.cn/list-1-1.html");

        /*fetch url like http://news.hfut.edu.cn/show-xxxxxxhtml*/
        this.addRegex("http://www.cottonchina.org/textile/index.php");
//        this.addRegex("http://news.hfut.edu.cn/show-.*html");
        /*do not fetch jpg|png|gif*/
        this.addRegex("-.*\\.(jpg|png|gif).*");
        /*do not fetch url contains #*/
        this.addRegex("-.*#.*");
    }

    @Override
    public void visit(Page page, CrawlDatums next) {
        String url = page.getUrl();
        /*if page is news page*/
        if (page.matchUrl("http://www.cottonchina.org/textile/index.php")) {
            /*we use jsoup to parse page*/
        	String content = "";
            Document doc = page.getDoc();
            Elements es = doc.getElementsByClass("tab");
            for(Element e:es){
            	content += e.html();
            }
            try {
				HtmlToWord.exportWord(content);
			} catch (Exception e) {
				e.printStackTrace();
			}
          //  System.out.println(doc.getElementsByClass("tab").get(0).html());
            /*extract title and content of news by css selector*/
           // String title = page.select("div[class='tab']").first().html();
          //  String content = page.select("div#artibody", 0).text();

//            System.out.println("URL:\n" + url);
          //  System.out.println("title:\n" + title);
//            System.out.println("content:\n" + content);

            /*If you want to add urls to crawl,add them to nextLink*/
            /*WebCollector automatically filters links that have been fetched before*/
            /*If autoParse is true and the link you add to nextLinks does not match the regex rules,the link will also been filtered.*/
            //next.add("http://xxxxxx.com");
        }
    }

    public static void main(String[] args) throws Exception {
        NewsCrawler crawler = new NewsCrawler("crawl", true);
        crawler.setThreads(1);
//        crawler.setTopN(100);
        //crawler.setResumable(true);
        /*start crawl with depth of 4*/
        crawler.start(1);
    }

}