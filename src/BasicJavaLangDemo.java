public class BasicJavaLangDemo {

    public static void main(String[] args) {
        // 1. 使用 String 類別
        String greeting = "Hello, Java!";
        System.out.println("Greeting: " + greeting);

        // 字串方法範例
        System.out.println("Length of greeting: " + greeting.length());
        System.out.println("Substring (7-11): " + greeting.substring(7, 11));
        System.out.println("Uppercase: " + greeting.toUpperCase());

        // 2. 使用 Math 類別
        double number = -25.5;
        System.out.println("Absolute value: " + Math.abs(number));
        System.out.println("Square root: " + Math.sqrt(Math.abs(number)));
        System.out.println("Power (2^3): " + Math.pow(2, 3));

        // 3. 使用 Integer 類別
        int intValue = Integer.parseInt("42");
        System.out.println("Parsed integer: " + intValue);
        System.out.println("Integer to binary string: " + Integer.toBinaryString(intValue));

        // 4. 使用 System 類別
        long currentTime = System.currentTimeMillis();
        System.out.println("Current time in milliseconds: " + currentTime);
    }
}

