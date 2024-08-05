import java.util.Scanner;

class Practice{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = input.nextInt();
		
		printTable(num);
		
		int resultOddSum = oddSum(num);
		System.out.println("Sum of odd nos. till " + num + " is " + resultOddSum);
		
		long resultFactorial = factorial(num);
		System.out.println("Factorial of " + num + " is " + resultFactorial);
		
		int digitSum = sumOfDigits(num);
		System.out.println("Sum of digits of " + num + " is " + digitSum);
		
		System.out.print("Enter the 2nd number: ");
		int num2 = input.nextInt();
		
		int lcm = calculateLcm(num, num2);
		System.out.println("LCM is " + lcm);
		
		boolean primeNum = isPrime(num);
		if (primeNum){
			System.out.println("It is prime");
		} else {
			System.out.println("Not prime");
		}
		
		int hcf = calculateHcf(num, num2);
		System.out.println("HCF is " + hcf);
		
		int rev = reverseDigit(num);
		System.out.printf("Digit is %d and its reverse is " + rev, num);
		System.out.println();
		
		System.out.print("Fibonacci series: ");
		printFibonacci();
		
		System.out.println();
		isPalindrome(num);
		
		String str = input.next();
		isStrPalindrome(str);
		
		isArmstrong(num);
	}

	public static void printTable(int num){
		for (int i=1; i<=10; i++){
			 System.out.println(num + " X " + i + " = " + (num*i));
		}
	}

	public static int oddSum(int num){
		int sum = 0;
		for (int i=1; i<=num; i++){
			if(i%2 != 0){
				sum += i;
			}
		}
		return sum;
	}
	
	public static long factorial(int num){
		int result = 1;
		if(num > 0){
			for(int i=num; i>0; i--){
				result *= i;
			}
		}
		return result;
	}
	
	public static int sumOfDigits(int num){
		int result = 0;
		while(num>0){
			result += num%10;
			num /= 10;
		}
		return result;
	}
	
	
	public static int calculateLcm(int num, int num2){
		int result = (num > num2) ? num : num2;
	  while(true){
		  if (result % num == 0 && result % num2 == 0)
        break;
        result++;
		}
		return result;
	}
	
	public static boolean isPrime(int num){
		for (int i=2; i<(num/2); i++){
			if((num%i) == 0){
				return false;
			}
		}
		return true;
	}
	
	public static int calculateHcf(int num, int num2){
		if (num == num2){
			return num;
		}
		while (num != num2){
			if(num > num2){
				num -= num2; 
			} else{
				num2 -= num; 
			}
		}
		return num2;
	}
	
	public static int reverseDigit(int num){
		int result = 0;
		while(num>0){
			int temp = num%10;
			result = result*10+temp; 
			num = num/10;
		}		
		return result;
	}
	
	public static void printFibonacci(){
		int num = 0;
		int num2 = num+1;
		int sum = 0;
		System.out.print(num + ", ");
		System.out.print(num2 + ", ");
		for (int i=2; i<10; i++){
			sum = num+num2;	
			num = num2;
			num2 = sum;
			System.out.print(sum + ", ");
		}		
	}
	
	public static void isPalindrome(int num){
		int rev = 0;
		int newNum = num;
		while(num>0){
			int temp = num%10;
			rev = rev*10+temp;
			num = num/10;
		}
		if(rev == newNum){
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
	
	public static void isStrPalindrome(String str){
		char[] charArray = str.toLowerCase().toCharArray();
		int len = str.length();
		boolean flag = false;
		for(int i=0; i<len/2; i++){
			if(charArray[i] == charArray[len-1]){
				len--;
				flag = true;
			}
		}
		if (flag == true){
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
	
	static void isArmstrong(int num){
	  int flag = 0;
	  int number = num;
	  int sum = 0;
	  int digit = num;
	  while (num>0){
	    int temp = num%10;
	    flag++;
	    num /= 10;
	  }
	  while (number>0){
	    int temp = number%10;
	    sum = sum + (int)Math.pow(temp, flag);
	    number /= 10;
	  }
	  if(digit == sum){
	    System.out.println("Armstrong");
	  } else {
	    System.out.println("Not Armstrong");
	  }
	}
	
}
