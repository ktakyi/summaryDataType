/**
 * class name: Variables.java
 * author: Kwaku Takyi
 * date: 5/26/2022
 * version: 1.0
 * description: This program will display summary of primitive data types.
 * source: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 * direction: 1) read the source material
 *            2) summary of primitive data types: byte, short, int, long, float,
 *            double, boolean, char (2 lines per each type)
 *
 */
public class Variables
{
    public static void main(String[] args)
    {
        System.out.println("Summary of The Primitive Data Types");
        System.out.println("The byte data type is an 8-bit signed two's complement integer.");
        System.out.println("It has a minimum value of -128 and a maximum value of 127 (inclusive)");
        System.out.println("A short is a 16-bit signed two compolement integer.");
        System.out.println("It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive)");
        System.out.println("An int is a 32-bit signed two's complement integer.");
        System.out.println("It has a minimum value of -2^31 and a maximum value of (2^31)-1.");
        System.out.println("The long data type is a 64 bit two's complement integer.");
        System.out.println("The signed long has a minumum value -2^63 and a maximum value of (2^63)-1.");
        System.out.println("A float data type is a single-precision 32-bit IEEE 754 floating point.");
        System.out.println("This data type should not be used for precise values. Can be used to save memory.");
        System.out.println("The double data type is a double-precision 64-bit IEEE 754 floating point.");
        System.out.println("For decimal values, this data type is the default choice.");
        System.out.println("The boolean data type only has two possible values: true or false.");
        System.out.println("Use this for simple flags that track true or false conditions.");
        System.out.println("The char data type is a single 16-bit Unicode character");
        System.out.println("It has a minimum value of '\u0000' (or 0) and a maximum value of '\ufff'");
    }

}
