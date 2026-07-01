package arr;

public class notes {
	    public static void main(String[] args) {

	        int one = 2;
	        int five = 4;
	        int purchase = 21;

	        if ((one + five * 5) < purchase) {
	            System.out.println(-1);
	            return;
	        }

	        int note5 = purchase / 5;

	        if (note5 > five)
	            note5 = five;

	        while (note5 >= 0) {

	            int note1 = purchase - (note5 * 5);

	            if (note1 <= one) {
	                System.out.println("$5 notes needed = " + note5);
	                System.out.println("$1 notes needed = " + note1);
	                return;
	            }

	            note5--;
	        }

	        System.out.println(-1);
	    }
	}

