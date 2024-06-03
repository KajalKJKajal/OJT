import java.util.Arrays;
public class LargestArray {
    public static void main(String[] args) {
        int [] num={10,52,86,74,100,5222};
        System.out.println(Arrays.stream(num).max());
    }
    
}
