import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EncodingTest {
    Encoding testEncoding = new Encoding("DAVID NDUNGU", 2);
    @Test
    public void checkIfItCreatesInstance()
    {
        assertEquals(true, testEncoding instanceof Encoding);
    }
    @Test
    public void checkIfSavesInputText()
    {
        assertEquals("DAVID NDUNGU", testEncoding.getInputText() );
    }

    @Test
    public void checkKeyIsSaved()
    {
        assertEquals(2,testEncoding.getKey());
    }

}