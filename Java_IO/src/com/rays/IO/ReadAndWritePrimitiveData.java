package com.rays.IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWritePrimitiveData {
	public static void main(String[] args) throws IOException {
		DataOutputStream out = new DataOutputStream(new FileOutputStream("D://Rays//binary.dat"));
		out.writeInt(45);
		out.writeBoolean(false);
		out.writeChar('d');
		out.writeByte(2);
		out.writeDouble(4.5);
		out.close();
		
		DataInputStream in = new DataInputStream(new FileInputStream("D://Rays//binary.dat"));
		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		System.out.println(in.readChar());
		System.out.println(in.readByte());
		System.out.println(in.readDouble());
		in.close();
		
	}

}
