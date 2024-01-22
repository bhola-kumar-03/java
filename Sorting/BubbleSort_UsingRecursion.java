import java.util.ArrayList;
class BubbleSort_UsingRecursion{

    static void swap(int []a,int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static void REcursion(int []a,int e)
    {
        if(e==1)
        {
            for(int j:a)
            {
                System.out.print(+j+" ");
            }
            return;
        }
        for(int i=0;i<e-1;i++)
        {
            if(a[i]>a[i+1])
            {
                swap(a,i,i+1);
            }
            // System.out.println("i="+i);
        }

        REcursion(a,e-1);
        
    }


    static void StartToStarting(int []a,int e)
    {
        if(e==a.length-1)
        {
            for(int j:a)
            {
                System.out.print(+j+" ");
            }
            return;
        }
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]>a[i+1])
            {
                swap(a,i,i+1);
            }
            // System.out.println("i="+i);
        }

        StartToStarting(a,e+1);
        
    }

/*using arraylist */
    static ArrayList<Integer> Arraylist(int []a,int e) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(e == 1) {
            for (int value : a) {
                ans.add(value);
            }
            return ans;
        }
        for(int i = 0; i < e - 1; i++) {
            if(a[i] > a[i+1]) {
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }

        ArrayList<Integer> d = Arraylist(a, e-1);
        // /ans.addAll(d);
        return d;
    }

    /*using return array  */
    static int[] Bubble(int []a,int in)
    {
        if(in==a.length-1)
        {
            return a;
        }
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]>a[i+1])
            {
                swap(a,i,i+1);;
            }
        }
        return Bubble(a, in+1);
    }

    public static void main(String[] args) {
        int []a={5,8,6,1,5,2,3};
        System.out.println("Bubble sort start with end:");
        REcursion(a,a.length);
        System.out.println();
        System.out.println("\nstart with begginging:");
        StartToStarting(a, 0);

        System.out.println("\n \nusing ArrayList:");
        ArrayList<Integer> ans=Arraylist(a,a.length);
        for(int i:ans)
        {
            System.out.print(i+" ");
        }

        System.out.println("\n \nBubble sort using return array method:");
        int b[]=Bubble(a, 0);
        for(int i:b)
        {
            System.out.print(i+" ");
        }
    }
}