import java.util.Stack;

import javax.lang.model.util.ElementScanner14;
import javax.management.openmbean.OpenDataException;
import javax.xml.transform.Source;

public class infix_evaliation {
    
    public static void main(String[] args) {
        String exp= "2+3+(6*5)";
        Stack<Integer> opnds =new Stack<>();
        Stack<Character> optors =new Stack<>();
        for(int i=0;i<exp.length();i++)
        {
            char ch=exp.charAt(i);
            if(ch=='('){
                optors.push(ch);
            }else if(Character.isDigit(ch)){
                opnds.push(ch-'0');
            }else if(ch==')'){
                while(optors.peek()!='(' )
                {
                    char ope=optors.pop();
                    int v2=opnds.pop();
                    int v1=opnds.pop();
                    int  sum=operation(v1, v2, ope);
                    opnds.push(sum);
                }
                optors.pop();      
            }else if(ch=='+' || ch=='-'||ch=='*'||ch=='/'){
                while(optors.size()>0 && optors.peek()!='(' && precedence(ch)<=precedence(optors.peek())){
                    char ope=optors.pop();
                    int v2=opnds.pop();
                    int v1=opnds.pop();
                    int  sum=operation(v1, v2, ope);
                    opnds.push(sum);
                }
                optors.push(ch); 
                }
         }
            while(optors.size()>0)
            {
                char ope=optors.pop();
                    int v2=opnds.pop();
                    int v1=opnds.pop();
                    int  sum=operation(v1, v2, ope);
                    opnds.push(sum);
            }
            System.out.println(opnds.peek());
    
    }
    


    
    public static int precedence(char ope)
    {
        if(ope=='+' || ope=='-'){
            return 1;
        }else if(ope =='*' || ope=='/'){
            return 2;
        }
        else{
            return 0;
        }
    }
    public static int operation(int v1 ,int v2 ,char ope)
    {
        if(ope=='+'){
            return (v1+v2);
        }else if(ope=='-'){
            return (v1-v2);
        }else if(ope=='*'){
            return (v1*v2);
        }   
        else {
            return (v1/v2);
        }
     }
    }