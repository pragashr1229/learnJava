package com.learnjava.streams;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsMaxMinExample {


    public static Integer maxValue(List<Integer> integerList){
        return integerList.stream()
        	.reduce(0,(a,b)->(a>b) ? a : b);
       // .reduce(Integer::max);
    }

    public static Integer minValue(List<Integer> integerList){
        return integerList.stream()
                //.reduce((a,b)->(a<b) ? a : b);
                .reduce(0,Integer::min);
    }


    public static void main(String[] args) {
    	
        List<Integer> integers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).collect(Collectors.toList());
        

        
        Integer maxValue =maxValue(integers);
        //int max = maxValue.isPresent() ? maxValue.get():0;
        System.out.println("Max Value is : " + maxValue);

        Integer minValue =minValue(integers);
        //int min = maxValue.isPresent() ? minValue.get():0;
        System.out.println("Min Value is : " + minValue);
    }
}
