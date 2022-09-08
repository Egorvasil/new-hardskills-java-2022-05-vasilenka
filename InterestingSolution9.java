public class InterestingSolution9 {
    /*  Symbol       Value
      I             1
      V             5
      X             10
      L             50
      C             100
      D             500
      M             1000*/
    public static void main(String[] args) {
        System.out.println(romanToInt("XII"));
    }
    public static int romanToInt(String s) {
        int[] nums = new int[s.length()]; //if "s"="XII" - length=3;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) { //method charAt() convert String to char type
                case 'M':
                    nums[i] = 1000;
                    break;
                case 'D':
                    nums[i] = 500;
                    break;
                case 'C':
                    nums[i] = 100;
                    break;
                case 'L':
                    nums[i] = 50;
                    break;
                case 'X':
                    nums[i] = 10; //it will be first element of our array;
                    break;
                case 'V':
                    nums[i] = 5;
                    break;
                case 'I':
                    nums[i] = 1; //it will be the second and third element
                    break;
            }
        } //now we create NUMS array with[10, 1, 1];
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) //first iteration is: if 10 less than 1 - false
                sum -= nums[i];
            else
                sum += nums[i]; //after last iteration(2nd). sum=10;
        }
        return sum + nums[nums.length - 1];
    }
}