// public class incmt {
//    public static void main(String[] args) {
//         // int i=56;
//         // System.out.println(i++);
//         // System.out.println(i);
//         // System.out.println(++i);
//         // int x=7;
//         // int y=++x*8;
//         // System.out.println(y);

//         int num[][] = new int[3][4];
// 		int k;
// 		num[0] = new int[4];
// 		num[1] = new int[4];
// 		num[2] = new int[4];
// 		num[3] = new int[4];
// 		for(int i = 0; i < 3;i++){
// 			for(int j= 0;j <4;j++){
//                 k=i*j;
// 				num[i][j] = k;
							
// 			}
			
// 		}
		
// 		for(int i = 0; i < 3;i++){
// 			for(int j = 0; j <4; j++){
// 				System.out.print(num[i][j]);
// 			}
// 			System.out.print('\n');
			
// 		}
//     }
    
// }
public class incmt {  
    public static void main(String args[]) { 
  //    int i,j;
  //     int a[][]=new int[3][4];
     
  //     for( i=0;i<3;i++)
  //       {
  //         for( j=0;j<4;j++)
  //           {
  //                 a[i][j]=i*j;
  //             }
  //       }
  //     for( i=0;i<3;i++)
  //       {
  // for(j=0;j<4;j++)
  //   {
  //      System.out.print(a[i][j]);
  //     }
  //         System.out.print("\n");  
  //   }
  //   String binary[]={
  //     "0000", "0001"
  //   };
  //   int a=3;
  //   int b=6;
  //   int c=a|b;
  //   int d=a&b;
  //   int e=(~a&b)| (a&~b);
  //   int f=~a & 0x0f;
  //   System.out.println("a" +binary[a]);
  //   System.out.println(binary[b]);
  //   System.out.println(binary[c]);
  //   System.out.println(binary[d]);
  //   System.out.println(binary[e]);
  //   System.out.println(binary[f]);
  //  // System.out.println(binary[g]);
  //   } 

  char hex[]={
    '0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'
  };
  byte b=99;
  System.out.println("b=0x"+ hex[(b>>4)&0x0f]+hex[b& 0x0f]);

  }
}