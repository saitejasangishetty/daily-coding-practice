public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) != 32) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        LengthOfLastWord sol = new LengthOfLastWord();
        
        String test1 = "Hello World";
        String test2 = "   fly me   to   the moon  ";
        String test3 = "luffy is still joyboy";
        
        System.out.println("Output 1: " + sol.lengthOfLastWord(test1)); // 5
        System.out.println("Output 2: " + sol.lengthOfLastWord(test2)); // 4
        System.out.println("Output 3: " + sol.lengthOfLastWord(test3)); // 6
    }
}