public class ZigZagConversion6 {
    //https://leetcode.com/problems/zigzag-conversion/description/
    public String convert(String s, int numRows) {
        if (numRows > s.length() || s.length() < 1 || numRows < 2) return s;
        String result = "";
        int num = (2 * numRows) - 2;
        String[] array = s.split("");
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j = j + num) {
                if (j % num == 0 || j % (num) == (numRows - 1)) {
                    result = result + array[j];
                } else {
                    result = result + array[j];
                    if (j + (num - 2 * (j % num)) < s.length()) {
                        result = result + array[j + (num - 2 * (j % num))];
                    }
                }
            }
        }
        return result;
    }
}
