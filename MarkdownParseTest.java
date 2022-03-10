import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testFile1() {
        try{
            Path fileName = Path.of("test-file.md");
            String contents = Files.readString(fileName);
            ArrayList<String> links = MarkdownParse.getLinks(contents);
            assertEquals(new ArrayList<String>(Arrays.asList("https://something.com", "some-page.html")), links);
        } catch (Exception e){
            fail();
        }
    }
    
    @Test
    public void testFile2() throws IOException {
        Path fileName = Path.of("test-file-2.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of("https://something.com", "some-page.html"), links);
    }

    @Test
    public void testFile3() throws IOException {
        Path fileName = Path.of("test-file-3.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of(), links);
    }

    @Test
    public void testFile4() throws IOException {
        Path fileName = Path.of("test-file-4.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of(), links);
    }

    @Test
    public void testFile5() throws IOException {
        Path fileName = Path.of("test-file-5.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of(), links);
    }

    @Test
    public void testFile6() throws IOException {
        Path fileName = Path.of("test-file-6.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of(), links);
    }

    @Test
    public void testFile7() throws IOException {
        Path fileName = Path.of("test-file-7.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of(), links);
    }

    @Test
    public void testFile8() throws IOException {
        Path fileName = Path.of("test-file-8.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of("a link on the first line"), links);
    }

    @Test
    public void testFile9() throws IOException {
        Path fileName = Path.of("test-file-9.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of("something.com"), links);
    }

    @Test
    public void testFile10() throws IOException {
        Path fileName = Path.of("test-file-10.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of(), links);
    }
}
