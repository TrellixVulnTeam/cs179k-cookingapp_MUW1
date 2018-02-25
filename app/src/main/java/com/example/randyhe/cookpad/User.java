package com.example.randyhe.cookpad;

import com.google.firebase.firestore.IgnoreExtraProperties;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by mcast on 2/5/2018.
 * Class needed to retrieve information from user collection in firebase
 */

@IgnoreExtraProperties
public class User {
    private String profilePhotoPath;
    private String username;
    private String name;
    private String email;
    private String bio;
    private String test;
    private Map<String, Boolean> recipes;
    private List<String> followers;
    private List<String> following;
    private List<String> bookmarkedRecipes;

    public User() {}

//    Set functions
    public void setUsername(String s) { this.username = s; }
    public void setName(String s) { this.name = s; }
    public void setEmail(String s) { this.email = s; }
    public void setBio(String s) { this.bio = s; }
    public void setProfilePhotoPath(String s) { this.profilePhotoPath = s; }

//    Get functions
    public String getName() { return name; }
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public String getBio() { return bio; }
    public String getProfilePhotoPath() { return profilePhotoPath; }
    public List<String> getRecipes() {
        return new ArrayList<String>(this.recipes.keySet());
    }
    public int getNumFollowers() {
        if(this.followers == null) { return 0; }
        return followers.size();
    }
    public int getNumFollowing() {
        if(this.following == null) { return 0; }
            return following.size();
    }


}
