import com.baalze.bal.Anchor;
import com.baalze.bal.Domain;
import com.baalze.bal.WebPage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestBal {
    Domain domain;
    Anchor anchor;
    WebPage webPage;
    
    @Before
    public void setUp() throws Exception {
        domain = new Domain("http://www.jsoup.org");
        anchor = new Anchor(domain, "http://www.jsoup.org");
        webPage = new WebPage(anchor);
    }
    
    @Test
    public void testDomainHash() throws Exception {
        assertTrue(
            "getDomainHash: Hash is wrong length",
            domain.getDomainHash().length() == 64
        );
    }
    
    @Test
    public void testAnchorHash() throws Exception {
        assertTrue(
            "getAnchorHash: Hash is wrong length",
            anchor.getAnchorHash().length() == 64
        );
    }
    
    @Test
    public void testLoadDocumentFromWeb() throws Exception {
        webPage.loadDocumentFromWeb();
        assertTrue("Test results", webPage.getDocument() != null);
    }
}
