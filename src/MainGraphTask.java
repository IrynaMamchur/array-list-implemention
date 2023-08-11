import java.util.ArrayList;
import java.util.List;

public class MainGraphTask {
    public static void main(String[] args) {
        NodeGraphSecond one = new NodeGraphSecond(null, "1");
        NodeGraphSecond two = new NodeGraphSecond(null, "2");
        NodeGraphSecond three = new NodeGraphSecond(null, "3");
        NodeGraphSecond fort = new NodeGraphSecond(null, "4");
        NodeGraphSecond five = new NodeGraphSecond(null, "5");
        NodeGraphSecond six = new NodeGraphSecond(null, "6");
        NodeGraphSecond gelb = new NodeGraphSecond(null, "gelb");

        List<NodeGraphSecond> linksFromOne = new ArrayList<>();
        linksFromOne.add(two);
        linksFromOne.add(three);
        one.setLinks(linksFromOne);

        List<NodeGraphSecond> linksFromThree = new ArrayList<>();
        linksFromThree.add(five);
        linksFromThree.add(fort);
        three.setLinks(linksFromThree);

        List<NodeGraphSecond> linksFromFive = new ArrayList<>();
        linksFromFive.add(six);
        five.setLinks(linksFromFive);

        List<NodeGraphSecond> linksFromSix = new ArrayList<>();
        linksFromSix.add(three);
        six.setLinks(linksFromSix);

        List<NodeGraphSecond> linksFromGelb = new ArrayList<>();
        linksFromGelb.add(one);
        linksFromGelb.add(two);
        linksFromGelb.add(three);
        linksFromGelb.add(fort);
        linksFromGelb.add(five);
        linksFromGelb.add(six);
        gelb.setLinks(linksFromGelb);

    }
}
