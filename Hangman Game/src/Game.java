/**
	Copyright (c) 2012 Roland Yonaba

	Permission is hereby granted, free of charge, to any person obtaining a
	copy of this software and associated documentation files (the
	"Software"), to deal in the Software without restriction, including
	without limitation the rights to use, copy, modify, merge, publish,
	distribute, sublicense, and/or sell copies of the Software, and to
	permit persons to whom the Software is furnished to do so, subject to
	the following conditions:

	The above copyright notice and this permission notice shall be included
	in all copies or substantial portions of the Software.

	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
	OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
	MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
	IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
	CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
	TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
	SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
**/

// A Hangman Game
// Yet, incomplete. 
// Uses serialization for password saving for different user profiles

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Game {
	
	//IntoState Method
	static void IntroState()
	{
		final String menu="1. Create User\n2. Load Session\n3. HighScores\n4.Exit\n";		
		int ch=0;
		while (ch==0)
		{
			System.out.println("------------Welcome to the Hangman Game------------\n\n"+menu);
			System.out.print("Choose ? ");
			Scanner sc = new Scanner(System.in);
			try {ch = sc.nextInt();} catch (InputMismatchException e){ch=0;}
			switch(ch)
			{
			case 1:setUser();break;
			case 2:loadSession();break;
			case 3:break;
			case 4:System.out.println("\nThanks for playing!\nProgram Closed.\n");System.exit(0);break;
			default: System.out.println("Wrong Entry\n");ch=0;break;
			}
		}		
	}
	
	//CreateUser Method
	static void setUser()
	{
		Scanner sc = new Scanner(System.in);
		String nm,pwd,pwd2=" ";
		System.out.println("\n\n--------New User Profile-------\n");
		System.out.println("----(Nota: All Input are Case Sensitive)-----\n\n");
		System.out.print("\nEnter a Nickname : ");
		nm = sc.next();
		System.out.print("\nEnter a password (You'll have to confirm) : ");
		pwd = sc.next();
			while (!(pwd2.equals(pwd)))
			{
				System.out.print("\nConfirm password(C to Cancel) : ");
				pwd2 = sc.next();
				if ((pwd2).equals("C")|| pwd2.equals("c")) 
				{
					IntroState();					
				}
			}
		Profile player = new Profile(nm,pwd);
		try{ player.serialize();} 
		catch (IOException e) {System.out.println("\nError While Saving Data!\n");}
		System.out.println("\nBack to Main Menu.\n");
		IntroState();
	}
	
	static void loadSession()
	{
		
	}
	public static void main(String[] args) 
	{
	
		IntroState();
		
	}

}
