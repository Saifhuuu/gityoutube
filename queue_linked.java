import java.util.*;
public class queue_linked
{
   Node front, rear;
   int currsize;
   public queue_linked()
   {
       front=null;
       rear=null;
       currsize=0;
   }
     public boolean isEmpty()
      {
        return(currsize==0); 
      }
      public int dequeue()
      {
        if(isEmpty())
         {
          rear=null;
          System.out.println("No elements available in the Queue");
          return-1;
         }
         else
         {
           int data=front.data;
           front=front.next;
           currsize--;
           System.out.println(data+"remove from the Queue");
           return data;
         }
      }
      void DisplayList()
      {
        if(isEmpty())
        {
          System.out.println("No elements available in the Queue");
        }
        else
          {
             Node ptr=front;
             while(ptr!=rear.getNext())
              {
                System.out.println(ptr.getData()+"");
                ptr=ptr.getNext();
              }
          }
      }
      public void enqueue(int data)
      {
       Node oldRear=rear;
       rear=new Node();
       rear. data=data;
       rear.next=null;
       if(isEmpty())
       {
         front=rear;
       }
       else
        {
           oldRear.next=rear;
        }
        currsize++;
        System.out.println(data+"added from the Queue");
      }
      public static void main(String args[])
      {
        queue_linked queue=new queue_linked();
        while(true)
        {
          System.out.println("IMPLEMENTATION OF QUEUE ADT USING LINKED LIST");
          System.out.println("*********************************************");
          System.out.println("\n1...Enqueue\n2...Dequeue\n3...Display Element\n4...Exit");
          Scanner myobj=new Scanner(System.in);
          System.out.println("\n Enter your choice:");
          int choice=Integer.parseInt(myobj.nextLine());
          switch(choice)
          {
             case 1:
                   System.out.println("\n Enter the value to insert:"); 
                   int val=Integer.parseInt(myobj.nextLine());
                   queue.enqueue(val);
                   break;
             case 2:
                    queue.dequeue();
                    break;
             case 3:
                   queue.DisplayList();
                   break;
             case 4:
                   System.exit(0);
          }
        }
      }
       private class Node
       {
         int data;
         Node next;
         public Node getNext()
         {
          return next;
         }
         public int getData()
         {
           return data;
         }
       }
}
 




 






