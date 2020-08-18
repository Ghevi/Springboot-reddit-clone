package com.ghevi.reddit.mapper;

import com.ghevi.reddit.dto.PostRequest;
import com.ghevi.reddit.dto.PostResponse;
import com.ghevi.reddit.model.Post;
import com.ghevi.reddit.model.Subreddit;
import com.ghevi.reddit.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PostMapper {

    // @Mapping(target = "subreddit", source = "subreddit") Since target and source are the same
    // @Mapping(target = "user", source = "user") we don't need to specify this mapping
    @Mapping(target = "createdDate", expression = "java(java.time.Instant.now())")
    @Mapping(target = "description", source = "postRequest.description")
    Post map(PostRequest postRequest, Subreddit subreddit, User user);

    // @Mapping(target = "postName", source = "postName")
    // @Mapping(target = "description", source = "description")
    // @Mapping(target = "url", source = "url")
    @Mapping(target = "id", source = "postId")
    @Mapping(target = "subredditName", source = "subreddit.name")
    @Mapping(target = "userName", source = "user.username")
    PostResponse mapToDto(Post post);

}
