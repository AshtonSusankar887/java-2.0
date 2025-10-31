public class SwapPairsSubstring {
    public static void main(String[] args) {
        String msg = "abcdef";
        String newMsg = "";

        for (int i = 0; i < msg.length() - 1; i += 2) {
            newMsg += msg.substring(i + 1, i + 2) + msg.substring(i, i + 1);
        }

        // Handle odd-length strings
        if (msg.length() % 2 != 0) {
            newMsg += msg.substring(msg.length() - 1);
        }
        
        System.out.println(newMsg); // Output: badcfe
    }
}