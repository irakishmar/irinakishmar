public class Card {

    Card(String type, String suit)
    {
        m_type = type;
        m_suit = suit;
    }
    String getCard()
    {
      return m_type + " " + m_suit;
    }

    private String m_type;
    private String m_suit;

}
