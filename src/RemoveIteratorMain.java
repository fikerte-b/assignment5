public class RemoveIteratorMain {
    public static void main(String[] args) {

     RemoveIterator<String> names = new RemoveIterator<>();
     names.add("Kelebet");
     names.add("Rahel");
     names.add("Ruth");
     names.add("Meklit");
     names.add("Yared");
     names.add("kelebet");

        System.out.println(names);
     names.removeAllof("kelebet");
        System.out.println();


    }
}
