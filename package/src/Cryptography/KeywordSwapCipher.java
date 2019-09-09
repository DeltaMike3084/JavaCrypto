package Cryptography;

class KeywordSwapCipher {

    private static final String plainTextAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int alphaLength = plainTextAlphabet.length();
    private String cipherTextAlphabet = plainTextAlphabet.toLowerCase();

    void setKeyword(String keyword) {
        String tempCipher = "";
        String tempKeyword = keyword.toUpperCase();

        for (int i = 0; i < tempKeyword.length(); i++)
        {
            if (tempCipher.indexOf(tempKeyword.charAt(i)) < 0)
                tempCipher = tempCipher + tempKeyword.charAt(i);
        }

        for (int i = 0; i < alphaLength; i++)
        {
            if (tempCipher.indexOf(plainTextAlphabet.charAt(i)) < 0)
                tempCipher = tempCipher + plainTextAlphabet.charAt(i);
        }

        cipherTextAlphabet = tempCipher.toLowerCase();

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
