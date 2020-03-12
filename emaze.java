import java.util.*;
class emaze{
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String maze = scn.next();
        int n1 = 0;
        int n2=0;
        for(int i=0; i<maze.length(); i++){
            char ans = maze.charAt(i) ;
            if(ans=='L'){
                n1-= 1;
            }else if(ans=='R'){
                n1+= 1;
            }else if(ans=='D'){
                n2-=1;
            }else{
                n2+=1;
            }
        }
        System.out.print(n1 + " " + n2);
    }
}