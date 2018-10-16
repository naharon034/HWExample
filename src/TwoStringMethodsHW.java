public class TwoStringMethodsHW {

    public static boolean abcTest(String phrase) {
        int indexOfAbc = phrase.indexOf("abc");
        if (indexOfAbc == -1) {
            return false;
        }
        if (indexOfAbc > 0 && phrase.substring(indexOfAbc - 1, indexOfAbc).equals(".")) {
            return false;
        } else {
            return true;
        }
    }

    public static String alternateStrings(String phrase1, String phrase2) {
        String newPhrase = "";
        int longestPhraseLength = phrase1.length();
        if (phrase2.length() > phrase1.length()) {
            longestPhraseLength = phrase2.length();
        }
        for (int i = 0; i < longestPhraseLength; i++) {
            if (i < phrase1.length()) {
                newPhrase += phrase1.substring(i, i + 1);
            }
            if (i < phrase2.length()) {
                newPhrase += phrase2.substring(i, i + 1);
            }
        }
        return newPhrase;
    }

}
