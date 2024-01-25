public class Numberof1Bits {
    public int Numbersof1Bits(int n){
        int count = 0;
        while(n != 0){
            n = n& n-1;
            count = count +1;
        }
        return count;
    }
}
