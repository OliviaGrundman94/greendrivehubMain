package discussionboard;

import discussionboard.Comment;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private final int id;
    private final String author;
    private final String title;
    private final String content;
    private final List<Comment> comments;

    public Post(int id, String author, String title, String content) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.content = content;
        this.comments = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id).append("\n")
                .append("Author: ").append(author).append("\n")
                .append("Title: ").append(title).append("\n")
                .append("Content: ").append(content).append("\n")
                .append("Comments:\n");
        for (Comment comment : comments) {
            sb.append("\t").append(comment).append("\n");
        }
        return sb.toString();
    }
}

