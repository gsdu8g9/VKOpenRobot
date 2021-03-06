package com.alkor.vph.vk;

import com.alkor.vph.vk.entities.*;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

/**
 * Author: akorobitsyn
 * Date: 01.07.13
 * Time: 14:14
 */
public interface VKConnector {

    List<Group> searchGroups(String query, int count, String token) throws IOException;

    List<User> getUsers(Collection<Long> userIds, String token) throws IOException;

    List<Long> getGroupMembers(long groupId, int count, String token) throws IOException;

    void joinGroup(long groupId, String token) throws IOException;

    AddFriendResult addFriend(long uid, String text, Captcha captcha, String token) throws IOException;

    WallPostResult wallPost(Long gid, Post post, Captcha captcha, String token) throws IOException;

    String uploadWallPhoto(String token, byte[] bytes) throws IOException, InterruptedException;

    AddFriendResult setStatus(String text, String token) throws IOException;

}
