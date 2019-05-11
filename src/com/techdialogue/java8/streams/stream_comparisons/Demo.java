package com.techdialogue.java8.streams.stream_comparisons;


import java.util.Stack;

/**
 * @author Rishabh Rawal
 * @date 1/23/18
 */

class Demo {
    private static int solution(String S) {
        // write your code in Java SE 8
        String[] values = S.split(" ");

        Stack<Integer> stack = new Stack<>();
        int temp1 = 0;
        int temp2 = 0;
        int result =0;
        for (String val : values) {

            try {
                temp1 = Integer.parseInt(val);
                stack.push(temp1);
                continue;
            } catch (NumberFormatException e) {
                //do nothing
            }
            switch (val) {
                case "POP":
                    if (!stack.empty()) {
                        stack.pop();
                    }else{
                        return -1;
                    }
                    break;
                case "DUP":
                    if (!stack.empty()) {
                        temp1 = stack.peek();
                        stack.push(temp1);
                    }else {
                        return -1;
                    }
                    break;
                case "+":
                    if (!stack.empty()) {
                        temp1 = stack.pop();
                    } else {
                        return -1;
                    }

                    if (!stack.empty()) {
                        temp2 = stack.pop();
                    }else {
                        return -1;
                    }
                    result=temp1+temp2;
                    //handle overflow
                    if(result > (1<<20 -1)){
                        return -1;
                    }
                    stack.push(temp1+temp2);
                    break;
                case "-":
                    if (!stack.empty()) {
                        temp1 = stack.pop();
                    } else {
                        return -1;
                    }

                    if (!stack.empty()) {
                        temp2 = stack.pop();
                    }else {
                        return -1;
                    }

                    result=temp1-temp2;
                    //handle underflow
                    if(result<0){
                        return -1;
                    }
                    stack.push(result);
                    break;
                default:
                    //nothing

            }
        }
        if(!stack.empty()){
            return stack.pop();
        }else {
            return -1;
        }
    }

    public static void main(String[] args){
        String arr = "8 5 -";
        System.out.println(solution(arr));
    }
}