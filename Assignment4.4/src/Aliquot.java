
public class Aliquot {

    
    public static void main(String[] args) {
          int divisors(int n){
    if(n==1) return 0;
    int sum = 1;
    for(int i = 2; i <= Math.sqrt(n); i++) {
        if(n % i == 0) {
            sum += i;
            int d = n/i;
            if(d != i) {
                sum+=d;
            }
        }
    }
    return sum;
}

// use this 
void sequence(int n){
    System.out.println(n);
    int div = divisors(n);
    while(div>0) {
        System.out.println(div);
        div = divisors(div);
    }
    System.out.println(div);
}
    }
    
}
