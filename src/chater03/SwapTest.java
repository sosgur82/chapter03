package chater03;

public class SwapTest {

	   public static void main(String[] args) {
	      int i = 10;
	      int j = 20;
	      
	      System.out.println("i="+i+",j="+j);
	      swap(i,j);
	      System.out.println("i="+i+",j="+j);
	      
	      Value v1 = new Value();
	      v1.setVal(10);
	      Value v2 = new Value();
	      v2.setVal(20);
	      System.out.println("v1=" + v1.getVal() + ",v2=" + v2.getVal());
	      swap2(v1,v2);
	      System.out.println("v1=" + v1.getVal() + ",v2=" + v2.getVal());
	   }
	   
	   
	   public static void swap(int a, int b) {
	      int temp = a;
	      a = b;
	      b = temp;
	      //stack이랑 heap이랑 이해해야됨.
	      //지역변수는 stack에 들어간다.
	      //10번 라인이 끝나면 지역변수는 나가게 된다.
	      //결국 값이 안바뀜.
	      //call by value
	   }
	   
	   public static void swap2(Value a, Value b) {
	      int temp = a.getVal();
	      a.setVal( b.getVal() );
	      b.setVal( temp );
	      //call by reference
	      //콜바이 레퍼런스가 될라면 객체여야 함.
	   }
	   
	}