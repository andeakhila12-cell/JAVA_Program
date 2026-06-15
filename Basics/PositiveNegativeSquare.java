package basic;

public class PositiveNegativeSquare {
    // Method to classify and square a number
    public static void classifyAndSquare(int num) {
        String classification;
        int square = num * num;
        
        if (num > 0) {
            classification = "Positive";
        } else if (num < 0) {
            classification = "Negative";
        } else {
            classification = "Zero";
        }
        
        System.out.println("Number: " + num + " | Classification: " + classification + " | Square: " + square);
    }

    public static void main(String[] args) {
        int[] numbers = {-10, -5, 0, 3, 7, 12, -8, 15};
        
        System.out.println("Number Classification and Squaring:");
        System.out.println("=====================================");
        
        for (int num : numbers) {
            classifyAndSquare(num);
        }
        
        // Separate positive and negative
        System.out.println("\n\nSeparated List:");
        System.out.println("================");
        
        System.out.println("Positive Numbers and their squares:");
        for (int num : numbers) {
            if (num > 0) {
                System.out.println(num + " -> " + (num * num));
            }
        }
        
        System.out.println("\nNegative Numbers and their squares:");
        for (int num : numbers) {
            if (num < 0) {
                System.out.println(num + " -> " + (num * num));
            }
        }
    }
}
