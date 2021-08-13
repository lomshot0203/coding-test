/*
* 숫자, 문자와 대시로만 구성된 문자열로 표시된 라이센스 키가 제공 됩니다.
* 문자열은 대시(-)로 n 과 n + 1그룹으로 구분됩니다 .
* 정수값 k도 주어집니다.
* 첫 번째 그룹을 제외하고 각 그룹이 정확히 k로 문자열을 형식화(Formatting)해야 합니다.
* 첫 번째 그룹은 더 짧을 수 있지맊 여전히 적어도 하나의 문자를 포함해야합니다.
* 또한 두 그룹 사이에 대시가 삽입되어야하며 모든 소문자를 대문자로 변홖해야합니다.
* 재 포맷 된 라이센스 키를 리턴하세요
*
* Input: s = "8F3Z-2e-9-w", k = 4 Output: "8F3Z-2E9W
* Input: s = " 8-5g-3-J ", k = 2  Output: "8-5G-3J"
*/
public class LicenseKeyFormatting {

    public static void main(String[] args) {
        String s = "8-5g-3-J";
        int k = 2;
        solve(s, k);
    }

    public static int solve(String s, int k) {
        String key = s.toUpperCase().replace("-", "");
        StringBuilder sb = new StringBuilder(key);
        int len = sb.length();
        for (int i = k; i <len; i=i+k) {
            sb.insert(len-i, "-");
        }
        System.out.println("2. " +sb);
        return 0;
    }
}
