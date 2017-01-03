package cn.sc.java.net;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import cn.sc.java.string.stringdemo;

public class URLDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    String urlStr="http://www.zxxk.com/";
    URL url=new URL(urlStr);
//	System.out.println("getProtocol:"+url.getProtocol());
//	System.out.println("getHost:"+url.getHost());
//	System.out.println("getPort:"+url.getPort());
//	System.out.println("getFile:"+url.getFile());
//	System.out.println("getPath:"+url.getPath());
//	System.out.println("getQuery:"+url.getQuery());
	//获取url对象的Url连接器对象。将连接封装成了对象:java中内置的可以解析的具体协议的对象+socket.
	URLConnection conn = url.openConnection();
	InputStream inputStream = conn.getInputStream();
	byte[] buf = new byte[1024];
	int line=0;
	while ((line=inputStream.read(buf))!=-1) {
	
		String text = new String(buf,0,line,"utf-8");
		
		System.out.println(text);
	} ;
	

	
	inputStream.close();
	
	}

}
