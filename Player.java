import java.util.ArrayList; 

public class Player /*extends Card*/{//�_�l
	//���]3�Ѽ�
	private String name;//�W�l
	private int chips;//�w�X
	private int bet;//��`���B
	private ArrayList<Card> oneRoundCard;{//�������d
		oneRoundCard =Card(suit,rank);
	}
	public Player(String name, int chips) {//player���W�l+�w�X
		this.name=name;
		this.chips=chips;
	}
	public String getName() {//���o�W�l
		return name;
	}
	public int makeBet(){//�c���w�X
		return bet;
	}
	public void setOneRoundCard(ArrayList<Card> cards){//�]�w���P���ұo�쪺�d
		this.oneRoundCard = cards;
	}
	public boolean hitMe(){//�O�_�n�P�A�O�^��true�A���A�n�P�h�^��false
		if (getTotalValue()<=16)
			return true;//16�I�H�U�n�P
		else
			return false;//17�I�H�W���n�P
	}
	public int getTotalValue(){
		return ArrayList<Card> openCard;//�^�Ǧ��P���ұo���d�I�ƥ[�`
		
	}
	public int getCurrentChips() {
		this.chips = chips +- bet;
		return chips;//�^�Ǫ��a�{���w�X
	}
	public void increaseChips (int diff){//���a�w�X�ܰ�
		diff = chips-this.chips;
	}
	public void sayHello(){//Say Hello
    System.out.println("Hello, I am " + name + ".");
    System.out.println("I have " + chips + " chips.");
	}
}
