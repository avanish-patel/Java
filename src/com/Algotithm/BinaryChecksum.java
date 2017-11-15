package com.Algotithm;
import java.util.Scanner;
/**
 * 
 * @author Avanishbhasi Patel on 09/21/2017
 *
 */
public class BinaryChecksum {
	
	public static int carry = 0;

    public static void main(String[] args) {

        int i;
        // defining the arrays that holds 8 bits
        int[] a = new int[8];
        int[] b = new int[8];
        int[] e = new int [8];
        int[] sum = new int[8];


        String c, d ,f;
        Scanner sn = new Scanner(System.in);
        Methods m = new Methods();

        // getting the user input
        System.out.println("Enter the 1st 8 bit binary number: ");
        c = sn.nextLine();
        a = m.Converter(c);

        System.out.println("Enter the 2nd 8 bit binary number: ");
        d = sn.nextLine();
        b = m.Converter(d);

        System.out.println("Enter the 3rd 8 bit binary number: ");
        f = sn.nextLine();
        e = m.Converter(f);
        
        // adding the bits as binary addition
        sum = m.BinaryAddition(a, b, carry);

        // calling the methods
        sum = m.BinaryAddition(sum,e, carry);

        sum = m.addCarryToFinalBitArray(sum, carry);
        
        

        sum = m.reverseArray(sum);
        for (i = 0; i < 8; i++) {

            System.out.print(sum[i]);
        }


    }
}

class Methods {


    int[] sum;
    // method for binary addition
    int[] BinaryAddition(int[] a, int[] b, int carry) {
        sum = new int[8];
        for (int i = 7; i >= 0; i--) {
        	if (carry == 0 && a[i] == 0 && b[i] == 0) {
                sum[i] = 0;
                carry = 0;
            }
            else if (carry == 0 && a[i] == 0 && b[i] == 1) {
                sum[i] = 1;
                carry = 0;
            }
            else if (carry == 0 && a[i] == 1 && b[i] == 0) {
                sum[i] = 1;
                carry = 0;
            }
            else if (carry == 0 && a[i] == 1 && b[i] == 1) {
                sum[i] = 0;
                carry = 1;
            }
            else if (carry == 1 && a[i] == 0 && b[i] == 0) {
                sum[i] = 1;
                carry = 0;
            }
            else if (carry == 1 && a[i] == 0 && b[i] == 1) {
                sum[i] = 0;
                carry = 1;
            }
            else if (carry == 1 && a[i] == 0 && b[i] == 0) {
                sum[i] = 1;
                carry = 0;
            }
            else if (carry == 1 && a[i] == 1 && b[i] == 1) {
                sum[i] = 1;
                carry = 1;
            }

        }
        System.out.println("\n");
        System.out.println("Sum : ");
        System.out.print(carry +"\t");
        BinaryChecksum.carry = carry;

        return (sum) ;



    }
     // method to reverse the array of last output
    public int[] reverseArray(int[] sum) {
    	for(int i = 0; i < sum.length / 2; i++)
    	{
    	    int temp = sum[i];
    	    sum[i] = sum[sum.length - i - 1];
    	    sum[sum.length - i - 1] = temp;
    	}
		return sum;
	}
    
    
    // method that will add last carry to final answer
	public int[] addCarryToFinalBitArray(int[] sum, Integer carry) {
    	if(sum.length != 8)
    		System.exit(1);
    	else{
    		int lastIndexValue = sum[sum.length-1];
        	if (lastIndexValue == 0 && carry == 0) {
                lastIndexValue = 0;
            }
            else if (lastIndexValue == 0 && carry == 1) {
                lastIndexValue = 1;
            }
            else if (lastIndexValue == 1 && carry == 0) {
                lastIndexValue = 1;
            }
            else if (lastIndexValue == 1 && carry == 1) {
                lastIndexValue = 0;
            }
            else if (lastIndexValue == 0 && carry == 0) {
                lastIndexValue = 1;
            }
            else if (lastIndexValue == 0 && carry == 1) {
                lastIndexValue = 0;
            }
            else if (lastIndexValue == 0 && carry == 0) {
                lastIndexValue = 1;
            }
            else if (lastIndexValue == 1 && carry == 1) {
                lastIndexValue = 1;
            }
        	sum[sum.length-1]=lastIndexValue;
        	return sum;
    	}
		return sum;
	}

	// method that will check for binary and 8 bits error
	int[] Converter(String s) {
        int[] a = new int[8];
        if (s.length() != 8) {
            System.out.println("Enter 8 bit binary only. Run Again: ");
            System.exit(1);
        }

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i)) == '0') {
                a[i] = 0;
            } else if ((s.charAt(i)) == '1') {
                a[i] = 1;
            } else {
                System.out.println("Error: Binary includes only 1 and 0. Run Again! ");
                System.exit(1);
            }

        }

        return a;
    }
}

