/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author khanh
 */
public class Forum {
    private String username;
    private String chat;

    public Forum() {
    }

    public Forum(String username, String chat) {
        this.username = username;
        this.chat = chat;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }

    @Override
    public String toString() {
        return "Forum{" + "username=" + username + ", chat=" + chat + '}';
    }
       
    
}
