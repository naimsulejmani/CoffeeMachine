
class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        // write your code here
        char ch = 'A';
        StringBuilder sb = new StringBuilder();

        while (ch <= 'Z') {
            sb.append(ch);
            sb.append(ch != 'Z' ? " " : "");
            ch++;
        }
        return sb;
    }
}