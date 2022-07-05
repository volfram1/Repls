package com.repls;

/*
For you to do:
By using the switch statement concept please validate what is the responsibility each instructor in the syntax solution.
First Output: "Enter name of the instructor"
case 1: if User provided the name as Asghar as input it should show  "Will take care of Java Assignment"
case 2: if User provided the name as Moazzam as input it should show  "Will take care of SDLC Assignment"
case 3: if User provided the name as Weqas as input it should show  "Will take care of Selenium Assignment"
case 4: if User provided the name as Asel as input it should show  "Will take care of every Assignment"
Other than these four names if the user provides any other names --> " Invalid instructor selected"
 */

import java.util.Locale;
import java.util.Scanner;

public class Repl040 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the name of the instructor");
        String instructor= input.nextLine();
        switch (instructor.toLowerCase()){
            case "asghar":
                System.out.println("java");
               break;
            case "mozzam":
                System.out.println("sdlc");
                break;
            case "wegas":
                System.out.println("selenium");
                break;
            case "asel":
                System.out.println("every assignment");
                break;
            default:
                System.out.println("invalid instructor");
        }
    }
}
