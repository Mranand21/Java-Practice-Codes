public class sumn_arr
{
        int[] sum(int[] a)
        {
          int s=0;
          for(int i=0;i<a.length;i++)
               s=s+a[i];
               a[a.length-1]=s;
               return(a);
         }
         public static void main(String[] ar)
         {
         int[] b={1,2,3,4,5};
         sumn_arr s1=new sumn_arr();
         int r[]=s1.sum(b);
         for (int j:r)
                   System.out.println("NEW ARRAY="+j);
          }
}