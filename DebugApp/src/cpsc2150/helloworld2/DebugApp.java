package cpsc2150.helloworld2;

import java.util.*;

public class DebugApp {

    public static void main(String[] args) {

        int [] arr = new int[10];
        Scanner reader = new Scanner(System.in);
        for(int i=0; i<10; i++){
            System.out.println("Give me a number");
            String input = reader.nextLine();
            arr[i] = Integer.parseInt(input);
        }

        int a = ArrayUtil.funct1(arr);
        double b = ArrayUtil.funct2(arr);
        double c = ArrayUtil.funct3(arr);

        System.out.println("Mystery function 1 returns: " + a);
        System.out.println("Mystery function 2 returns: " + b);
        System.out.println("Mystery function 3 returns: " + c);
    }
}
