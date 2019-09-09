package Cryptography;

class CaesarCipher extends MonoAlphaCipher {

    void setKey(int key) {
        int shift = key % alphaLength;
        if (shift < 0)
            shift = shift + alphaLength;

        cipherTextAlphabet = (
                plainTextAlphabet.substring(shift, alphaLength) +
                        plainTextAlphabet.substring(0, shift)
        ).toLowerCase();
    }
}
