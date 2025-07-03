package TreePack;

import java.util.Scanner;

public class MenuClass {
    static Scanner inp = new Scanner(System.in);

    public void Masukan(MainClass a, int b) {
        if (b < a.value) {
            if (a.left != null)
                Masukan(a.left, b);
            else {
                a.left = new MainClass();
                a.left.input(b);
                System.out.println(b + " di kiri " + a.value);
            }
        } else if (b > a.value) {
            if (a.right != null)
                Masukan(a.right, b);
            else {
                a.right = new MainClass();
                a.right.input(b);
                System.out.println(b + " di kanan " + a.value);
            }
        }
    }

    public void Lihat(MainClass a) {
        System.out.print("Pre-Order: ");
        PreOrder(a);
        System.out.println(" ");

        System.out.print("InOrder: ");
        InOrder(a);
        System.out.println(" ");

        System.out.print("PostOrder: ");
        PostOrder(a);
        System.out.println(" ");
    }

    public void PreOrder(MainClass a) {
        if (a != null) {
            System.out.print(a.value + " ");
            PreOrder(a.left);
            PreOrder(a.right);
        }
    }

    public void InOrder(MainClass a) {
        if (a != null) {
            InOrder(a.left);
            System.out.print(a.value + " ");
            InOrder(a.right);
        }
    }

    public void PostOrder(MainClass a) {
        if (a != null) {
            InOrder(a.left);
            InOrder(a.right);
            System.out.print(a.value + " ");
        }
    }
}
