// import java.util.Arrays;
// import java.util.Scanner;
// public class Main{
//     public static void new_func(){
//         System.out.println("hi");
//     }
//     public static void main(String[] args){
//         // we can't create the 2 variables with same name
//         // String name = "Abhinav";
//         // char a = 'a';
//         // char c = 65;//stores Ascill values
//         // int b = 1;
//         // boolean d = true;
//         // float val = 3.14F;
//         // long phone_num = 12345678900000L;

//         // System.out.println("hello");
//         // System.out.println("hello java");
//         // System.out.println(name);
//         // System.out.println(a);
//         // System.out.println(b+"hello");
//         // System.out.println(c);
//         // System.out.println(System.identityHashCode(a));
//         // System.out.println(d);

//         // System.out.println(val);
//         // System.out.println(phone_num);
        
//         // String name = "Abhinav";
//         // finding string length
//         // System.out.println(name.length());
//         // // string concatination
//         // String last_name = new String("Raavi");
//         // System.out.println(name +" "+last_name);

//         // char at keyword
//         // System.out.println(name.charAt(0));
//         // for(int i = 0;i < name.length(); i ++){
//         //     System.out.print(name.charAt(i) + " "); //this is used to print the text in same line
//         //     System.out.println(name.charAt(i) + " ");// this is used to print the text in next line
//         // }
//         // System.out.println();

//         // replace keyword
//         // String new_string = name.replace("A","Z");
//         // System.out.println(new_string);
//         // System.out.println(name.replace("A","Z"));

//         // // substring
//         // System.out.println(name.substring(0,3));

//         // if we don't initilize anything after we create the variables null values will initilize to them defaultly
//         // Arrays
//         // int[] new_array = new int[3];
//         // new_array[0] = 3;
//         // new_array[1] = 2;
//         // new_array[2] = 1;

//         // System.out.println(new_array[0]);//we can't directly print array 
//         // for(int i = 0;i<new_array.length;i++){
//         //     System.out.println(new_array[i]);
//         // }

//         // Arrays.sort(new_array);//we have to import Arrays module to sort the arrays
//         // for(int i = 0;i<new_array.length;i++){
//         //     System.out.print(new_array[i]+" ");
//         // }

//         // int[] array = {1,2,3};
//         // System.out.println(array);

//         // 2-d array's
//         // int [][] array1 = {{1,2,3},{4,5,6}};
//         // System.out.println(array1[0][0]);

//         // array1[0][0] = 10;
//         // System.out.println(array1[0][0]);

//         // int a = 1;
//         // int res = a + (int)1.0;  //this is explict casting ,converting the variables to fit in the mentioned datatype
//         // System.out.println(res);//it will remove all the values after .

//         // int a = 1;
//         // float res = a + 1.2f;  //this is implict type casting ,where the size of the variable where we store output is larger then the current variable
//         // System.out.print(res);

//         // final keyword ,this is used to fix the values and we can't change it afterwards
//         // final int a = 1;
//         // a = 2;//we can't do this
//         // a += 1;
//         // System.out.println(a);

//         // int a = 5;
//         // int b = 2;

//         // System.out.println((float)a/b);
//         // a++; //uranary operatores 
//         // ++a; //in this case first the value increment and then the updated value gets printed 
//         // b++;
//         // --a;
//         // --b;
//         // System.out.print(a+" "+b);

//         // math function
//         // int a = 10;
//         // int b = 20;

//         // System.out.println(Math.max(a,b));
//         // System.out.println(Math.min(a,b));
//         // System.out.println(Math.random());

//         //scanner object to take input
//         // Scanner take_input = new Scanner(System.in);

//         // // int a = take_input.nextInt();
//         // // float b = take_input.nextFloat();   //we should not write the nextline after taking any inputs ,if we do so we can't able to take the input
//         // String h = take_input.next();          //this can't take input after spaces 
//         // String name = take_input.nextLine();   // this takes leftover input
        
//         // // System.out.println(a);
//         // System.out.println(name);
//         // System.out.println(h);

//         // Scanner sc = new Scanner(System.in);

//         // // Input two numbers
//         // System.out.print("Enter first number: ");
//         // int a = sc.nextInt();

//         // System.out.print("Enter second number: ");
//         // int b = sc.nextInt();

//         // // Using if-else to find max
//         // int max1;
//         // if (a > b) {
//         //     max1 = a;
//         // } else {
//         //     max1 = b;
//         // }

//         // System.out.println("Max using if-else: " + max1);

//         // // Using conditional (ternary) operator to find max
//         // int max2 = (a > b) ? a : b;
//         // System.out.println("Max using conditional operator: " + max2);

//         // // Example: check if number is even or odd using ternary operator
//         // String result = (a % 2 == 0) ? "Even" : "Odd";
//         // System.out.println("First number is: " + result);

//         // boolean adult = true;

//         // if (!adult){
//         //     System.out.println("children");
//         // }
//         // else{
//         //     System.out.println("adult");
//         // }


//         // Scanner sc = new Scanner(System.in);
//         //logical operators
//         // // Input two boolean conditions (simulated using integers)
//         // System.out.print("Enter first boolean (true/false): ");
//         // boolean cond1 = sc.nextBoolean();

//         // System.out.print("Enter second boolean (true/false): ");
//         // boolean cond2 = sc.nextBoolean();

//         // // Logical AND
//         // boolean resultAnd = cond1 && cond2;
//         // System.out.println("cond1 && cond2 = " + resultAnd);

//         // // Logical OR
//         // boolean resultOr = cond1 || cond2;
//         // System.out.println("cond1 || cond2 = " + resultOr);

//         // // Logical NOT
//         // System.out.println("!cond1 = " + !cond1);
//         // System.out.println("!cond2 = " + !cond2);

//         // // Example with conditions
//         // int age = 20;
//         // boolean hasID = true;

//         // if (age >= 18 && hasID) {
//         //     System.out.println("Allowed to enter (using &&)");
//         // }

//         // if (age < 18 || !hasID) {
//         //     System.out.println("Not allowed to enter (using || and !)");
//         // }

//         //do while
//         // int i = 0;
//         // do{
//         //     System.out.print(i);
//         // }while(i >0);


//         //bitwise operators
//         // int a = 5;    // Binary:  0101
//         // int b = 3;    // Binary:  0011

//         // // Bitwise AND
//         // int andResult = a & b;  // 0101 & 0011 = 0001 = 1
//         // System.out.println("a & b = " + andResult);

//         // // Bitwise OR
//         // int orResult = a | b;   // 0101 | 0011 = 0111 = 7
//         // System.out.println("a | b = " + orResult);

//         // // Bitwise XOR
//         // int xorResult = a ^ b;  // 0101 ^ 0011 = 0110 = 6
//         // System.out.println("a ^ b = " + xorResult);

//         // // Bitwise NOT
//         // int notA = ~a;          // ~0101 = 1010 (2's complement form)
//         // System.out.println("~a = " + notA);  // = -6

//         // // Left shift
//         // int leftShift = a << 1; // 0101 << 1 = 1010 = 10
//         // System.out.println("a << 1 = " + leftShift);

//         // // Right shift
//         // int rightShift = a >> 1; // 0101 >> 1 = 0010 = 2
//         // System.out.println("a >> 1 = " + rightShift);

//         // // Unsigned right shift
//         // int unsignedRightShift = a >>> 1; // 0101 >>> 1 = 0010 = 2
//         // System.out.println("a >>> 1 = " + unsignedRightShift);

//         // // Extra: test unsigned right shift on negative number
//         // int neg = -8; // Binary (32-bit): 11111111 11111111 11111111 11111000
//         // System.out.println("neg >>> 1 = " + (neg >>> 1));  // Large positive number


//         // Scanner sc = new Scanner(System.in);

//         // System.out.print("Enter a number (1 to 7): ");
//         // int day = sc.nextInt();

//         // // Using switch statement
//         // switch (day) {
//         //     case 1:
//         //         System.out.println("Monday");
//         //         break;
//         //     case 2:
//         //         System.out.println("Tuesday");
//         //         break;
//         //     case 3:
//         //         System.out.println("Wednesday");
//         //         break;
//         //     case 4:
//         //         System.out.println("Thursday");
//         //         break;
//         //     case 5:
//         //         System.out.println("Friday");
//         //         break;
//         //     case 6:
//         //         System.out.println("Saturday");
//         //         break;
//         //     case 7:
//         //         System.out.println("Sunday");
//         //         break;
//         //     default:
//         //         System.out.println("Invalid input! Please enter a number between 1 and 7.");
//         // }

//         // Scanner scanner = new Scanner(System.in);
        
//         // try {
//         //     System.out.print("Enter a number: ");
//         //     int num = Integer.parseInt(scanner.nextLine());
//         //     int result = 10 / num;
//         //     System.out.println("Result is: " + result);
//         // } catch (ArithmeticException e) {
//         //     System.out.println("Cannot divide by zero.");
//         // } catch (NumberFormatException e) {
//         //     System.out.println("Invalid number format.");
//         // } finally {
//         //     System.out.println("Program ended.");
//         //     scanner.close(); // Important cleanup
//         // }

//         // int[] a = {1,2,3};

//         // try{
//         //     System.out.println(a[4]);
//         // }catch(Exception e){
//         //     System.out.print(e);
//         // }finally{
//         //     System.out.println("Finally");
//         // }

//         new_func();
//         new_func();
//         new_func();

//     }
// }
// public class Main{
//     public static void new_func(String name){
//         System.out.println(name);
//     }
//     public static void main(String[] args){
//         new_func("Abhinav");
//         new_func("raavi");
//         new_func("1177");
//     }
// }

// public class Main{
//     public static void sum(int n1,int n2){
//         System.out.println(n1+n2);
//     }
//     public static void main(String[] args){
//         sum(1,2);
//     }
// }


// sum of 2 numbers returning function

// class Main{
//     public static int sum(int n1,int n2){
//         return n1+n2;
//     }
//     public static void main(String[] args){
//         System.out.println(sum(1,2));
//         System.out.println(Math.random());
//     }
// }


// import java.util.Arrays;
// class Main{
//     public static void main(String[] args){
//         // int a = 1;
//         // int b = 1;

//         int[] new_arr = {1,2,3};
//         int[] new_arr1 = {1,2,3};

//         System.out.println(new_arr == new_arr1);
//         System.out.println(new_arr.equals(new_arr1));
//         System.out.println(Arrays.equals(new_arr,new_arr1));
        
        // String c = "a";
        // String d = new String("a");

        // System.out.println(c.equals(d));//this checks the values

        // System.out.println(c == d);//this checks the reference
        // System.out.println(a == b);
//     }
// }

// class Main{
//     public static void main(String args[]){
//         //finding largest of 3 numbers using ternery operators
//         int a = 15;
//         int b = -2365;
//         int c = 1354;


//         // ternery operators these are short form of if else condition in java
//         //syntax = condition ? value to return if true : value to return if False

//         int max = (a > b) ? ((a > c) ? a:c):((b > c) ? b:c);
//         System.out.println(max);

//     }
// }