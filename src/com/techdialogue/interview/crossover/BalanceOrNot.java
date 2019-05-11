package com.techdialogue.interview.crossover;

import java.util.Stack;

/**
 * @author Rishabh Rawal
 * @date 1/30/18
 */
public class BalanceOrNot {

    static int[] balancedOrNot(String[] expressions, int[] maxReplacements) {

        int[] results = new int[expressions.length];
        StringBuilder current = null;
        int maxr=0;
        Stack<Character> stack = new Stack<>();
        for(int i =0; i<expressions.length; i++){
            current = new StringBuilder(expressions[i]);
            maxr = maxReplacements[i];
            int counter = 0;
            int replacementsDone=0;
            int result=0;

            outer:
            while(counter<current.length()){
                switch(current.charAt(counter)){
                    case '<' :
                        counter++;
                        stack.push('<');
                        break;
                    case '>' :
                        if (!stack.empty() && stack.peek()=='<'){
                            counter++;
                            stack.pop();
                            break;
                        }
                        else if(replacementsDone==maxr){
                            break outer;
                        } else {
                            if(!stack.empty()) stack.pop();
                            current = current.replace(counter,counter+1,"<>");
                            replacementsDone++;
                        }
                }
            }

            if(counter ==current.length()) result=1;

            results[i] = result;

            System.out.println(current);
        }
        return results;
    }
}
