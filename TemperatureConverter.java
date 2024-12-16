import java.util.Scanner;

class TemperatureConverter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean ab = true;
        while(ab == true){

        System.out.println("====== Welcome to Temperature Converter Program ======");
        System.out.println("Temperature in Celsius : Press 1");
        System.out.println("Temperature in Kelvin: Press 2");
        System.out.println("Temperature in Fahrenheit: Press 3");
        System.out.println("Exit : Press 4");
        System.out.println("In which Unit do you want to give the Temperature Reading: ");
    
        int choice = sc.nextInt();
        if(choice ==1){
            System.out.println("you have selected the Unit degree in Celsius.");
            System.out.println("Enter the Reading:");
            double temp = sc.nextDouble();
            double result1 = temp + 273.15;
            System.out.println(result1 + " K");
            double result21 = temp*1.8;
            double result2 = result21 + 32;
            System.out.println(result2 + " F");
        }else if(choice==2){
            System.out.println("you have selected the Unit degree in Kelvin.");
            System.out.println("Enter the Reading:");
            double temp1 = sc.nextDouble();
            double result3 = temp1 - 273.15;
            System.out.println(result3 + " C");
            double result44 = temp1*1.8;
            double result4 = result44 - 459.67;
            System.out.println(result4 + " F");
        }else if (choice == 3) {
            System.out.println("you have selected the Unit degree in Fahrenheit.");
            System.out.println("Enter the Reading:");
            double temp2 = sc.nextDouble();
            double result51 = temp2 - 32;
            double result5 = result51/1.8;
            System.out.println(result5 + " C");
            double result66 = temp2 + 459.67;
            
            double result6 = result66 *5/9;
            System.out.println(result6 + " K");
        }else if(choice == 4){
            ab = false;
        }else{
            System.out.println("Invalid Choice.");
            System.out.println("Please try Again.");
        }

        }
    }
}