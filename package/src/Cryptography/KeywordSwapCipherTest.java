package Cryptography;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class KeywordSwapCipherTest {
    private String plaintext = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
    private String zebraCipher = "SFA OTGBI EPMVL CMW HTKNQ MUAP SFA JZYX RMD";
    private String barracudaCipher = "SFU OTGRI APMWL DMX HTKNQ MVUP SFU JBZY CME";
    private String tankCipher = "SEB PUFNH AQMWL CMX GUJOR MVBQ SEB ITZY KMD";

    private KeywordSwapCipher swap = new KeywordSwapCipher();

    @Test
    void testEncode() {
        swap.setKeyword("ZEBRA");
        assertEquals(zebraCipher, swap.encode(plaintext));
        swap.setKeyword("BARRACUDA");
        assertEquals(barracudaCipher, swap.encode(plaintext));
        swap.setKeyword("TANK");
        assertEquals(tankCipher, swap.encode(plaintext));
    }

    @Test
    void testDecode() {
        swap.setKeyword("ZEBRA");
        assertEquals(plaintext, swap.decode(zebraCipher));
        swap.setKeyword("BARRACUDA");
        assertEquals(plaintext, swap.decode(barracudaCipher));
        swap.setKeyword("TANK");
        assertEquals(plaintext, swap.decode(tankCipher));
    }

}
