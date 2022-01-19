import java.util.Iterator;

public class RemoveIterator<E> implements Iterable<E>{

    private Node<E> head = null;
    private int size =0;
    private static class Node<E>{

        // Data fields
        private E data;
        private Node<E> next;

        private Node (E item) {
            this.data = item;
            this.next = null;
        }
        private Node (E item, Node<E> nodeRef) {
            this.data = item;
            this.next = nodeRef;
        }
    }
    private void addFirst(E item){
        Node<E> temp = new Node<>(item, head);
        head = temp;
        size++;
    }

    private void addAfter(E item, Node<E> node){
        Node<E> temp = new Node<>(item, node.next);
        node.next = temp;
        size++;
    }
    private Node<E> getNode(int index){
        Node<E> node = head;
        for (int i = 0; i < index && node != null; i++) {
            node = node.next;
        }
        return node;
    }

    public void add(int index, E item){
        if(index < 0 || index > size)
            throw new ArrayIndexOutOfBoundsException();

        if(index ==0){
            addFirst(item);
        }
        else{
            Node<E> node = getNode(index - 1);
            addAfter(item, node);
        }

    }
    public void add(E item){
        add(size,item);
    }

    private E removeAfter(Node<E> node){
        Node<E> toRemove = node.next;

        if(toRemove != null){
            node.next = toRemove.next;
            size--;
            return toRemove.data;
        }
        else
            return null;
    }

    private E removeFirst(){
        Node<E> toRemove = head;

        if(head != null){
            head = head.next;
            size--;
            return toRemove.data;
        }
        else
            return null;
    }
    public boolean removeI(Object i) {
        E item = (E) i;
        if (head == null) {
            return false;
        }
        Node<E> current = head;
        if(item.equals(current.data)){
            removeFirst();
            return true;
        }
        while(current.next != null){
            if(item.equals(current.next.data)){
                removeAfter(current);
                return true;
            }
            current = current.next;

        }
        return false;

    }


    class MyIterator<E> implements Iterator<E>{
        public MyIterator(){}
        public Node<E> current = (Node<E>) head;
        @Override
        public boolean hasNext() {
            return (current != null);
        }

        @Override
        public E next() {
            E item = current.data;
            current = current.next;
            return item;
        }

        @Override
        public void remove() {
            E item = current.data;
            removeI(item);
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new  MyIterator<E>();
    }

        public void removeAllof(E target){
            Iterator<E> iter= iterator();
            while (iter.hasNext()) {

                if (target.equals(iter.next())) {
                    iter.remove();
                }
            }
        }

    public String toString() {
        Node<E> current = head;
        StringBuilder result = new StringBuilder();
        while (current != null) {
            result.append(current.data);
            if (current.next != null) {
                result.append(" ==> ");
            }
            current = current.next;
        }
        return result.toString();
    }

}
