/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analytics;

/**
 *
 * @author rithwikvarma
 */

import data.DataStore;
import java.util.Map;
import model.Comment;
import model.Post;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;


import model.Post;
import model.User;





public class AnalysisHelper {
    //Find Average number of likes per comment.
    
    
    //TODO
    public void getAverageLikesPerComments() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int likeNumber = 0;
        int commentNumber = comments.size();
        for (Comment c : comments.values()) {
            likeNumber += c.getLikes();
        }
        
        System.out.println("Q1-Average number of likes per comments: " + likeNumber / commentNumber);
            
    }
    
    public void getMaxLikeCommentPost() {
    DataStore data = DataStore.getInstance();
    Comment commentWithMaxLikes = null;

    for (Comment c : data.getComments().values()) {
        if (commentWithMaxLikes == null) {
            commentWithMaxLikes = c;
        }
        if (c.getLikes() > commentWithMaxLikes.getLikes()) {
            commentWithMaxLikes = c;
        }
    }

    int postId = commentWithMaxLikes.getPostId();
    System.out.println("Q2 - post with most likes per comment " + data.getPosts().get(postId).getPostId());
}
    
public void getPostWithMostComments() {
    DataStore data = DataStore.getInstance();
    Post maxCommentPost = null;

    for (Post p : data.getPosts().values()) {
        if (maxCommentPost == null || p.getComments().size() > maxCommentPost.getComments().size()) {
            maxCommentPost = p;
        }
    }

    System.out.println("Q3 - Post with most comments: " + maxCommentPost.getPostId());
}
public void getPassiveUsers() {
    DataStore data = DataStore.getInstance();
    HashMap<Integer, Integer> postNumbers = new HashMap<Integer, Integer>();

    for (Post p : data.getPosts().values()) {
        int userId = p.getUserId();
        if (postNumbers.containsKey(userId)) {
            postNumbers.put(userId, postNumbers.get(userId) + 1);
        } else {
            postNumbers.put(userId, 1);
        }
    }

    ArrayList<User> users = new ArrayList<>(data.getUsers().values());

    Collections.sort(users, new UserMapComparator(postNumbers, false)); // false = ascending order

    System.out.println("Q4 - The following users have the least posts:");
    for (int i = 0; i < 5 && i < users.size(); i++) {
        System.out.println(users.get(i) + ", - Post count: " +
            postNumbers.getOrDefault(users.get(i).getId(), 0));
    }
}

public void getInactiveUsersByComments() {
    DataStore data = DataStore.getInstance();
    HashMap<Integer, Integer> commentCounts = new HashMap<>();

    // Step 1: Count comments created by each user
    for (Comment c : data.getComments().values()) {
        int userId = c.getUserId();
        commentCounts.put(userId, commentCounts.getOrDefault(userId, 0) + 1);
    }

    // Step 2: Get all users
    ArrayList<User> users = new ArrayList<>(data.getUsers().values());

    // Step 3: Sort users by comment count (ascending)
    Collections.sort(users, new UserMapComparator(commentCounts, false)); // false = low to high

    // Step 4: Print top 5 least active by comments
    System.out.println("Q5 - The following users have the least comments:");
    for (int i = 0; i < 5 && i < users.size(); i++) {
        System.out.println(users.get(i) + ", - Comment count: " +
            commentCounts.getOrDefault(users.get(i).getId(), 0));
    }
}
public void getLeastActiveUsersOverall() {
    DataStore data = DataStore.getInstance();
    HashMap<Integer, Integer> userActivityScore = new HashMap<>();

    // Step 1: Count posts per user
    for (Post p : data.getPosts().values()) {
        int userId = p.getUserId();
        userActivityScore.put(userId, userActivityScore.getOrDefault(userId, 0) + 1);
    }

    // Step 2: Count comments and likes per user
    for (Comment c : data.getComments().values()) {
        int userId = c.getUserId();
        int existingScore = userActivityScore.getOrDefault(userId, 0);
        existingScore += 1;               // 1 point for comment
        existingScore += c.getLikes();    // points for likes
        userActivityScore.put(userId, existingScore);
    }

    // Step 3: Get all users
    ArrayList<User> users = new ArrayList<>(data.getUsers().values());

    // Step 4: Sort users by total score (ascending)
    Collections.sort(users, new UserMapComparator(userActivityScore, false)); // false = low to high

    // Step 5: Print top 5 least active
    System.out.println("Q6 - The following users are least active (by total activity):");
    for (int i = 0; i < 5 && i < users.size(); i++) {
        int score = userActivityScore.getOrDefault(users.get(i).getId(), 0);
        System.out.println(users.get(i) + ", - Activity score: " + score);
    }
}
public void getMostActiveUsersOverall() {
    DataStore data = DataStore.getInstance();
    HashMap<Integer, Integer> userActivityScore = new HashMap<>();

    // Step 1: Count posts per user
    for (Post p : data.getPosts().values()) {
        int userId = p.getUserId();
        userActivityScore.put(userId, userActivityScore.getOrDefault(userId, 0) + 1);
    }

    // Step 2: Count comments and likes per user
    for (Comment c : data.getComments().values()) {
        int userId = c.getUserId();
        int existingScore = userActivityScore.getOrDefault(userId, 0);
        existingScore += 1;               // 1 point for comment
        existingScore += c.getLikes();    // points for likes
        userActivityScore.put(userId, existingScore);
    }

    // Step 3: Get all users
    ArrayList<User> users = new ArrayList<>(data.getUsers().values());

    // Step 4: Sort users by total score (descending for proactive)
    Collections.sort(users, new UserMapComparator(userActivityScore, true)); // true = high to low

    // Step 5: Print top 5 most active
    System.out.println("Q7 - The following users are most active (by total activity):");
    for (int i = 0; i < 5 && i < users.size(); i++) {
        int score = userActivityScore.getOrDefault(users.get(i).getId(), 0);
        System.out.println(users.get(i) + ", - Activity score: " + score);
    }
}

  
    
}

