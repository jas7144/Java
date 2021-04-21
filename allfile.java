import java.io.File;

public class allfile {
  public static void main(String[] args) {
    File file = new File("C:\\Users\\DELL");
    String[] fileList = file.list();

    for(String str : fileList) {
      System.out.println(str);
    }
  }
}