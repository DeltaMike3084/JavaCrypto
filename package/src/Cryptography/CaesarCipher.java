package Cryptography;

class CaesarCipher {

    private static final String plainTextAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int alphaLength = plainTextAlphabet.length();
    private String cipherTextAlphabet = plainTextAlphabet.toLowerCase();

    CaesarCipher() {
    }

    void setKey(int key) {
        int shift = key % alphaLength;
        if (shift < 0)
            shift = shift + alphaLength;

        cipherTextAlphabet = (
                plainTextAlphabet.substring(shift, alphaLength) +
                        plainTextAlphabet.substring(0, shift)
        ).toLowerCase();
    }

    String encode(String plainText) {
        String cipherText = plainText.toUpperCase();
        for (int i = 0; i < alphaLength; i++) {
            cipherText = cipherText.replace(plainTextAlphabet.charAt(i), cipherTextAlphabet.charAt(i));
        }
        return cipherText.toUpperCase();
    }

    String decode(String encodedText) {
        String decodedText = encodedText.toLowerCase();
        for (int i = 0; i < alphaLength; i++)
            decodedText = decodedText.replace(cipherTextAlphabet.charAt(i), plainTextAlphabet.charAt(i));
        return decodedText;
    }
}
