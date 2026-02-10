import java.util.Scanner;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

 class L4P2{
	public static void main(String[] args) throws IOExpection{
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader s=new BufferedReader(isr);
	int x=Integer.parseInt(s.readline());
	int y=Integer.parseInt(s.readline());
	System.out.println(x/y);
}
}