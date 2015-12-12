package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	    String FILE_NAME = "C:\\WorkSpace\\Advent\\Advent_Day1\\src\\com\\company\\input.txt";

        int floor =0;
        boolean wentToTheBasment=false;
        try {
            FileReader input = new FileReader(FILE_NAME);

            BufferedReader bufferedReader = new BufferedReader(input);

            String line = bufferedReader.readLine();

            int i = 0;
            while(line!= null){


                    switch(line.charAt(i)){
                        case '(': floor+=1;
                            break;
                        case ')':floor-=1;
                            break;
                        default:
                            break;
                    }

                if(i==6999){
                    break;
                }
                ++i;
                if(floor==-1 && !wentToTheBasment){
                    System.out.println(i +" : the first position where santa enters the basment.");
                    wentToTheBasment=!wentToTheBasment;
                }
            }
            bufferedReader.close();
            System.out.println(floor + " : floor is the destination floor.");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(1);

    }
}
