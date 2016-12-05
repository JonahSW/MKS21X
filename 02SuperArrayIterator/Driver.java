public class Driver{
  public static void main(String[] args) {
      //StringySuperArray data1 = new StringySuperArray();
    StringySuperArray data = new StringySuperArray(5);

    //System.out.println(data1.toStringDebug());
    System.out.println(data.toStringDebug());

    // data1.add("hi");
    //data.add("hi");
    
    int i = 0;
    while(i < 26){
	data.add(""+(char)('A'+i%26));
	//data1.add("asd");
	i++;
    }

    //data1.add("hi");
    
    //System.out.println(data1.add("wfd"));

    //System.out.println(data.size());
    
    //System.out.println(data.get(10));

    //System.out.println(data.toStringDebug());

    System.out.println(data);
    System.out.println("Standard loop:");

    for(int n = 0; n < data.size(); n++){
      System.out.print(data.get(n)+" ");
    }
    
    System.out.println();
    System.out.println("for-each loop:");

    //while(data.hasNext()){
    //	System.out.println(data.next());
    //}
    
    for(String s : data){
      System.out.print(s+" ");
    }
  }
}
