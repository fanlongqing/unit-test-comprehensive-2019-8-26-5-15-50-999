package tw;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.OutputDeviceAssigned;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

import tw.commands.GuessInputCommand;
import tw.commands.GuessInputToList;

/**
 * Created by jxzhong on 2017/5/16.
 */
public class Main {

    private static final int RUN_TIMES = 6;
    static String str="1 2 3 4";
    public static void main(String[] args) throws Exception {
     String same = "";
     GuessInputToList guessInputToList = new GuessInputToList(); 
     List <Integer> answer =guessInputToList.getArray(str);
     
     for (int i = 0; i < RUN_TIMES; i++) {
    	 String input = new GuessInputCommand().input(); 
    	 List <Integer> input2 =guessInputToList.getArray(input);
    	 same =guessInputToList.sameCount(answer, input2);
         System.out.println(same);
        }     
         
//            System.out.println(input);
        }
    
}