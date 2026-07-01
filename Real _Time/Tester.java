package arr;

public class Tester {
	
	    public static void main(String[] args) {

	        int num = 123;
	        int temp = num;
	        int seed = 738;

	        int mul = 1;

	        while (num != 0) {
	            int digit = num % 10;
	            mul = mul * digit;
	            num = num / 10;
	        }

	        if (temp * mul == seed)
	            System.out.println(temp + " is a seed of " + seed);
	        else
	            System.out.println(temp + " is not a seed of " + seed);
	    }
	}

