
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodingTest {
    Decoding testDecoding = new Decoding( 2, "FCXKF PFWPIW");
    @Test
    public void checkIfSavesInputText()
    {
        assertEquals("FCXKF PFWPIW", testDecoding.getInputText() );
    }
    @Test
    public void checkKeyIsSaved()
    {
        assertEquals(2,testDecoding.getKey());
    }

    @Test
    public void isValidInputText()
    {
        assertEquals(true, testDecoding.isValidInputText());
    }
    @Test
    public void isValidKey()
    {
        assertEquals(true, testDecoding.isValidKey());
    }

    @Test
    public void validDecoding()
    {
        assertEquals("DAVID NDUNGU" , testDecoding.decode());
    }


}