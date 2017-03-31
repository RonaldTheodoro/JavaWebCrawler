package baalze.pagecollector;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class BaalzePageCollector {

    public static void main(String[] args) {
        try {
            Document document = Jsoup.connect("http://www.jsoup.org/").get();
            Elements links = document.select("a");
            
            for (Element link : links) {
                System.out.println(link.attr("abs:href"));
            }
        } catch (IOException ex) {
            Logger.getLogger(BaalzePageCollector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
