import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(solve(jewels, stones));
    }

    public static int solve (String jew, String stones) {
        Set<Character> set = new HashSet<>();
        for (char c : jew.toCharArray()) {
            set.add(c);
        }

        int count=0;
        for (char c : stones.toCharArray()) {
            if (set.contains(c)){
                count++;
            }
        }
        return count;
    }
}
