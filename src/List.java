public class List <T>{
    private Node<T> firstNode;
    private Node<T> lastNode;

    private int counter;
    public List(){
        this.firstNode = null;
        this.lastNode = null;
        this.counter = 0;
    }

    public boolean isEmpty(){
        return this.firstNode == null;
    }

    public int size(){
        return this.counter;
    }

    public void add(T element){
        Node<T> newElement = new Node<>(element);

        if(this.isEmpty()){
            this.firstNode = newElement;
        }else{
            this.lastNode.setNextNode(newElement);
        }
        this.lastNode = newElement;
        counter++;
    }

    public String get(int index){
        Node<T> node = getNode(index);
        return node.toString();
    }

    public void remove(int index){
        Node<T> auxNode = getNode(index -1);
        if(index == 0){
            firstNode = firstNode.getNextNode();
        }else if(index == size() -1){
            auxNode.setNextNode(null);
            lastNode = auxNode;
        }else{
            auxNode.setNextNode(auxNode.getNextNode().getNextNode());
        }
        counter--;
    }

    public Node<T> first(){
        return firstNode;
    }

    public Node<T> last(){
        return lastNode;
    }

    private Node<T> getNode(int index){
        Node<T> auxNode = firstNode;

        if(index >= size()) throw new IndexOutOfBoundsException("The list size is " + this.size() + "!");

        for(int i = 0; i <= index - 1; i++){
            auxNode = auxNode.getNextNode();
        }

        return auxNode;
    }

    @Override
    public String toString() {
        StringBuilder strReturn = new StringBuilder();
        Node<T> auxNode = firstNode;

        for(int i = 0; i <= size() -1; i++){
            strReturn.append("[Node{content=").append(auxNode.getContent()).append("}]===>");
            auxNode = auxNode.getNextNode();
        }

        strReturn.append("null");

        return strReturn.toString();
    }
}
