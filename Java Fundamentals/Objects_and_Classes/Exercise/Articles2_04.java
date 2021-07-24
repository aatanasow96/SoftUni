package Objects_and_Classes.Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Articles2_04 {
    static class Article {
        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public String toString() {
            return title + " - " + content + ": " + author;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Article> articles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String inputArticle = scanner.nextLine();
            String title = inputArticle.split(", ")[0];
            String content = inputArticle.split(", ")[1];
            String author = inputArticle.split(", ")[2];
            Article article = new Article(title, content, author);
            articles.add(article);
        }

        String command = scanner.nextLine();
        switch (command) {
            case "title":
                articles.sort(Comparator.comparing(Article::getTitle));
                break;

            case "content":
                articles.sort(Comparator.comparing(Article::getContent));
                break;

            case "author":
                articles.sort(Comparator.comparing(Article::getAuthor));
                break;
        }

        for (Article article : articles) {
            System.out.println(article);
        }
    }
}
