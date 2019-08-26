package example;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tw.commands.GuessInputToList;


public class GuessGameTest {

    @BeforeAll
    public static void setUp() {

    }
    @BeforeEach
    public void clearUp() {

    }
    @Test
    public void should_return_List_when_input_is_String() {
        //given
        List<Integer> list=new ArrayList<Integer>();

        GuessInputToList guessInputToList=new GuessInputToList();
        String input="1 2 3 4";
        //when
        List<Integer> inputArr=guessInputToList.getArray(input);
        //System.out.println(inputArr);
        //System.out.println(input.length());
        //then
        assertEquals((Integer)1,inputArr.get(0));
        assertEquals((Integer)2,inputArr.get(1));

    }
    
    @Test
    public void should_return_String_AB_when_input_and_answer() {
        //given
        List<Integer> list=new ArrayList<Integer>();

        GuessInputToList guessInputToList=new GuessInputToList();
        String input="1 5 6 7";
        String answer="1 2 3 4";
        List<Integer> inputArr=guessInputToList.getArray(input);
        
        List<Integer> answerArr=guessInputToList.getArray(answer);
        System.out.println(inputArr);
        //when
        String same =guessInputToList.sameCount(answerArr, inputArr);
        System.out.println(same);
        //System.out.println(inputArr);
        //System.out.println(input.length());
        //then
        assertEquals("1A0B",same);
        //assertEquals((Integer)2,inputArr.get(1));

    }


}