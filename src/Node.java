public class Node<T> {
  private Node<T> nextNode;
  private T content;

  public Node(){
    this.nextNode = null;
  }

  public Node(T content){
    this.content = content;
  }

  public Node<T> getNextNode() {
    return nextNode;
  }

  public void setNextNode(Node<T> nextNode) {
    this.nextNode = nextNode;
  }

  public T getContent() {
    return content;
  }

  public void setContent(T content) {
    this.content = content;
  }

  @Override
  public String toString() {
      return "Node{" +
            "content=" + content +
            '}';
  }
}
