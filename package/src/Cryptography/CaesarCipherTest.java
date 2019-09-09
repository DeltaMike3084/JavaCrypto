package Cryptography;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {

    private String plaintext = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
    private String[] cipherText = {
            "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG",
            "UIF RVJDL CSPXO GPY KVNQT PWFS UIF MBAZ EPH",
            "VJG SWKEM DTQYP HQZ LWORU QXGT VJG NCBA FQI",
            "WKH TXLFN EURZQ IRA MXPSV RYHU WKH ODCB GRJ",
            "XLI UYMGO FVSAR JSB NYQTW SZIV XLI PEDC HSK",
            "YMJ VZNHP GWTBS KTC OZRUX TAJW YMJ QFED ITL",
            "ZNK WAOIQ HXUCT LUD PASVY UBKX ZNK RGFE JUM",
            "AOL XBPJR IYVDU MVE QBTWZ VCLY AOL SHGF KVN",
            "BPM YCQKS JZWEV NWF RCUXA WDMZ BPM TIHG LWO",
            "CQN ZDRLT KAXFW OXG SDVYB XENA CQN UJIH MXP",
            "DRO AESMU LBYGX PYH TEWZC YFOB DRO VKJI NYQ",
            "ESP BFTNV MCZHY QZI UFXAD ZGPC ESP WLKJ OZR",
            "FTQ CGUOW NDAIZ RAJ VGYBE AHQD FTQ XMLK PAS",
            "GUR DHVPX OEBJA SBK WHZCF BIRE GUR YNML QBT",
            "HVS EIWQY PFCKB TCL XIADG CJSF HVS ZONM RCU",
            "IWT FJXRZ QGDLC UDM YJBEH DKTG IWT APON SDV",
            "JXU GKYSA RHEMD VEN ZKCFI ELUH JXU BQPO TEW",
            "KYV HLZTB SIFNE WFO ALDGJ FMVI KYV CRQP UFX",
            "LZW IMAUC TJGOF XGP BMEHK GNWJ LZW DSRQ VGY",
            "MAX JNBVD UKHPG YHQ CNFIL HOXK MAX ETSR WHZ",
            "NBY KOCWE VLIQH ZIR DOGJM IPYL NBY FUTS XIA",
            "OCZ LPDXF WMJRI AJS EPHKN JQZM OCZ GVUT YJB",
            "PDA MQEYG XNKSJ BKT FQILO KRAN PDA HWVU ZKC",
            "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD",
            "RFC OSGAI ZPMUL DMV HSKNQ MTCP RFC JYXW BME",
            "SGD PTHBJ AQNVM ENW ITLOR NUDQ SGD KZYX CNF",
            "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG",
    };
    private CaesarCipher caesar = new CaesarCipher();

    @Test
    void testRightShift() {
        for (int i = 0; i>=-26; i--) {
            caesar.setKey(i);
            assertEquals(cipherText[i+26], caesar.encode(plaintext));
            assertEquals(plaintext, caesar.decode(cipherText[i+26]));
        }
    }

    @Test
    void testLeftShift() {
        for (int i = 0; i<=26; i++) {
            caesar.setKey(i);
            assertEquals(cipherText[i], caesar.encode(plaintext));
            assertEquals(plaintext, caesar.decode(cipherText[i]));
        }
    }

//    @Test
//    void testAll() {
//        testLeftShift();
//        testRightShift();
//    }

}