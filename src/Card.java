
public class Card {
	private String[][] card = {
			{"\u26651 ", "\u26606 ", "\u26635 "},
			{"\u2666K ", "\u2660Q ", "\u26664 "},
			{"\u26602 ", "\u266310", "\u26655 "},
			{"\u26631 ", "\u26658 ", "\u26667 "},
			{"\u2666J ", "\u2666Q ", "\u2665Q "},
			{"\u26637 ", "\u26601 ", "\u266510"},
			{"\u2660J ", "\u26661 ", "\u26634 "}
	};
	
	public void shuffle() {
		for(int i = 0 ; i < card.length; i++) {
			for(int j = 0 ; j < card[0].length; j++) {
				int indexi = (int)(Math.random()* card.length);
				int indexj = (int)(Math.random()* card[0].length);
				
				String temp = card[i][j];
				card[i][j] = card[indexi][indexj];
				card[indexi][indexj] = temp;}}
	}
	
	public String[] getCol(int c) {
		String[] col = new String[card.length];
		for(int i = 0 ; i< card.length ;i++) {
			col[i] = card[i][c];
		}
		return col;
	}

	public int getlastc(int c) {
		if(c==1) {return 2;}
		else if(c==2) {return 0;}
		else {return 1;}
	}
	
	public void cardS(int c) {
		String[][] cardN = new String[card.length][card[0].length];
		int index = 0;
		
		int currentcol = c%3;
		String[] col = getCol(c%3);
		for(int i = 0; i < card.length ; i++) {
			for(int j = 0 ; j< card[0].length; j++) {
				cardN[i][j] = col[index];
				index++;
				if(index == 7 &&  currentcol== c%3) {index = 0; col = getCol(c-1); currentcol = c-1;}
				if(index == 7 &&  currentcol== c-1) {index = 0; col = getCol(getlastc(c));}
			}
		}
		card= cardN;
	}
	public String getAn(int c) {
		return card[3][c-1];
	}
	@Override
	public String toString() {
		String s ="";
		for(int i = 0; i < card.length; i++) {
			for(int j = 0 ; j< card[0].length ; j++) {
				s+= card[i][j] + "  ";
				if(j + 1 == card[0].length) {s+= "\n";}
			}
		}
		return s;
	}
}




