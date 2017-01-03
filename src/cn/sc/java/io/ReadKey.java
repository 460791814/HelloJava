package cn.sc.java.io;

import java.io.IOException;
import java.io.InputStream;

public class ReadKey {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        InputStream inputStream=System.in;
        StringBuilder sBuilder=new StringBuilder();
        int len=0;
        while ((len=inputStream.read())!=-1) {
			 if(len=='\r')
			 {
				 
				 continue;
			 }
			 if(len=='\n'){
				 String temp=sBuilder.toString();
				// System.out.println(temp);
				 //CharSequenceÊÇString µÄ¸¸Àà
				 if(temp.contains("over")){
					 System.out.println(temp.toUpperCase());
					 sBuilder.delete(0, sBuilder.length());
					 break;
					
					 
				 }
				 
			 }
			 sBuilder.append((char)len);
		}
	}

}
