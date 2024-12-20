import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Deque;
import java.util.Stack;
class Test1
{
  static int Prec(char ch)
  {
    switch(ch)
    {
     case'+':
     case'-':
      return 1;
     case'*':
     case'/':
       return 2;
     case'^':
       return 3;
    }
     return -1;
  }
   static String infixToPostfix(String exp)
    {
       String result = new String("");
       Deque<Character>Stack=new ArrayDeque<Character>();
       for (int i=0;i<exp.length();i++)
        {
          char c = exp.charAt(i);
           if (Character.isLetterOrDigit(c))
             result+=c;
           else if(c=='(')
             Stack.push(c);
            else if(c==')')
            {
               while(!Stack.isEmpty()&& Stack.peek()!='(')
                {
                  result+=Stack.peek();
                  Stack.pop();
                }
                 Stack.pop();
            }
            else
            {
              while(!Stack.isEmpty()&& Test1.Prec(c)<=Prec(Stack.peek()))
             {
               result+=Stack.peek();
               Stack.pop();
             }
              Stack.push(c);
            }
        }
        while(!Stack.isEmpty())
         {
           if(Stack.peek()=='(')
           return "Invalid Expression";
           result+= Stack.peek();
           Stack.pop(); 
         }
          return result;
    }
    public static void main(String[]args)
     {
       Scanner obj=new Scanner(System.in);
       System.out.println("CONVERSION OF INFIX TO POSTFIX EXPRESSION");
       System.out.println("*****************************************");
       System.out.println("Enter the infix expression:");
       String exp=obj.nextLine();
       System.out.println(" Postfix Expression:");
       System.out.println(infixToPostfix(exp));
     }
}
