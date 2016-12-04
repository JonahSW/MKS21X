public class Driver{
  public static void main(String[] args) {
    StringySuperArray data = new StringySuperArray();
    int i = 0;
    while(i < 26){
	//data.add(""+(char)('A'+i%26));
	data.add("asd");
	i++;
    }

    System.out.println(data.add("wfd"));

    System.out.println(data.toStringDebug());

    System.out.println(data);
    System.out.println("Standard loop:");

    for(int n = 0; n < data.size(); n++){
      System.out.print(data.get(n)+" ");
    }
    System.out.println();
    System.out.println("for-each loop:");
    for(String s : data){
      System.out.print(s+" ");
    }
  }
}
