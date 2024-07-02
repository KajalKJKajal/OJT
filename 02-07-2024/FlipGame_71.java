public class FlipGame_71 {
    public boolean canWin(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '+' && s.charAt(i + 1) == '+') {
                String flipped = s.substring(0, i) + "--" + s.substring(i + 2);
                if (!canWin(flipped)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        FlipGame_71 game = new FlipGame_71();
        System.out.println(game.canWin("++++")); // Output: true
    }
}
