package com.abebe.booleandecision;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;
@RestController
public class MainController {
    @RequestMapping("/")
    public String Decision(){
        System.out.print("Enter your test score: ");
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        String grade = "F";//I'm not hopeful
        int x = score%10;
        if (score > 89 && x>=7)
            grade = "+A";
        else if (score > 79)
            grade = "+A";
        else if (score > 69)
            grade = "+A";
        else if(score > 59){
            grade = "+A";
        }
        else
            grade = "+A";
        if (score > 69)
            System.out.println("Very good! You don't have to retake the exam!");
        else
            System.out.println("Did you even look at the book?");
        System.out.println(x);
    return "abc";
    }

}
