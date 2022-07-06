/************************************************
Caleb Magoola    11/3/2021    Temperature Tester
This program is designed to test the 
Temperature Class
************************************************/
public class TemperatureTester
{
    public static void main (String [] args)
    {
        //testing the constructors
        Temperature temp1 = new Temperature(60);
        Temperature temp2 = new Temperature('F');
        Temperature temp3 = new Temperature(20, 'C');
        Temperature temp4 = new Temperature();
        
        //testing the getters
        System.out.println("Temperature 1 in Celsius: " + temp1.getC() + "\nTemperature 1 in Fahrenheit: " + temp1.getF());
        System.out.println();
        System.out.println("Temperature 2 in Celsius: " + temp2.getC() + "\nTemperature 2 in Fahrenheit: " + temp2.getF());
        System.out.println();
        System.out.println("Temperature 3 in Celsius: " + temp3.getC() + "\nTemperature 3 in Fahrenheit: " + temp3.getF());
        System.out.println();
        System.out.println("Temperature 4 in Celsius: " + temp4.getC() + "\nTemperature 4 in Fahrenheit: " + temp4.getF());
        System.out.println();
        
        //testing the setters
        temp1.setTemp(32);
        temp1.setScale('F');
        
        temp2.setTemp(0);
        temp2.setScale('C');
        
        temp3.setTemp(100);
        temp3.setScale('F');
        
        temp4.setTemp(100);
        temp4.setScale('C');
        
        //testing the toString
        System.out.println(temp1);
        System.out.println(temp2);
        System.out.println(temp3);
        System.out.println(temp4);
        
        //testing the equals method
        if (temp1.equals(temp2))
            {
                System.out.println("Temperature 1 is equal to Temperature 2");
            }
        else
            {
                System.out.println("Temperature 1 is not equal to Temperature 2");
            }
        
        if (temp1.equals(temp3))
            {
                System.out.println("Temperature 1 is equal to Temperature 3");
            }
        else
            {
                System.out.println("Temperature 1 is not equal to Temperature 3");
            }
         
        if (temp3.equals(temp4))
            {
                System.out.println("Temperature 3 is equal to Temperature 4");
            }
        else
            {
                System.out.println("Temperature 3 is not equal to Temperature 4");
            }
    }//ends the main
}//ends class