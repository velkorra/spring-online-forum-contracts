package org.forum.forumcontracts.filters;

public record UserFilter(String username, String role, Boolean includeDeleted) {
    public static UserFilter blank(){
        return new UserFilter(null, null, null);
    }

    public UserFilter withUsername(String username){
        return new UserFilter(username, role, includeDeleted);
    }
}