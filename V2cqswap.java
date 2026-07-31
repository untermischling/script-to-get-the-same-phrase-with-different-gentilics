import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class V2cqswap{
  public static void main(String[] args)throws IOException{
    String suffix = " Reacto to 'School Shooting' for the First Time";
    Files.lines(Paths.get("denonyms.txt")).forEach(denonym -> System.out.println(denonym + suffix));
  }
}
