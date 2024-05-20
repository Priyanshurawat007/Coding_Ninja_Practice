public class Solution{
static int[][] multiply(int[][] a, int[][] b) {
int mod = (int) (1e9 + 7);
int[][] c = new int[2][2];
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 2; j++) {
c[i][j] = 0;
}
}
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 2; j++) {
for (int k = 0; k < 2; k++) {
c[i][k] = (int) ((c[i][k] + (long) ((long) a[i][j] * (long) b[j][k])) % mod);
}
}
}

return c;
}

// Function to calclate n'th power of a matrix.
static int[][] matrix_power(int[][] coef, int n) {

// To store the resultant matrix.
int[][] res = {{1, 0}, {0, 1}};

// While loop till n > 0.
while (n > 0) {
// If n is odd, multiply res with coef.
if (n % 2 != 0) res = multiply(res, coef);

// Multiply coef with coef and update n to n/2.
coef = multiply(coef, coef);
n /= 2;
}

return res;

}

public static int fibonacciNumber(int n) {
int[][] coef = {{0, 1}, {1, 1}};

// Calculating the (n-1)th power of the coef matrix.
int[][] res = matrix_power(coef, n - 1);

// Return the bottom right element of the resultant matrix.
return res[1][1];


}
}
