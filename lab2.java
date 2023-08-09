import java.util.*;
public class checkCreditCard
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String cc = sc.nextLine();
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < cc.length(); i++)
        {
            char c = cc.charAt(i);
            
            list.add(Character.getNumericValue(c));
        }
        int t1 = 0;
        for(int i = list.size()-1; i >= 0; i-=2)
        {
            //System.out.println(list.get(i));
            t1 = t1 + list.get(i);
        }
        //t1 = t1 + 1;
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        
        for(int i = cc.length()-2; i >= 0; i-=2)
        {
            if(list.get(i) < 5)
            {
                list2.add(2*list.get(i));
            }
            else
            {
                list2.add((2*list.get(i)) - 9);
            }
        }
        int t2=0;
        for(int i = 0; i < list2.size(); i++)
        {
            t2 = t2 + list2.get(i);
        }
        System.out.println(t1 + " " + t2);
        
        if((t1 + t2) % 10 == 0)
        {
            System.out.println("VALID");
        }
        else
        {
            System.out.println("INVALID");
        }
    }
}
