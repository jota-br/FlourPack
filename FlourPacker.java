public class FlourPacker {
    public static boolean canPack (int bigCount, int smallCount, int goal) {
        int big = 5;
        
        if (bigCount < 0 || smallCount < 0) {
            return false;
        }

        while (bigCount > 0 && goal > 0 && goal >= 5) {
            goal -= big;
            bigCount--;
        }
        
        while (smallCount > 0 && goal > 0) {
            goal--;
            smallCount--;
        }
        
        return (goal == 0);
    }
}
