package LeetCode;

public class CNinjas_Prime {
   
        public static String isPrime(int num) {
                if (num < 2) {
                return "NO";
            }
    
           
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return "NO"; 
                }
            }
    
           
            return "YES";
        }
    }

