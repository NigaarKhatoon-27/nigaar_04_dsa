class Solution {
public:
int Fib(int n){
    if(n<=1){
        return n;
    }
    return Fib(n-1) + Fib(n-2);
}
    int fib(int n) {
        int nthFib = Fib(n);
        return nthFib;
    }
};