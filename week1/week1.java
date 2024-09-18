class week1 {
 int previous(int n) {
     return n-1;
}

double doubleOf(double n) {
     return n*2;
}

int square(int n) {
    return n*n;
}

int difference(int a, int b) {
    return a-b;
}

double avg(double d, double b) {
    return (d + b)/2;
}

double average(int a, int b) {
    return 0.0;
}

int round(double n) {
    return (int) (n+.5);
}

boolean isEven(int n) {
    return n % 2 == 0;
}

boolean isOdd(int n) {
    return true;
}

double abs(double a) {
    return a < 0 ? -a : a;
}

double min(double a, double b) {
    return a < b? a: b;
}

int sum(int n) {
    return 0;
}

boolean isVowel(char c) {
    return true;
}

boolean xor(boolean a, boolean b) {
    return true;
}

boolean sameSig(int a, int b) {
    return a < 0 ^ b < a;
} 
}

