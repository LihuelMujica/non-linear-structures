package binarytrees;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        tree.traversePreOrder();
        tree.traverseInOrder();
        tree.traversePostOrder();
    }

    public static int factorial(int n) {
        // 4! = 4 x 3!
        var factorial = 1;
        for (var i = n; i>1; i--)
            factorial *= i;
        return factorial;
    }

    public static  int recursiveFactorial(int n) {
        if (n == 1 ) return 1;
        return n * recursiveFactorial(n-1);
    }
}
