package com.network111.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
public class Message {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger id;

    @Column(name = "from")
    private BigInteger from;

    @Column(name = "to")
    private BigInteger to;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "text")
    private String text;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getFrom() {
        return from;
    }

    public void setFrom(BigInteger from) {
        this.from = from;
    }

    public BigInteger getTo() {
        return to;
    }

    public void setTo(BigInteger to) {
        this.to = to;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
