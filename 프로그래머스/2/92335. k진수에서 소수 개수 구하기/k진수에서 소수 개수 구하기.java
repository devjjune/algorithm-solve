class Solution {
    public int solution(int n, int k) {
        
        StringBuilder converted = new StringBuilder();
        
        while (n >= 1) {
            converted.append(n % k);
            n = n / k;
            
        }
        converted.reverse();
        
        String[] items = converted.toString().split("0", -1);
        
        int result = 0;
        
        for (String item : items) {
            if (item.length() == 0) {
                continue;
            } else if (isPrime(Long.parseLong(item))) {
                result++;
            }
        }
        
        return result;
            
    }
    
    boolean isPrime(long num) {
        if (num < 2) return false;
        
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}