public class test {
    public static void main(String[] args) {
        change.inttobytes(22);
    }
}
class change{

    public static void inttobytes(int a ){

        byte[] bytes =new byte[4];
        bytes[0] =  (byte) (a>>24 & 0xff);
        bytes[1] =  (byte) (a>>16 & 0xff);
        bytes[2] =  (byte) (a>>8 & 0xff);
        bytes[3] =  (byte) (a & 0xff);

        for (byte aByte : bytes) {
            System.out.println(aByte);
        }
    }

}