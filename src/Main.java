import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int[] Result = new int[4];
    static int result1;

    public static void main(String[] args)
    {
        Calculator();
    }

    public static void Calculator() {
        System.out.println("Введите значения (a и b)");
        for (int i = 0; i < 4; i++){
            int a = sc.nextInt();
            String b = sc.next();
            int d= sc.nextInt();
            switch (b) {
                case "+":
                    result1=a+d;
                    Result[i]=result1;
                    break;
                case "-":
                    result1=a-d;
                    Result[i]=result1;
                    break;
                case "*":
                    result1=a*d;
                    Result[i]=result1;
                    break;
                case "/":
                    result1=a/d;
                    Result[i]=result1;
                    break;
                default:
                    System.out.println("Вы ввели неравильное значение");
                    Calculator();
                    break;
            }
        }
        BoubleSort(Result);
    }
    public static void BoubleSort(int[] Sort){
        int n = Sort.length;
        int temp=0;

        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(Sort[j-1]>Sort[j]){
                    temp=Sort[j-1];
                    Sort[j-1]=Sort[j];
                    Sort[j]=temp;
                }
            }
        }
        for(int i=0;i<4;i++){
            System.out.println(Result[i]);
        }
    }
}