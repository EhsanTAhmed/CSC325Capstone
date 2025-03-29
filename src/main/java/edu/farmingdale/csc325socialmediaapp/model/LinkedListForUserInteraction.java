package edu.farmingdale.csc325socialmediaapp.model;

import javafx.scene.image.Image;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;

public class LinkedListForUserInteraction {
    private LinkedList<User> followers;
    private LinkedList<User> following;
    private LinkedList<User> blocked;
    private LinkedList<HikingEntry> hikingHistory;

    public LinkedListForUserInteraction(LinkedList<User> followers, LinkedList<User> following, LinkedList<User> blocked, LinkedList<HikingEntry> hikingHistory) {
        this.followers = followers;
        this.following = following;
        this.blocked = blocked;
        this.hikingHistory = hikingHistory;
    }

    public LinkedListForUserInteraction(LinkedList<User> followers) {
        this.followers = followers;
    }

    public LinkedList<User> getFollowers() {
        return followers;
    }

    public void setFollowers(LinkedList<User> followers) {
        this.followers = followers;
    }

    public LinkedList<HikingEntry> getHikingHistory() {
        return hikingHistory;
    }

    public void setHikingHistory(LinkedList<HikingEntry> hikingHistory) {
        this.hikingHistory = hikingHistory;
    }

    public LinkedList<User> getBlocked() {
        return blocked;
    }

    public void setBlocked(LinkedList<User> blocked) {
        this.blocked = blocked;
    }

    public LinkedList<User> getFollowing() {
        return following;
    }

    public void setFollowing(LinkedList<User> following) {
        this.following = following;
    }
    /**
     * Nested class for hiking post.
     * */
    public static class HikingEntry {
        private String post;
        private User user;
        private LocalTime postTime;
        private LocalDate localDate;
        private int rating;
        private transient Image image;

        public HikingEntry(String post, User user, LocalTime postTime, LocalDate localDate, int rating, Image image) {
            this.post = post;
            this.user = user;
            this.postTime = postTime;
            this.localDate = localDate;
            this.rating = rating;
            this.image = image;
        }

        public String getPost() {
            return post;
        }

        public void setPost(String post) {
            this.post = post;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public LocalTime getPostTime() {
            return postTime;
        }

        public void setPostTime(LocalTime postTime) {
            this.postTime = postTime;
        }

        public LocalDate getLocalDate() {
            return localDate;
        }

        public void setLocalDate(LocalDate localDate) {
            this.localDate = localDate;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        public Image getImage() {
            return image;
        }

        public void setImage(Image image) {
            this.image = image;
        }
    }
}
