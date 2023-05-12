package discussionboard;

import discussionboard.Comment;

import java.util.HashMap;
import java.util.Map;

public class DiscussionBoard {
    private final Map<Integer, Post> posts;
    private int currentPostId;

    public DiscussionBoard() {
        this.posts = new HashMap<>();
        this.currentPostId = 1;
    }

    public void createPost(String author, String title, String content) {
        Post post = new Post(currentPostId++, author, title, content);
        posts.put(post.getId(), post);
        System.out.println("discussionboard.Post created successfully.");
    }

    public void commentOnPost(int postId, String author, String content) {
        Post post = posts.get(postId);
        if (post != null) {
            post.addComment(new Comment(author, content));
            System.out.println("discussionboard.Comment added successfully.");
        } else {
            System.out.println("discussionboard.Post not found.");
        }
    }

    public void displayPosts() {
        for (Post post : posts.values()) {
            System.out.println(post);
        }
    }
}
