package kr.co.infopub.chapter.num;
import java.io.File;
public class FileNumberMaining2 {
	public static void main(String[] args) {
		int v=191;
		//String t="";
		String t="/model"; 
		String s="s"+v+t;  
		File ff=new File("D:/java200book/workspace/java200book5/src/kr/co/infopub/chapter/"+s);
		File[] ffs=ff.listFiles();
		for (File fff: ffs) {
			FileCommentsNumber fc=new FileCommentsNumber(fff.getAbsolutePath());
			fc.fileRWInAnyType();//Ȯ���ڰ� �ְ� ����,  java, txt�̶� �ȴ�.
			//System.out.println(fff.getAbsolutePath());
		}
	}
}
