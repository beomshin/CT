package ct.level2;

// 점프와 순간 이동
public class CTJumpTeleportation {


    public static int solution(int n) {
        int ans = 0;
        ans = jump(n, 0);
        return ans;
    }

    public static int jump(int n, int f) {
        if(n == 0) return f;

        return jump(n/2, n%2 == 1 ? f+1 : f);
    }
}
