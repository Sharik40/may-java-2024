import task3.Book;
import task3.Comics;
import task3.Magazine;
import task3.Papyrus;
import task4.Car;
import task4.Gender;
import task4.Skill;
import task4.UserInfo;
import task5.Comment;
import task5.Post;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //////////////////// task3 ///////////////////////
        Papyrus papyrus = new Papyrus("red");
        System.out.println(papyrus);

        Book book = new Book("title", "author", "black");
        System.out.println(book);

        Magazine magazine = new Magazine("title", "author", "black", 3);
        System.out.println(magazine);

        Comics comics = new Comics("title", "author", "black","flash");
        System.out.println(comics);
        ///////////////////////////////////////////


        //////////////////// task4 ///////////////////////
        UserInfo userInfo = UserInfo.builder()
                .id(1)
                .age(23)
                .car(new Car("tesla", 2012, 300))
                .email("qwdfqwf@qfqewf.com")
                .name("Zack")
                .gender(Gender.MALE)
                .skills(new Skill[]{new Skill("java", 10), new Skill("python", 20), new Skill("javascript", 30)})
                .surname("Barret")
                .build();
        System.out.println(userInfo);
        ///////////////////////////////////////////

        //////////////////// task5 ///////////////////////
        List<Post> posts = new ArrayList<>();
        List<Comment> comments = new ArrayList<>();

        posts.add(
                Post.builder()
                        .userId(1)
                        .id(1)
                        .title("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")
                        .body("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto")
                        .build()
        );
        posts.add(
                Post.builder()
                        .userId(1)
                        .id(2)
                        .title("qui est esse")
                        .body("est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla")
                        .build()
        );
        posts.add(
                Post.builder()
                        .userId(1)
                        .id(3)
                        .title("ea molestias quasi exercitationem repellat qui ipsa sit aut")
                        .body("et iusto sed quo iure\nvoluptatem occaecati omnis eligendi aut ad\nvoluptatem doloribus vel accusantium quis pariatur\nmolestiae porro eius odio et labore et velit aut")
                        .build()
        );

        comments.add(
                Comment.builder()
                        .postId(1)
                        .id(1)
                        .name("id labore ex et quam laborum")
                        .email("Eliseo@gardner.biz")
                        .body("laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium")
                        .build()
        );
        comments.add(
                Comment.builder()
                        .postId(1)
                        .id(2)
                        .name("quo vero reiciendis velit similique earum")
                        .email("Jayne_Kuhic@sydney.com")
                        .body("est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem reiciendis et")
                        .build()
        );
        comments.add(
                Comment.builder()
                        .postId(1)
                        .id(3)
                        .name("odio adipisci rerum aut animi")
                        .email("Nikita@garfield.biz")
                        .body("quia molestiae reprehenderit quasi aspernatur\naut expedita occaecati aliquam eveniet laudantium\nomnis quibusdam delectus saepe quia accusamus maiores nam est\ncum et ducimus et vero voluptates excepturi deleniti ratione")
                        .build()
        );
        comments.add(
                Comment.builder()
                        .postId(2)
                        .id(7)
                        .name("repellat consequatur praesentium vel minus molestias voluptatum")
                        .email("Dallas@ole.me")
                        .body("maiores sed dolores similique labore et inventore et\nquasi temporibus esse sunt id et\neos voluptatem aliquam\naliquid ratione corporis molestiae mollitia quia et magnam dolor")
                        .build()
        );
        comments.add(
                Comment.builder()
                        .postId(2)
                        .id(8)
                        .name("et omnis dolorem")
                        .email("Mallory_Kunze@marie.org")
                        .body("ut voluptatem corrupti velit\nad voluptatem maiores\net nisi velit vero accusamus maiores\nvoluptates quia aliquid ullam eaque")
                        .build()
        );
        comments.add(
                Comment.builder()
                        .postId(3)
                        .id(13)
                        .name("aut inventore non pariatur sit vitae voluptatem sapiente")
                        .email("Kariane@jadyn.tv")
                        .body("fuga eos qui dolor rerum\ninventore corporis exercitationem\ncorporis cupiditate et deserunt recusandae est sed quis culpa\neum maiores corporis et")
                        .build()
        );
        comments.add(
                Comment.builder()
                        .postId(3)
                        .id(14)
                        .name("et officiis id praesentium hic aut ipsa dolorem repudiandae")
                        .email("Nathan@solon.io")
                        .body("vel quae voluptas qui exercitationем\nvoluptatibus unde sed\nminima et qui ipsam aspernatur\nexpedita magnam laudantium et et quaerat ut qui dolorum")
                        .build()
        );
        comments.add(
                Comment.builder()
                        .postId(3)
                        .id(15)
                        .name("debitis magnam hic odit aut ullam nostrum tenetur")
                        .email("Maynard.Hodkiewicz@roberta.com")
                        .body("nihil ut voluptates blanditiis autem odio dicta rerum\nquisquam saepe et est\nsunt quasi nemo laudantium deserunt\nmolestias tempora quo quia")
                        .build()
        );

        posts.forEach(post -> comments.forEach(comment -> {
            if (comment.getPostId() == post.getId()) {
                post.setPostComments(comment);
            }
        }));

        posts.forEach(System.out::println);
        ///////////////////////////////////////////
    }
}
