public class Driver{
  public static void main(String[] args) {
    StringySuperArray data1 = new StringySuperArray();

    System.out.println(data1.toStringDebug());
    
    int i = 0;
    while(i < 26){
	//data.add(""+(char)('A'+i%26));
	data1.add("asd");
	i++;
    }

    data1.add("hi");
    
    System.out.println(data1.add("wfd"));

    System.out.println(data1.size());
    
    //System.out.println(data1.get(0));

    System.out.println(data1.toStringDebug());

    System.out.println(data1);
    System.out.println("Standard loop:");

    for(int n = 0; n < data1.size(); n++){
      System.out.print(data1.get(n)+" ");
    }
    System.out.println();
    System.out.println("for-each loop:");
    for(String s : data1){
      System.out.print(s+" ");
    }
  }
}
