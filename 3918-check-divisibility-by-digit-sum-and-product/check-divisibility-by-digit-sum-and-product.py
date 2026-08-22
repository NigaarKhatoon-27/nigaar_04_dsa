class Solution:
    def checkDivisibility(self, n: int) -> bool:
        # Convert n to string to access individual digits
        digits = [int(d) for d in str(n)]
        
        # Calculate the sum of digits
        digit_sum = sum(digits)
        
        # Calculate the product of digits
        digit_product = 1
        for d in digits:
            digit_product *= d
            
        # Check if n is divisible by the sum of digit_sum and digit_product
        total_divisor = digit_sum + digit_product
        
        return n % total_divisor == 0
