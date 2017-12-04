import java.util.ArrayList; 

public class Player /*extends Card*/{//起始
	//假設3參數
	private String name;//名子
	private int chips;//籌碼
	private int bet;//賭注金額
	private ArrayList<Card> oneRoundCard;{//此局的卡
		oneRoundCard =Card(suit,rank);
	}
	public Player(String name, int chips) {//player的名子+籌碼
		this.name=name;
		this.chips=chips;
	}
	public String getName() {//取得名子
		return name;
	}
	public int makeBet(){//構成籌碼
		return bet;
	}
	public void setOneRoundCard(ArrayList<Card> cards){//設定此牌局所得到的卡
		this.oneRoundCard = cards;
	}
	public boolean hitMe(){//是否要牌，是回傳true，不再要牌則回傳false
		if (getTotalValue()<=16)
			return true;//16點以下要牌
		else
			return false;//17點以上不要牌
	}
	public int getTotalValue(){
		return ArrayList<Card> openCard;//回傳此牌局所得的卡點數加總
		
	}
	public int getCurrentChips() {
		this.chips = chips +- bet;
		return chips;//回傳玩家現有籌碼
	}
	public void increaseChips (int diff){//玩家籌碼變動
		diff = chips-this.chips;
	}
	public void sayHello(){//Say Hello
    System.out.println("Hello, I am " + name + ".");
    System.out.println("I have " + chips + " chips.");
	}
}
