package data_structures;

import java.util.ArrayList;

public class ListIterationBeginner 
{
static ArrayList<Pig> theYard = new ArrayList<Pig>();
static ArrayList<Bubble> bubbleWrap = new ArrayList<Bubble>();
static ArrayList<Song> playlist = new ArrayList<Song>();

public static void main(String[] args) 
{
	for(Pig i: theYard)
	{
		i.feed();
	}
	
	for(Bubble i: bubbleWrap)
	{
		i.pop();
	}
	
	for(Song i: playlist)
	{
		i.play();
	}
	
}


class Pig
{
	void feed() {}
}

class Bubble 
{ 
	void pop() {}
}
class Song {
void play(){}
}


}


