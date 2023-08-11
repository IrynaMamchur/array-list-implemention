import java.util.ArrayList;
import java.util.List;

public class MainGraph {
    public static void main(String[] args) {
    NodeGraph sleep = new NodeGraph(null,null, "Sleep");
        NodeGraph work = new NodeGraph(null,null, "work");
        NodeGraph rest = new NodeGraph(null,null, "rest");
        NodeGraph eat = new NodeGraph(null,null, "eat");

        sleep.setRight(work);
        work.setRight(rest);
        rest.setRight(eat);
        eat.setRight(sleep);
        sleep.setLeft(rest);

        System.out.println(sleep.right.right.value);

        NodeGraphSecond sleep2 = new NodeGraphSecond(null, "Спит");
        NodeGraphSecond work2 = new NodeGraphSecond(null, "Работает");
        NodeGraphSecond rest2 = new NodeGraphSecond(null, "Отдыхает");
        NodeGraphSecond eat2 = new NodeGraphSecond(null, "Ест");
        NodeGraphSecond ill2 = new NodeGraphSecond(null, "Болеет");

        List<NodeGraphSecond> linksFromSleep = new ArrayList<>();
        linksFromSleep.add(work2);
        linksFromSleep.add(rest2);
        linksFromSleep.add(eat2);
        linksFromSleep.add(sleep2);
        sleep2.setLinks(linksFromSleep);

        List<NodeGraphSecond> linksFromWork = new ArrayList<>();
        linksFromWork.add(rest2);
        work2.setLinks(linksFromWork);

        List<NodeGraphSecond> linksFromRest = new ArrayList<>();
        linksFromRest.add(eat2);
        linksFromRest.add(ill2);
        rest2.setLinks(linksFromRest);

        List<NodeGraphSecond> linksFromEat = new ArrayList<>();
        linksFromEat.add(sleep2);
        eat2.setLinks(linksFromEat);

        NodeGraphSecond now = sleep2.getLinks().get(2);
        now = now.getLinks().get(0);
        now = now.getLinks().get(1);
        now = now.getLinks().get(1);




    }
}
