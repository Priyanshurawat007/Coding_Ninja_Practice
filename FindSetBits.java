public class FindSetBits{
    public static int findPositionOfSetBit(int N) {
        int position = 0; // Initialize position here
        
       
        if (Integer.bitCount(N) != 1) {
            return -1;
        }
        
        
        while (N > 0) {
            position++;
            if ((N & 1) == 1) {
                break;
            }
            N >>= 1;
        }
        
        return position;
    }

    public static void main(String[] args) {
        int N = 4;
        int position = findPositionOfSetBit(N);
        System.out.println("Position of the only set bit in " + N + " is: " + position);
    }
}
