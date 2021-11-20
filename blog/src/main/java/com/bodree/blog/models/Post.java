package com.bodree.blog.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Post {
    @Id
    private Long id;
}
