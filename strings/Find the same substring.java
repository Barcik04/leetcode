class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longestStr = "";
        String currentWord = "";

        int shortestWordLength = Arrays.stream(strs)
                .mapToInt(str -> str.length())
                .min()
                .orElse(0);

        for (int i = 0; i < shortestWordLength; i++) {
            boolean allMatchChar = true;
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) != strs[j + 1].charAt(i)) {
                    allMatchChar = false;
                    break;
                }
            }

            if (allMatchChar == true) {
                currentWord = currentWord + strs[0].charAt(i);
            } else {
                currentWord = "";
            }

            if (currentWord.length() > longestStr.length()) {
                longestStr = currentWord;
            }
        }

        return longestStr;
    }
}
