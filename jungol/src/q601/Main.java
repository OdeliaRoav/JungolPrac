package q601;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Character> a = new LinkedList<>();
        String input = br.readLine();
        for(int i=0;i<input.length();i++){
            a.add(input.charAt(i));
        }
        for(int i=0;i<input.length();i++){
            a.add(0,a.get(input.length()-1));
            a.remove(input.length());
            String rst = a.toString();
            bw.write(rst.replaceAll("[\\[\\]\\,\\ ]",""));//규식이
            if(i<input.length()-1){
                bw.newLine();
            }
        }
        bw.flush();
    }
}