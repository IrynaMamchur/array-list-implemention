import java.util.ArrayList;
import java.util.List;

public class MainGraphHomeWork {
    public static void main(String[] args) {
        NodeGraphSecond а = new NodeGraphSecond(null, "A");
        NodeGraphSecond б = new NodeGraphSecond(null, "Б");
        NodeGraphSecond в = new NodeGraphSecond(null, "В");
        NodeGraphSecond г = new NodeGraphSecond(null, "Г");
        NodeGraphSecond д = new NodeGraphSecond(null, "Д");
        NodeGraphSecond е = new NodeGraphSecond(null, "Е");
        NodeGraphSecond ж = new NodeGraphSecond(null, "Ж");
        NodeGraphSecond з = new NodeGraphSecond(null, "З");
        NodeGraphSecond и = new NodeGraphSecond(null, "И");
        NodeGraphSecond к = new NodeGraphSecond(null, "К");

        List<NodeGraphSecond> linksFromА = new ArrayList<>();
        linksFromА.add(б);
        linksFromА.add(в);
        linksFromА.add(г);
        linksFromА.add(д);
        а.setLinks(linksFromА);

        List<NodeGraphSecond> linksFromБ = new ArrayList<>();
        linksFromБ.add(е);
        linksFromБ.add(в);
        б.setLinks(linksFromБ);

        List<NodeGraphSecond> linksFromВ = new ArrayList<>();
        linksFromВ.add(ж);
        в.setLinks(linksFromВ);

        List<NodeGraphSecond> linksFromГ = new ArrayList<>();
        linksFromГ.add(в);
        linksFromГ.add(з);
        г.setLinks(linksFromГ);

        List<NodeGraphSecond> linksFromД = new ArrayList<>();
        linksFromД.add(г);
        linksFromД.add(и);
        д.setLinks(linksFromД);

        List<NodeGraphSecond> linksFromЕ = new ArrayList<>();
        linksFromЕ.add(к);
        е.setLinks(linksFromЕ);

        List<NodeGraphSecond> linksFromЖ = new ArrayList<>();
        linksFromЖ.add(к);
        linksFromЖ.add(з);
        ж.setLinks(linksFromЖ);

        List<NodeGraphSecond> linksFromЗ = new ArrayList<>();
        linksFromЗ.add(к);
        з.setLinks(linksFromЗ);

        List<NodeGraphSecond> linksFromИ = new ArrayList<>();
        linksFromИ.add(к);
        и.setLinks(linksFromИ);

    }


}
