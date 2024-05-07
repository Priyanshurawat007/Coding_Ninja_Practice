 // Handle division by zero edge case
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
        
        // Determine the sign of the result
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        
        // Convert both dividend and divisor to positive to simplify calculation
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);
        
        // Perform division using repeated subtraction (or addition)
        long quotient = 0;
        while (absDividend >= absDivisor) {
            absDividend -= absDivisor;
            quotient++;
        }
        
        // Apply the sign to the quotient
        quotient = sign * quotient;
        
        // Check if the quotient is within the 32-bit signed integer range
        if (quotient > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (quotient < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        
        return (int) quotient;
    }
    
