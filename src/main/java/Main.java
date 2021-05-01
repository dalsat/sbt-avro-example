import me.dalsat.avro.Author;
import me.dalsat.avro.Post;

import java.time.Instant;


public class Main {

    public static void main(String[] args) {

        var author = Author.newBuilder()
            .setUserName("jdoe")
            .setDisplayName("John Doe")
            .setRegistrationDate(Instant.now())
            .build();

        System.out.println(author);


        var post = Post.newBuilder()
            .setTitle("Avro Example")
            .setContent("Hello post!")
            .setPublicationDate(Instant.now())
            .setAuthor(author)
            .build();

        System.out.println(post);
    }
}
