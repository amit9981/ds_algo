package com.java.jdk8;

import lombok.Data;

@Data
class BlogPost {
    String title;
    String author;
    BlogPostType type;
    int likes;
}

