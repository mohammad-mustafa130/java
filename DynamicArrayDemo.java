import java.util.Vector;
class DynamicArrayDemo {
        public static void main(String[] args) {
                Vector<String> names = new Vector<>(5);
                names.add("Amir Khursheed");
                names.add("Zaid Khan");
                names.add("Iqra Fatima");

                System.out.println(names.capacity());
                System.out.println(names.size());

                names.add("Basheer Ahmad");
                names.add("Jack Sparrow");
                names.add("Noor Saba");

                System.out.println(names.capacity());
                System.out.println(names.size());
        }
}

