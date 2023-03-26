import java.lang.invoke.StringConcatFactory;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.print.attribute.HashPrintJobAttributeSet;
import javax.print.attribute.standard.RequestingUserName;
import javax.swing.text.html.StyleSheet;

// import java.lang.invoke.ClassSpecializer.Factory;

// import java.util.*;
// public class recursion {
//     public static void main(String[] args) {
//         int n;
//         Scanner sc=new Scanner(System.in);
//          n=sc.nextInt();
//         pdi(n);
//     }
//    public static void pdi(int n)
//     {
//         if(n==0)
//          return ;
//         System.out.println(n);
//         pdi(n-1);
//         System.out.println(n);
//     }

// }

// class recursion
// {
//     public static void main(String[] args) {
//         int n=5;
//         System.out.println(fac1(n));
//         }
//        public static int fac1(int n)
//         {
//             if(n==1)
//                 return 1;
//             int f=fac1(n-1);
//             int res=f*n;
//             return res;

//         }
// }



// class recursion
// {
//     public static void main(String[] args) {
//         int x=5;
//         int n=3;
//          System.out.println( power(x,n)); 
//      }
//      public static int power(int x,int n)
//      {
//         if(n==0)
//         {
//             return 1;
//         }
//         int kuc=power(x, n-1);
//         int res=x*kuc;
//         return res;
//      }
// }



// class recursion
// {
//     public static void main(String[] args) {
//         int [] arr ={13,234,4554,5,54};
//         displayelement(arr, arr.length-1);
//     }
//     public static void displayelement(int[] arr,int idx)
//     {
//         if(idx==-1)return ;
//         System.out.println(arr[idx]);
//         displayelement(arr, idx-1);

//     }
// }


//  max element in array

// class recursion
// {
//     public static void main(String[] args) {
        
//         int[] arr ={3762,12,34,456,43};
//     //    System.out.println(max(arr,0));
//     int n=max(arr,arr.length);
//     System.out.println(n);

//     }
//     public static int max(int[] arr, int index)
//     {
//         if (index==0) return arr[0];
//         int misa=max(arr, index-1);
//         if(misa>arr[index-1])
//         {
//             return misa;
//         }else{
//             return arr[index-1];
//         }
 
//     }
// }






//   return frist index of element

// class recursion
// {
//     public static void main(String[] args) {
//         int [] arr ={1,3,4,5,4,3,2,1,500,2,3};
//         int x=1;
//         System.out.println( firstIndex(arr,0,x));
//     }
//     public static int firstIndex(int [] arr ,int index,int x)
//     {
//         if(index==arr.length) return -1;
//         int res=firstIndex(arr, index+1, x);
//         if(res==-1)
//         {
//             if(arr[index]==x)
//             {
//                 return index;
//             }
//             else{
//                 return -1;
//             }
//         }else{
//             return res;
//         }
//     }
// }


// class recursion
// {
//     public static void main( String  args[])
//     {
//         // x^n
//         int x=5;
//         int n=3;
//         System.out.println(power( x, n));
//     }
//     public static int power(int x,int n)
//     {
//         if(n==0) return 1;


//         int res=power(x,n-1);
//         int res1=res*x;
//         return res1;
//     }
// }





// class recursion
// {

//     public static void main(String[] args) {
//     int[] arr ={3,2,4,5,54,3,2,2,2,4,5,56,4,3,2,3,3,34};
//     int x=2;
//     int fsf=0;
//     int[] arr1=all(arr, x, 0, 0) ;
//     for(int i=0;i<arr1.length;i++)
//         {
//             System.out.print(arr1[i]+" ");
//         }
 
//     }
//     public static int[] all(int[] arr,int x,int index,int fsf)
    
//     {
//         if(index==arr.length)
//         {
//             return new int[fsf];
//         }


//         if(arr[index]==x)
//         {
//             int[] rahu=all(arr, x, index+1, fsf+1);
//             rahu[fsf]=index;
//             return rahu;
//         }else{
//             int[] rahu=all(arr, x, index+1, fsf);
//             return rahu;

//         }
//     }
// }


// class recursion
// {
//     public static void main(String[] args) {
        
//         String str="abc";
//         ArrayList<String> rose=gss(str);
//         System.out.println(rose);
//     }
//     public static ArrayList<String> gss(String str)
//     {
//         if(str.length()==0)
//         {
//             ArrayList<String > res1=new ArrayList<>();
//             res1.add("");
//             return res1;
//         }

//         char ch=str.charAt(0);
//         // a
//         String str1=str.substring(1);
//         // bc
//         ArrayList<String> res2=gss(str1);

//         ArrayList<String> res3=new ArrayList<>();


//         for(String a:res2){
//             res3.add(""+a);
//         }
//         for(String a:res2)
//         {
//             res3.add(ch+a);

//         }
//         return res3;
//     }
// }





// sidi wali ki kitane baar me niche utar skte hai


// class recursion
// {
//     public static void main(String[] args) {
//         int n=4;
//         ArrayList<String> rose=getStarar(n);
//         System.out.print(rose+" ");
//     }
//     public static ArrayList<String> getStarar(int n)
//     {
//         if(n==0){
//             ArrayList<String> res1=new ArrayList<>();
//             res1.add("");
//             return res1;
//         }
//         else if(n<0)
//         {
//             ArrayList<String> res1=new ArrayList<>();
//             return res1;
//         }

//         ArrayList<String> path1=getStarar(n-1);
//         ArrayList<String> path2=getStarar(n-2);
//         ArrayList<String> path3=getStarar(n-3);

//         ArrayList<String> ans=new ArrayList<>();


//         for(String p:path1)
//         {
//             ans.add(1+p);
//         }
//         for(String p:path2)
//         {
//             ans.add(2+p);
//         }
//         for(String p:path3)
//         {
//             ans.add(3+p);
//         }

//         return ans;




//     }
// }

//  print all the path
// int 2d matrix (1,1) to (n,m) all the paths in terms of h or v

class recursion {

  public static void main(String[] args) throws Exception {
    int n=8;
    int m=0;
    ArrayList< String> paths = getMazePaths(1, 1, n, m);
    System.out.println(paths);
  }

  // sr - source row
  // sc - source column
  // dr - destination row
  // dc - destination column
  public static ArrayList< String> getMazePaths(int sr, int sc, int dr, int dc) {
    if (sr == dr && sc == dc) {                              //1
      ArrayList< String> bres = new ArrayList< >();
      bres.add("");
      return bres;
    }
    ArrayList< String> hpaths = new ArrayList< >();           //2.1
    ArrayList< String> vpaths = new ArrayList< >();           //2.2

    if (sc < dc) {
      hpaths = getMazePaths(sr, sc + 1, dr, dc);          //3.1
    }
    if (sr < dr) {
      vpaths = getMazePaths(sr + 1, sc, dr, dc);          //3.2
    }

    ArrayList< String> paths = new ArrayList< >();             //4

    for (String hpath : hpaths) {
      paths.add("h" + hpath);                              //5.1
    }

    for (String vpath : vpaths) {
      paths.add("v" + vpath);                              //5.2
    }
    return paths;                                            //6
  }

}


























