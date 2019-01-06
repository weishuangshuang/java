package com.thza.io.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import jdk.jfr.events.FileWriteEvent;

public class FileTest {
	
	public static void write(String filename,byte[] b) throws IOException {
		
		FileOutputStream out = null;
		
			try {
				File f = new File(filename);
				
				if(!f.exists()) {
					File m = f.getParentFile();
					
					if(!m.exists()) {
						m.mkdirs();
						System.out.println("创建文件目录");
					}
					
				f.createNewFile();
				System.out.println("创建文件");	
				}
				
				out = new FileOutputStream(f,true);
				out.write(b);
			} catch (IOException e) {
				
				e.printStackTrace();
			}finally {
				if(out != null) {
					out.close();
				}
			}
		}
	
	public static byte[] del(String fileName) throws IOException {
		byte[] buff = null;
		
		File f = new File(fileName);
		FileInputStream in = null;
		
		try {
			
			in = new FileInputStream(f);
			buff = new byte[in.available()]; //.available 返回此输入流可读取的剩余字节数
			in.read(buff); //因为参数是字节类型 所以表示从该输入中读取buff.length长度个字节
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			if(in != null) {
				in.close();
			}
		}
		
		return buff;
	}
	
	public static void copy(String y,String m) throws IOException {
		byte[] buff = new byte[1048576];
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream(y);
			File ff= new File(m);
			File f = ff.getParentFile();
			if(!f.exists()) {
				f.mkdirs();
			}
			out = new FileOutputStream(m);
			int count;
			while((count=in.read(buff)) != -1 ){
				out.write(buff, 0, count);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}finally {
			if(in != null) {
				in.close();
			}
			if(out != null) {
				out.close();
			}
		}
		
		
	}
	
	public static void write(String filename,String date) throws IOException {
		
		FileWriter write = null;
		File f = new File(filename);
		File p = f.getParentFile();
		if(!p.exists()) {
			p.mkdirs();
		}
		
		try {
			write = new FileWriter(f);
			
			write.write(date);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(write != null) {
				write.close();
			}
		}
	}
	
	public static String readTx(String name) throws IOException {
		String dat = "";
		FileReader read = null;
		
		try {
			read = new FileReader(name);
			char[] a = new char[10];
			int count=-1;
			while((count=read.read(a)) != -1) {
				String s = new String(a,0,count);
				dat += s;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(read != null) {
				read.close();
			}
		}
		
		return dat;
	}
	
	
	public static void write(String filename, String dao,String chare) throws IOException {
		FileOutputStream out = null;
		OutputStreamWriter outwriter = null;
		BufferedWriter buwriter = null;
		
		try {
			out = new FileOutputStream(filename);
			outwriter = new OutputStreamWriter(out, chare);
			buwriter = new BufferedWriter(outwriter);
			
			
			buwriter.write(dao);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(buwriter != null) {
				buwriter.close();
			}
			if(outwriter != null) {
				outwriter.close();
			}
			if(out != null) {
				out.close();
			}
		}
	}
	
	
	public static String readTx(String filename,String chare) throws IOException {
		String dao = "";
		FileInputStream in = null;
		InputStreamReader inr = null;
		BufferedReader br = null;
		
		try {
			in = new FileInputStream(filename);
			inr = new InputStreamReader(in,chare);
			br = new BufferedReader(inr);
			String s =null;
			while ((s=br.readLine()) != null) {
				dao+=s;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(br != null) {
				br.close();
			}
			if(inr != null) {
				inr.close();
			}
			if(in != null) {
				in.close();
			}
		}
		
		
		return dao;
	}

	public static void main(String[] args) throws IOException {
		
//		String fileName = "/home/wss/a.txt";
//		byte[] date = "hello my name is  d".getBytes();
//		
//		write(fileName,date);
//		
//		byte[] da = del(fileName);
//		String str = new String(da);
//		System.out.println(str);
		
//		copy("/home/wss/音乐/1.opus","/home/wss/音乐/a/2.opus");
		
//		 write("/home/wss/a.txt","hello my is");
//		 String s = readTx("/home/wss/a.txt");
//		 System.out.println(s);
		
		write("/home/wss/a.txt","hello my name is 你好", "utf-8");
		String s = readTx("/home/wss/a.txt","utf-8");
		System.out.println(s);

	}

}
