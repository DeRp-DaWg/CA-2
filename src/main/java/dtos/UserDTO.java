package dtos;

import entities.User;

public class UserDTO {
    private String username;
    private long score;
    private long highscore;

    public UserDTO(String username, long score, long highscore) {
        this.username = username;
        this.score = score;
        this.highscore = highscore;
    }

    public UserDTO(User user) {
        this.username = user.getUserName();
        this.score = user.getScore();
        this.highscore = user.getHighscore();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public long getHighscore() {
        return highscore;
    }

    public void setHighscore(long highscore) {
        this.highscore = highscore;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "username='" + username + '\'' +
                ", score=" + score +
                ", highscore=" + highscore +
                '}';
    }
}
