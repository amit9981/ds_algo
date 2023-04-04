package newbranch.com.harry.number;

public class PalidromNumber {
    public static void main(String[] args) {
        int num = 121;//211
        int temp=num;
        int reminder = 0;
        int sum = 0;

        while (num > 0) {
            reminder = num % 10;
            sum = (sum * 10 )+ reminder;
            num = num/10;
        }
       // int newNum = sum / 10;
        if (temp == sum) {
            System.out.println("Palidrom");
        } else {
            System.out.println("Not Palidrom");

        }
    }
}
