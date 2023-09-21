import java.util.*;
public class stack 
{
    int arr[]=new int[10];
    int tos;
    public stack()
    {
        tos=-1;
    }
    public void push(int element)
    {
        if(tos==9)
        {
            System.out.println("the stack is full");
        }
        else
        {
            arr[++tos]=element;
        }
    }
    public int pop()
    {
        if(tos>=0)
        {
            return arr[tos--];
        }
        else
        {
            System.out.println("the stack is empty");
            return -1;
        }
    }
    public static void main(String[] args) {
        stack s1=new stack();
        s1.push(5);
        s1.push(6);
        s1.push(0);
        int pop_num=s1.pop();
        int pop_num1=s1.pop();
        System.out.println("poped element is" + s1);
    }
}

