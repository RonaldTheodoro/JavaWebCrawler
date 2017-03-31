package com.baalze.bal;

import baalze.pagecollector.BaalzePageCollector;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class WebPage {
    private Anchor anchor;
    private String webPageHash;
    private int anchorParserStatus;
    private int emailParserStatus;
    private Document document;
    
    public WebPage(Anchor anchor) {
        this.anchor = anchor;
    }
    
    private void loadDocmentFromWeb() {
        try {
            document = Jsoup.connect(anchor.getAnchorUrl()).get();
        } catch (IOException ex) {
            Logger.getLogger(BaalzePageCollector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
