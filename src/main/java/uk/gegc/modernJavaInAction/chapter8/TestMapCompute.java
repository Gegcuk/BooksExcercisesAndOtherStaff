package uk.gegc.modernJavaInAction.chapter8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMapCompute {

    public static void main(String[] args) {
        Map<String, List<String>> friendsHobbies = new HashMap<>();

        addHobby(friendsHobbies, "Mark", "Football");
        addHobby(friendsHobbies, "Anna", "French");
        addHobby(friendsHobbies, "Anna", "Cooking");
        addHobby(friendsHobbies, "Adelina", "Art");

        System.out.println(friendsHobbies);

        friendsHobbies.computeIfPresent("Anna", (k, list)-> {
            list.remove("Cooking");
            return list;
        });

        System.out.println(friendsHobbies);

        Map<String, List<String>> newFriendsHobbies = new HashMap<>();
        addHobby(newFriendsHobbies, "Mark", "Baseball");
        addHobby(newFriendsHobbies, "Anna", "Spanish");
        addHobby(newFriendsHobbies, "Anna", "Cleaning");
        addHobby(newFriendsHobbies, "Adelina", "Netball");

        System.out.println(newFriendsHobbies);

        newFriendsHobbies.forEach((k, list) -> {
            friendsHobbies.merge(k, list, (oldVal, newVal)->{
                List<String> combined = new ArrayList<>(oldVal);
                combined.addAll(newVal);
                return combined;
            });
        });

        System.out.println(friendsHobbies);

    }

    private static void addHobby(Map<String, List<String>> friendsHobbies, String friend, String hobby){
        friendsHobbies.computeIfAbsent(friend, k -> new ArrayList<>()).add(hobby);
    }

}
