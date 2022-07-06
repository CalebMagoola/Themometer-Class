/**************************************
Caleb Magoola    11/3/2021    Temperature
This program is a Temperature Class
**************************************/
public class Temperature
{
    //instance variables
    private double tempValue;
    private char scale;
    
    //constructors
    public Temperature(double tv)
        {
        tempValue = tv;
        scale = 'C';
        }
    public Temperature(char s)
        {
        tempValue = 0;
        scale = s;
        }
    public Temperature(double tv, char s)
        {
        tempValue = tv;
        scale = s;
        }
    public Temperature()
        {
        tempValue = 0;
        scale = 'C';
        }
    
    //getters
    public double getC()
        {
            if(scale == 'C')
                {
                    return tempValue; 
                }
            else
                {
                    return 5.0 * (tempValue-32)/9.0;    
                }
        }
    public double getF()
        {
            if(scale == 'F')
                {
                    return tempValue; 
                }
            else
                {
                    return 9.0 * (tempValue/5.0) + 32; 
                }
        }
    
    //setters
    public void setTemp (double tv)
        {
            tempValue = tv;
        }
    public void setScale (char s)
        {
            scale = s;
        } 
        
    //toString
    public String toString()
        {
            return "Temperature: " + tempValue + " " + scale;
        }
        
    //equals method
    public boolean equals(Temperature other)
    {
        if (this.getC() == other.getC())
            return true;
        else
            return false;
    }
}//ends class