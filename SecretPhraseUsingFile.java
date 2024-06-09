import java.io.BufferedReader;

import java.io.File;

import java.io.FileReader;

import java.io.IOException;

import java.util.*;

public class SecretPhraseUsingFile{

public static void main(String[] args) {

try {

File f = new File("/home/vardhan/Trees/Chegg/hagy.txt");

BufferedReader b = new BufferedReader(new FileReader(f));

String readLine = "";

ArrayList<String> arr = new ArrayList<String>();

System.out.println("We are starting the game...");

while((readLine = b.readLine()) != null) {

arr.add(readLine);

}

int len = arr.size();

int x = (int)(Math.random()*((len-1)+1));

guessIt(arr.get(x));

} catch(IOException e) {

e.printStackTrace();

}

}

public static void guessIt(String wordd) {

int n = wordd.length();

char[] word = wordd.toCharArray();

Scanner sc = new Scanner(System.in);

char[] letters = new char[n];

for(int i=0; i<n; i++) {

letters[i] = '*';

}

while (true) {

System.out.print("Your word is: ");

for(int j=0; j<n; j++) {

System.out.print(letters[j]+" ");

}

System.out.println();

System.out.print("Enter a letter: ");

char c = sc.next().charAt(0);

for(int j=0; j<n; j++) {

if(word[j] == c) {

letters[j] = c;

}

}

if(String.valueOf(word).equals(String.valueOf(letters))) {

System.out.println("You have guessed it...");

break;

}

}

}

}
