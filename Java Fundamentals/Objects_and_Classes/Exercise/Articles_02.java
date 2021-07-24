package Objects_and_Classes.Exercise;

import java.util.Scanner;

public class Articles_02 {
    static class Article {
        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        static void edit(Article article, String newContent) {
            article.setContent(newContent);
        }

        static void change(Article article, String newAuthor) {
            article.setAuthor(newAuthor);
        }

        static void rename(Article article, String newTitle) {
            article.setTitle(newTitle);
        }

        public String toString() {
            return title + " - " + content + ": " + author;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArticle = scanner.nextLine().split(", ");
        String title = inputArticle[0];
        String content = inputArticle[1];
        String author = inputArticle[2];
        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] commands = scanner.nextLine().split(": ");
            String command = commands[0];

            switch (command) {
                case "Edit":
                    String newContent = commands[1];
                    Article.edit(article, newContent);
                    break;

                case "ChangeAuthor":
                    String newAuthor = commands[1];
                    Article.change(article, newAuthor);
                    break;

                case "Rename":
                    String newTitle = commands[1];
                    Article.rename(article, newTitle);
                    break;
            }
        }

        System.out.print(article);
    }
}
