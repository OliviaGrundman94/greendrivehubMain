package discussionboard;

public class Comment {
        private final String author;
        private final String content;

        public Comment(String author, String content) {
            this.author = author;
            this.content = content;
        }

        @Override
        public String toString() {
            return "Author: " + author + ", Content: " + content;
        }
    }
