package com.example.mma.calculatorapp;

/**
 * Created by matth_000 on 4/2/2016.
 */
import java.util.ArrayList;

public class Calculator
{
    private double result;

    public Calculator()
    {
        result = 0;
    }

    public double getResult() { return result; }

    //Returns last result added to the parameter
    public double add ( double n )
    {
        return result += n;
    }

    //Returns last result minus the parameter
    public double subtract ( double n )
    {
        return result -= n;
    }

    //Returns last result multiplied by the parameter
    //Also used for negation ( - )
    public double multiply ( double n )
    {
        return result *= n;
    }

    //Returns last result divided by the parameter
    public double divide ( double n )
    {
        return result /= n;
    }

    //Returns last result raised to the parameter as an exponent
    //Also used for squared, square root, etc
    public double exponent ( double p )
    {
        return Math.pow ( result, p );
    }

    //Returns sine of the last result ( Maybe pass angle in instead? )
    public double sine()
    {
        return Math.sin( result );
    }

    //Returns cosine of the last result ( Maybe pass angle in instead? )
    public double cosine()
    {
        return Math.cos ( result );
    }

    //Returns tangent of the last result ( Maybe pass angle in instead? )
    public double tangent()
    {
        return Math.tan ( result );
    }
}//testing to see if I can add a comment
