package com.java.jdk8;

import lombok.Data;

@Data
class Tuple {
    BlogPostType type;
    String author;

    public Tuple(BlogPostType type, String author) {
    }
}
