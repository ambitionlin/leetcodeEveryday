package tmall;
// 供参考代码，不影响判题
//import java.util.tmall;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nStr = scanner.nextLine();
        for (int i = 0; i < Integer.valueOf(nStr); i++) {
            String input = scanner.nextLine();
            System.out.println(toNormalAddr(input));
        }
    }

    // transform to normal address
    private static String toNormalAddr(String input) {
        int c = input.indexOf('C');
        String row = input.substring(1,c);
        int col = Integer.parseInt(input.substring(c+1));
        int flag =1;
        if(col<=26){
            row = (char)('A'+col-1)+row;
        }else{
            while (flag==1){
                if(col%26==0){
                    row = 'Z'+row;
                    col=col/26;
                    col--;
                }else{
                    if(col>26){  //col>26,运行后继续循环
                        row=(char)(col%26-1+'A')+row;
                        col=col/26;
                    }else {   //col<26
                        row = (char)('A'-1+col%26)+row;
                        flag = 0;
                    }
                }
            }
        }
        return row;
    }
}