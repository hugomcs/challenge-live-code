package net.intelie.challenge;

/**
 * Modify the given program to output "foobar" n times.
 */
public class FooBar {
    private int n;

    public FooBar(int n) {
        this.n = n;
    }

    public void foo() throws InterruptedException {
        for (int i = 0; i < n; i++) {
            System.out.print("foo");
        }
    }

    public void bar() throws InterruptedException {
        for (int i = 0; i < n; i++) {
            System.out.print("bar");
        }
    }

    public static void main(String[] args) {
        final FooBar f = new FooBar(100);

        new Thread(() -> {
            try {
                f.foo();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                f.bar();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}