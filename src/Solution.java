import java.util.*;
public class Solution {
    public int numUniqueEmails(String[] e) {
        String s1="";
        Set <String> set= new HashSet <String> ();

        for(int i=0; i<e.length; i++){
            String s= e[i];
            int j=0;

            while((s.charAt(j)!='+') && (s.charAt(j)!= '@')){
                if(s.charAt(j)!='.') s1=s1+s.charAt(j);
                j++;
            }
            while(s.charAt(j)!='@'){
                j++;
            }
            s1=s1+s.substring(j);
            set.add(s1);
        }

        return set.size();
    }

    public static void main(String [] args){
        Solution c = new Solution();
        String [] e = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};

        System.out.println(c.numUniqueEmails(e));
    }
}
