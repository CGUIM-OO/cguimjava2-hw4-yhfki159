import java.util.ArrayList;

public class Deck{
	private ArrayList<Card> cards =new ArrayList<Card>();
	private ArrayList<Card> usedCard;
	private ArrayList<Card> openCard;//存放此副牌中所有打開的牌
	//
    public Deck(int nDeck){
    	cards = new ArrayList<Card>();
    	for(int n=0;n<nDeck;n++){
        for (Card.Suit s : Card.Suit.values()) {
            for (int r=1; r<=13; r++) {
            	cards.add(new Card(s, r));
            }
        }
       }
    } 
    public int nUsed = cards.size();
//
    public Card getOneCard(boolean isOpened) {//取得一張牌
        Card card;
        if ( !cards.isEmpty())
            card = cards.remove(cards.size() - 1);
        else
            card = null;
        return card;
    }
    // 
    // 
    public void shuffle() {//洗牌
        for (int i = cards.size() - 1; i > 0; --i) {
            int rand = (int) (Math.random() * (i + 1));
            Card temp = cards.get(i);
            cards.set(i, cards.get(rand));
            cards.set(rand, temp);
            
        }
        ArrayList<Card>opencard=null;//清空
    }
    // to be used by System.out.println() to print the whole deck one card per line
	//
	public void printDeck(){//列印出所有牌
		while(true){
			for (Card.Suit s : Card.Suit.values())
			{
				for (int r=1; r<=13; r++){
	        		System.out.println(new Card(s,r));
				}
	    	}
		}
		

    }
	//取得並回傳
    public ArrayList<Card> getOpenedCard(){
    	return openCard;
    }
	public ArrayList<Card> getAllCards(){
		return cards;
	}
	public ArrayList<Card> getUsedCard() {
		return usedCard;
	}
	public void setUsedCard(ArrayList<Card> usedCard) {
		this.usedCard = usedCard;
	}
}