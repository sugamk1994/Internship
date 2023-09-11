public class table {
        public static void main(String[] args)
        {
            int N = 7; // number n for which we have to print the
     
            int range = 10;  // range of the table to print.
            int i = 1;      // using i variable to count the range value to run the loop.
     
            // using while loop
            while (i <= range) {
     
                // printing the N*i,ie ith multiple of N.
                System.out.println(N + " * " + i + " = "
                                   + N * i); // print the value or n*i
                i++;        // incremnt the value of the util the i is less than or equal to i.
            }
        }
    }
