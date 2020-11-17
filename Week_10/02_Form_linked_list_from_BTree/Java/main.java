public class Main {
     Node formListRecursive(Node node) {
          if (node == null) {
               return;
          }
          Node head;
          formListRecursive(node.left);
          if (node.left == null && node.right == null)  {
               head.next = node;
               head = head.next;
          }
          formListRecursive(node.right);
          return head.next;
    }
}
