package Cryptography;

class KeywordSwapCipher extends MonoAlphaCipher {

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
}
