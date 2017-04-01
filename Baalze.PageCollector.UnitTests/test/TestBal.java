import com.baalze.bal.Anchor;
import com.baalze.bal.Domain;
import com.baalze.bal.WebPage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestBal {
    
    public TestBal() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testLoadDocumentFromWeb() {
        Domain domain = new Domain("1234-5678", "http://www.jsoup.org");
        Anchor anchor = new Anchor(domain, "1234-5678", "http://www.jsoup.org");
        WebPage webPage = new WebPage(anchor);
        webPage.loadDocumentFromWeb();
        
        assertTrue("Test results", webPage.getDocument() != null);
    }
}
