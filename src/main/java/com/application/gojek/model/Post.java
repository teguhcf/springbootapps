package com.application.gojek.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "posts")
public class Post extends AuditModel {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @NotNull
    @Size(max = 100)
    @Column(unique = true)
    private String title;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @NotNull
    @Size(max = 250)
    private String description;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @NotNull
    @Lob
    private String content;

    // Getters and Setters (Omitted for brevity)
}
