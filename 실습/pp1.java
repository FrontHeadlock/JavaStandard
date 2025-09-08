package 실습;
class op {
    public static void main(String[] args){
        int x= 5;
        System.out.printf("x++= %d, ++x=%d\n",x++,++x);
        int k = x++ - ++x;
        System.out.printf("%d = %d - %d",k,x++,++x);
    }
}