package com.repls;

/*
A bracket is considered to be of the following characters: (, ).
Two brackets are considered to be a matched pair if the an opening bracket "(" occurs to the left of a closing bracket ")" of the exact same type.
A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, "(()" is not balanced because the contents is not balanced.
By this logic, we say a sequence of brackets is balanced if the following conditions are met:
It contains no unmatched brackets. The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets. Given strings of brackets, determine whether each sequence of brackets is balanced.
 If a string is balanced, return true. Otherwise, return false.
Function Description
Complete the function isBalanced in the editor below.
isBalanced has the following parameter(s):
string s: a string of brackets Returns
string: either true or false
Examples
input "(()" -> false
input "(" -> false
input ")" -> false
input "(()))" -> false
input "(())" -> true
input "()" -> true
input ")()(" -> true
 */

public class Repl215 {
    public static void main(String[] args) {
        System.out.println(isBalanced("(())"));
    }

    public static boolean isBalanced(String s){
        int leftBracket=s.replace(")","").length();
        int rightBrackets=s.replace("(", "").length();
        return leftBracket==rightBrackets;

    }

}












































/*
package com.collection.Coding;
public class BalancedParantheses {
    public static void main(String[] args) {
        System.out.println(isBalanced("()))))))))))))))))))))))()()))()))))))))
        ()))))))()))()))))(()))))))))))))()))))))(()))))))))()()))))))))))))()))))(())
        ()))))))(()))))()))))))()))()())))())))))))))))()))())(()()())()()())))))()))))())
        ()))()))))))))))))))()())))()))))()))))))()))())()))())))(()))()))))))))())))())))
        (())()))))()((()))))))((((()())())())(())))))())())))))))())))))()(()))))()))))
        ())))))()())())()))()))))))))()))))))))))()))))())))))(((()))))()))((())))())))))))
        ())))()()())())))))())))())())))))(())())))))))())))()()))))))))))))(())())())))
        ((()))))))(())))()())))()))))(())))(())))))))))))))(())))(())()))))(()))())
        ())))))))()())(()(())())))))))))))))))))))))))((()())))())))())))((()())))()))())
        ()))))())()())))))))))))(()))))))))))))))()))))))()))))))))))))))))(()(()))(()))
        ()))))))()))()()))))))))))()))())()))))())))()()()))()))))(())))))))))))))()()))))
        (())))()))))))()))()())()))())()())())))()()(()())))))()())))))))())))())))(())))
        ())))))))()))))))))()((()(())))))))))(())))())))())))))))))()())))()))))))))("));
    }
    static boolean isBalanced(String s){
        int originalSize=s.length();
        String newStr=s.replaceAll("[(]","");
        int numberOfLeftParan=originalSize-newStr.length();
        int rightParanthese=newStr.length();
        return Math.abs(rightParanthese - numberOfLeftParan) == 0;
    }
}
 */
