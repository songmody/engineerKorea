package bitOperation;

public class getBitTest {

    static boolean getBit(int num, int i){
        //1000을 만들어야함
        return (num & (1 << i)) != 0;
    }

    static int setBit(int num, int i){
        return (num | (1 << i));
    }

    static int clearBit(int num, int i){
        return (num & ~(1 << i));
    }
    static int clearLeftBit(int num, int i){
        return (num & (1 << i) -1);
    }
    static int clearRightBit(int num, int i){
        return (num & -1 << (i+1));
    }
    static int updateBit(int num, int i, boolean val){
        //val이 1이거나 0일때 i자리의 bit를 clear한 num & ~(1 << i)
        // 에 i만큼 val값을 밀어 넣어주고 OR연산을 한다.
        return (num & ~(1 << i)) | ((val ? 1:0) << i);
    }

    public static void main(String[] args) {
//        System.out.println(getBit(9, 3));
//        System.out.println(setBit(5, 3));
        // 0101 = 5, clearBit(5, 2) -> 1!!
//        System.out.println(clearBit(9, 3));
//        System.out.println(clearLeftBit(169, 3));
//        System.out.println(clearRightBit(169, 3));
        System.out.println(updateBit(169, 3, false));
    }
}
