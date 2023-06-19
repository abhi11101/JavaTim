package Section10;

import Section7_8_OOPS.Challenge.Item;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        GroceryItem[] groceryItems = new GroceryItem[3];
//        groceryItems[0]= new GroceryItem("milk");
//        groceryItems[1] = new GroceryItem("apples","PRODUCE",6);
//        groceryItems[2]= new GroceryItem("oranges","PRODUCE",5);
//        System.out.println(Arrays.toString(groceryItems));
//
//        ArrayList objectList = new ArrayList();
//        objectList.add(new GroceryItem(("Butter")));
//        objectList.add("Yogurt");
//
//        ArrayList<GroceryItem> groceryList = new ArrayList<>();
//        groceryList.add(new GroceryItem("Butter"));
//        groceryList.add(new GroceryItem("milk"));
//        groceryList.add(new GroceryItem("oranges","PRODUCE",5));
//        System.out.println(groceryList);

        moreList();

    }

    public static void moreList(){
        String[] items = {"apples","banana","milk","eggs"};

        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println("Groceries\n"+groceries);

        ArrayList<String> nextList = new ArrayList<>(List.of("pickles","mustard","cheese"));
        groceries.addAll(nextList);
        System.out.println("NextList\n"+nextList);
        System.out.println("Groceries\n"+groceries);

        groceries.retainAll(List.of("apples","mustard","milk","cheese"));
        System.out.println("Groceries\n"+groceries);

        groceries.addAll(List.of("apples","pickles","milk"));
        System.out.println("Groceries\n"+groceries);

        groceries.sort(Comparator.naturalOrder());
        System.out.println("Groceries\n"+groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println("Groceries\n"+groceries);

        var groceryArray = groceries.toArray();
        System.out.println(Arrays.toString(groceryArray));

        LinkedList<String> linkedList = new LinkedList<>(groceries);
        iterate(linkedList);
    }

    public static void iterate(LinkedList<String> list){
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-".repeat(15));
        var itr = list.listIterator();
        while (itr.hasNext()){
           // System.out.println(itr.next());
            if (itr.next().equals("apples")){
                list.remove();
            }
        }

        System.out.println(list);
        list.remove("apples");
        System.out.println(list);
    }
}
