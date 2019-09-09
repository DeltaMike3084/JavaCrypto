package Cryptography;

abstract class MonoAlphaCipher {

    static final String plainTextAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final int alphaLength = plainTextAlphabet.length();
    String cipherTextAlphabet = plainTextAlphabet.toLowerCase();

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
