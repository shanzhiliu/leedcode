package number_844;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        char[] chars = new char[s.length()];
        char[] chart = new char[t.length()];

        int sLenght = getAviStr(s, chars);
        int tLenght = getAviStr(t, chart);

        if(sLenght != tLenght) return false;

        for (int i = 0; i < sLenght; i++) {
            if(chars[i] != chart[i]) return false;
        }
        return true;
    }

    public int getAviStr(String str, char[] chars) {

        int aviIndexs = 0;

        for (int i = 0; i < str.length(); i++) {
            char item = str.charAt(i);
            if(item != '#') {
                chars[aviIndexs] = item;
                aviIndexs ++;
            }
            else {
                if(aviIndexs > 0) {
                    aviIndexs --;
                }
            }
        }
        return aviIndexs;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.backspaceCompare("ab##","c#d#");
    }
}