public class App {
    public static void main(String[] args) throws Exception {
        //store 5 roll numbners
        int a = 10;
        //Syntax of array
        // data_type[] array_name = new data_type[size];

        int[] roll_numbers = new int[5];
        //or directly initialize an array
        int[] roll_numbers2 = {1, 2, 3, 4, 5};

        //decclaration of array
        int[] roll_numbers3; // roll_numbers is getting defined in stack
        roll_numbers3 = new int[5]; // roll_numbers is getting initialized in heap
        
         System.out.println("Length of array is: " + roll_numbers.length);
         System.out.println("Length of array is: " + roll_numbers2.length);
         System.out.println("Length of array is: " + roll_numbers3.length);

         //2D Array
        
        int[][] arr = new int[3][3];

        int[][] arr2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Length of 2D array is: " + arr[1][1]);
        System.out.println("Length of 2D array is: " + arr2[0][0]);

    }
} 