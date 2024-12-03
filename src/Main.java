import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        showDogs();
//        showCars();
//        showBooks();
//        showPosts();
        showComments();
    }


    public static void showDogs() {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Buff", 2, "ovcharcka"));
        dogs.add(new Dog("Boy", 1, "zverh"));
        dogs.add(new Dog("Sharik", 4, "pincher"));
        dogs.add(new Dog("Kisel", 5, "haski"));
        dogs.add(new Dog("Zhuchik", 2, "buldog"));

        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }

    public static void showCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla", 300, 0, false));
        cars.add(new Car("Audi", 200, 2.0, true));
        cars.add(new Car("Toyota", 180, 2.5, false));
        cars.add(new Car("Volvo", 200, 3.0, true));
        cars.add(new Car("BMW", 350, 3.5, true));

        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public static void showBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("To Kill a Mockingbird", new String[]{"Harper Lee"}, 281, "Fiction"));
        books.add(new Book("Introduction to Algorithms", new String[]{"Thomas H. Cormen", "Charles E. Leiserson", "Ronald L. Rivest", "Clifford Stein"}, 1312, "Technical"));
        books.add(new Book("The Great Gatsby", new String[]{"F. Scott Fitzgerald"}, 180, "Classic"));
        books.add(new Book("Good Omens", new String[]{"Neil Gaiman", "Terry Pratchett"}, 432, "Fantasy"));
        books.add(new Book("1984", new String[]{"George Orwell"}, 328, "Dystopian"));

        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void showPosts() {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post(1, 1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
                "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"));
        posts.add(new Post(2, 2, "qui est esse",
                "est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis"));
        posts.add(new Post(3, 3, "ea molestias quasi exercitationem repellat qui ipsa sit aut",
                "et iusto sed quo iure\nvoluptatem occaecati omnis eligendi aut ad\nvoluptatem doloribus vel accusantium quis pariatur\nmolestiae porro eius odio et labore et velit aut"));
        posts.add(new Post(4, 4, "eum et est occaecati",
                "ullam et saepe reiciendis voluptatem adipisci\nsit amet autem assumenda provident rerum culpa\nquis hic commodi nesciunt rem tenetur doloremque ipsam iure"));
        posts.add(new Post(5, 5, "nesciunt quas odio",
                "repudiandae veniam quaerat sunt sed\nalias aut fugiat sit autem sed est\nvoluptatem omnis possimus esse voluptatibus quis\nest aut tenetur dolor neque"));

        for (Post post : posts) {
            System.out.println();
            System.out.println(post);
        }
    }

    public static void showComments() {
        List<Comment> comments = new ArrayList<>();
        comments.add(new Comment(1, 1, "id labore ex et quam laborum",
                "Eliseo@gardner.biz",
                "laudantium enim quasi est quidem magnam voluptate ipsam eos\n" +
                        "tempora quo necessitatibus\n" +
                        "dolor quam autem quasi\n" +
                        "reiciendis et nam sapiente accusantium"));
        comments.add(new Comment(1, 2, "quo vero reiciendis velit similique earum",
                "Jayne_Kuhic@sydney.com",
                "est natus enim nihil est dolore omnis voluptatem numquam\n" +
                        "et omnis occaecati quod ullam at\n" +
                        "voluptatem error expedita pariatur\n" +
                        "nihil sint nostrum voluptatem reiciendis et"));
        comments.add(new Comment(2, 3, "odio adipisci rerum aut animi",
                "Nikita@garfield.biz",
                "quia molestiae reprehenderit quasi aspernatur\n" +
                        "aut expedita occaecati aliquam eveniet laudantium\n" +
                        "omnis quibusdam delectus saepe quia accusamus maiores nam est\n" +
                        "cum et ducimus et vero voluptates excepturi deleniti ratione"));
        comments.add(new Comment(3, 4, "alias odio sit",
                "Lew@alysha.tv",
                "non et atque\n" +
                        "occaecati deserunt quas accusantium unde odit nobis qui voluptatem\n" +
                        "quia voluptas consequuntur itaque dolor\n" +
                        "et qui rerum deleniti ut occaecati"));
        comments.add(new Comment(4, 5, "vero eaque aliquid doloribus et culpa",
                "Hayden@althea.biz",
                "harum non quasi et ratione\n" +
                        "tempore iure ex voluptates in ratione\n" +
                        "harum architecto fugit inventore cupiditate\n" +
                        "voluptates magni quo et"));

        for (Comment comment : comments) {
            System.out.println();
            System.out.println(comment);
        }
    }
}
