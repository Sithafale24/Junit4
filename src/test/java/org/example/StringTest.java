package org.example;


import com.thoughtworks.xstream.mapper.SystemAttributeAliasingMapper;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringTest {

    String[] testArray={"a","b","c","d","e"};
    Stream<String> stream1= Arrays.stream(testArray);
    //stream1.forEach(x-> System.out.println(x);
    Stream<String> stream2=Stream.of(testArray);
}
