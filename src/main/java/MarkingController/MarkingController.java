package MarkingController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


public class MarkingController {
    /* Percentage Value (input)
    >= 88% = 1
    >= 75% and < 88% = 2
    >= 63% and < 75% = 3
    >= 50% and < 63% = 4
    < 50% = 5
     */

    double percentage;
    int grade;

    if(percentage < 50){
        grade = 5;
    }else if(percentage >= 50 &&){

    }


}







