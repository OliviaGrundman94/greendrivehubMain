package discussionboard;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        DiscussionBoard discussionBoard = new DiscussionBoard();
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("Enter 1 to create a new post, 2 to comment on a post, 3 to display all posts, or 4 to exit:");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 1) {
                System.out.println("Enter your name:");
                String name = scanner.nextLine();

                System.out.println("Enter the post title:");
                String title = scanner.nextLine();

                System.out.println("Enter the post content:");
                String content = scanner.nextLine();

                discussionBoard.createPost(name, title, content);
            } else if (choice == 2) {
                System.out.println("Enter the post ID:");
                int postId = scanner.nextInt();
                scanner.nextLine(); // consume newline

                System.out.println("Enter your name:");
                String name = scanner.nextLine();

                System.out.println("Enter the comment content:");
                String content = scanner.nextLine();

                discussionBoard.commentOnPost(postId, name, content);
            } else if (choice == 3) {
                discussionBoard.displayPosts();
            } else if (choice == 4) {
                keepRunning = false;
            }
        }
    }
}
