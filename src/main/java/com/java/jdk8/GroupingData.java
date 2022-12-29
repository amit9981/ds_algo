package com.java.jdk8;

import com.java.api.MockData;
import com.java.beans.Car;
import com.java.beans.Person;
import org.junit.Test;

import java.security.PublicKey;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
//static import allow all static member access without class name


public class GroupingData {
    @Test
    public void simpleGrouping() throws Exception {
        Map map=MockData.getPeople().stream().collect(groupingBy(Person::getGender));
        System.out.println(map);
//map.forEach((k,v)-> System.out.println(k));
    /*    Map<String, List<Car>> map = MockData.getCars()
                .stream()
                .collect(Collectors.groupingBy(Car::getColor));
        map.forEach((s, cars) -> {
            System.out.println("Make " + s);
            cars.forEach(System.out::println);
            System.out.println("---------------------");
        });*/
      //  System.out.println(MockData.getCars().stream().collect(Collectors.groupingBy(Car::getColor)));

    }

    @Test
    public void groupingAndCounting() {
        List<String> names = List.of(
                "John",
                "John",
                "Mariam",
                "Alex",
                "Mohammado",
                "Mohammado",
                "Vincent",
                "Alex",
                "Alex"
        );

        Map<String, Long> map = names.stream()
                .collect(groupingBy(
                        Function.identity(),
                        Collectors.counting())
                );

        /*Map<String, Long> map1 = names.stream()
                .collect(Collectors.groupingBy()
                );*/
        System.out.println(map);
        //System.out.println(map1);

    }
    @Test
    public void singleColumnGroup() {
        BlogPost blogPost = new BlogPost();
        blogPost.likes = 100;
        blogPost.author = "amit";
        blogPost.setType(BlogPostType.NEWS);
        BlogPost blogPost1 = new BlogPost();
        blogPost1.likes = 101;
        blogPost1.author = "sumit";
        blogPost1.setType(BlogPostType.NEWS);
        BlogPost blogPost2 = new BlogPost();
        blogPost2.likes = 102;
        blogPost2.author = "mohit";
        blogPost2.setType(BlogPostType.NEWS);
        BlogPost blogPost3 = new BlogPost();
        blogPost3.likes = 103;
        blogPost3.author = "Amit";
        blogPost3.setType(BlogPostType.REVIEW);
        List<BlogPost> posts = List.of(blogPost, blogPost1, blogPost2, blogPost3);

        Map<BlogPostType, List<BlogPost>> postsPerType = posts.stream()
                .collect(Collectors.groupingBy(BlogPost::getType));
        System.out.println(postsPerType);
//op
    /*{NEWS=[BlogPost(title=null, author=amit, type=NEWS, likes=100),
            BlogPost(title=null, author=sumit, type=NEWS, likes=101),
            BlogPost(title=null, author=mohit, type=NEWS, likes=102)],
        REVIEW=[BlogPost(title=null, author=Amit, type=REVIEW, likes=103)]}*/

      /*  Map<Pair<BlogPostType, String>, List<BlogPost>> postsPerTypeAndAuthor = posts.stream()
                .collect(groupingBy(post -> new ImmutablePair<>(post.getType(), post.getAuthor())));*/
    }


}

