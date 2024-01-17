package day18;

import java.util.List;
import java.util.ArrayList;

public class Node {
    private int value;
    private Node right;
    private Node left;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getRight() {
        return right;
    }

    public Node getLeft() {
        return left;
    }

    public static void addnode(int value, Node root) {
        //Если значение добавляемого узла больше или равно значению корневого узла(для текущего рекурсивного вызова)
        if (value >= root.value) {
            //Если в правом узле null
            if(root.right == null) {
                //Добавляем значение в правый узел
                root.right = new Node(value);
            } else {
                //Иначе, если в правом узле есть значение, вызываем рекурсию, в качестве нового root узла указываем узел справа от текущего
                addnode(value, root.right);
            }
            //Если значение добавляемого узла меньше значения корневого узла
        } else {
            //Если в левом узле null
            if(root.left == null) {
                //Добавляем значение в левый узел
                root.left = new Node(value);
            } else {
                //Иначе, если в левом узле есть значение, вызываем рекурсию, в качестве нового root узла указываем узел слева от текущего
                addnode(value, root.left);
            }
        }
    }

    public static void dfs(Node node) {
        //Если узел равен null, выходим из метода
        if (node == null) {
            return;
        }
        //Рекурсивно вызываем метод на узле слева от текущего узла
        dfs(node.left);
        //Так как в конце концов мы вызовем dfs(null), рекурсия закончится, и мы выведем в строку через пробел
        //значения ветки дерева по возрастанию
        System.out.print(node.value + " ");
        //переходим на следующую ветку.
        dfs(node.right);
        //Таким образом пройдемся по всем веткам дерева, в конце концов node.right будет равно null. И метод прекратит
        //Свою работу
    }
}
