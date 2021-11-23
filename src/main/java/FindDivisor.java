import java.util.stream.IntStream;

public class FindDivisor {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numberOfDivisors(4));
    }
}

class Solution {
    public long numberOfDivisors(int n) {
        return IntStream.range(1, n+1).filter(i -> n%i==0).count();
    }
    public long numberOfDivisors2(int n) {
        return IntStream.rangeClosed(1, n).filter(x -> n % x == 0).count();
    }
    public long numberOfDivisors3(int n) {
        return IntStream.range(1, n + 1)
                .reduce(0, (acc, x) -> n % x == 0 ? acc + 1 : acc);
    }
}
